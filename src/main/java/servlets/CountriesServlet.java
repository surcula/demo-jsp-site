package servlets;

import services.CountryService;
import entities.Country;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "countries", value = "/countries")
public class CountriesServlet extends HttpServlet {

    private EntityManagerFactory emf;
    private CountryService countryService;

    @Override
    public void init() {
        emf = Persistence.createEntityManagerFactory("demo1");
        countryService = new CountryService(emf);
    }

    /**
     * getAll or getOne countries
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String idParam = request.getParameter("idCountry");
        String editParam = request.getParameter("edit");


        if(editParam != null){
            Country country = countryService.GetOne(Integer.parseInt(editParam));
            request.setAttribute("country", country);
            request.setAttribute("content", "/views/addCountry.jsp");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template/template.jsp");
            dispatcher.forward(request, response);
        }
        if (idParam != null){
            Country countries = countryService.GetOne(Integer.parseInt(idParam));
            request.setAttribute("countries", countries);
            request.setAttribute("content","/views/detailsCountry.jsp");
            // Forward vers la JSP
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template/template.jsp");
            dispatcher.forward(request, response);
        }else{
            List<Country> countries = countryService.GetAll();
            request.setAttribute("countries", countries);
            request.setAttribute("content","/views/listCountries.jsp");
            // Forward vers la JSP
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template/template.jsp");
            dispatcher.forward(request, response);
        }

    }

    /**
     * remove country by id
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        EntityManager em = emf.createEntityManager();
        int countryId = Integer.parseInt(request.getParameter("id"));
        if(countryId != 0) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();
                Country country = countryService.GetById(countryId);
                countryService.RemoveById(country, em);
                transaction.commit();

            }
            finally {
                if(transaction.isActive()) {
                    transaction.rollback();
                }
                em.close();
            }
        }
    }

    /**
     * create or modify country
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String idParam = request.getParameter("id");
        String nameCountry = request.getParameter("nameCountry");
        String isoCountry = request.getParameter("isoCountry");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            if(idParam == null) {
                countryService.Add( new Country(
                        0,
                        nameCountry,
                        isoCountry
                ), em);
                transaction.commit();

            }else{
                Country country = countryService.GetById(Integer.parseInt(idParam));
                country.setCountryName(nameCountry);
                country.setIsoAlpha3(isoCountry);
                countryService.Update(country, em);
                transaction.commit();
            }
        }
        finally{
            if(transaction.isActive()){
                transaction.rollback();
            }
            em.close();

        }
        response.sendRedirect(request.getContextPath() + "/countries");

}

}
