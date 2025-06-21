package services;

import entities.Country;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class CountryService {
    private EntityManagerFactory emf;
     private EntityManager em;

    public CountryService( EntityManagerFactory emf ) {
        this.emf = emf;
    }

    /**
     * list of all Countries
     * @return
     */
    public List<Country> GetAll(){
        try{
            em = emf.createEntityManager();
            return em.createQuery("select c from Country c", Country.class).getResultList();
        }
        finally {
            em.close();
        }
    }

    public Country GetOne(int id) {
        try {
            em = emf.createEntityManager();
            return em.find(Country.class, id);
        }
        finally {
            em.close();
        }
    }

    /**
     * country by id
     *
     * @param id L'identifiant du pays.
     * @return L'objet {@link Country} correspondant, ou null s'il n'existe pas.
     */
    public Country GetById(int id){
        try{
            em = emf.createEntityManager();
            return em.find(Country.class, id);
        }
        finally {
            em.close();
        }
    }

    /**
     * Delete country (isActive is changed)
     * @param country
     * @param em
     */
    public void RemoveById(Country country, EntityManager em) {
        country.setActive(false);
        em.merge(country);
    }

    /**
     * Create country
     * @param country
     * @param em
     */
    public void Add(Country country, EntityManager em) {
        em.persist(country);

    }

    /**
     * Update country
     * @param country
     * @param em
     */
    public void Update(Country country, EntityManager em) {

        em.merge(country
        );
    }

}
