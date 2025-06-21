<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Liste des pays</h1>
<a href="views/template/template.jsp?content=../addCountry.jsp" class="btn">Ajouter un pays</a>

<table id="mainTable" >
    <tr>
        <th>ID</th>
        <th>Label</th>
        <th>Code ISO</th>
        <th>IsActive</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="c" items="${countries}">
        <tr>
            <td>${c.id}</td>
            <td>${c.countryName}</td>
            <td>${c.isoAlpha3}</td>
            <td>${c.active}</td>
            <td>
                <a href="#" onclick="deleteCountry(${c.id}); return false;">Supprimer</a>
                <a href="countries?idCountry=${c.id}">Détails</a>
            </td>
        </tr>
    </c:forEach>
</table>


