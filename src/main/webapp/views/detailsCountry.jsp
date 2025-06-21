<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Détails du pays</h2>

<c:if test="${not empty countries}">
    <table>
        <tr>
            <th>ID</th>
            <td>${countries.id}</td>
        </tr>
        <tr>
            <th>Nom</th>
            <td>${countries.countryName}</td>
        </tr>
        <tr>
            <th>Code ISO</th>
            <td>${countries.isoAlpha3}</td>
        </tr>
        <tr>
            <th>Actif</th>
            <td><c:choose>
                <c:when test="${countries.active}">Oui</c:when>
                <c:otherwise>Non</c:otherwise>
            </c:choose></td>
        </tr>
        <tr>
            <a href="${pageContext.request.contextPath}/countries?edit=${countries.id}" class="btn">Modifier</a>

        </tr>
    </table>

    <br>
    <a href="countries">Retour à la liste</a>
</c:if>

<c:if test="${empty countries}">
    <p>Pays non trouvé.</p>
    <a href="${pageContext.request.contextPath}/countries">Retour à la liste</a>
</c:if>

