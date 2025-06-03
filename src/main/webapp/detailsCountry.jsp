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
            <td>${countries.label}</td>
        </tr>
        <tr>
            <th>Code ISO</th>
            <td>${countries.isoAlpha3}</td>
        </tr>
        <tr>
            <th>Actif</th>
            <td><c:choose>
                <c:when test="${countries.isActive}">Oui</c:when>
                <c:otherwise>Non</c:otherwise>
            </c:choose></td>
        </tr>
    </table>

    <br>
    <a href="countries">Retour à la liste</a>
</c:if>

<c:if test="${empty countries}">
    <p>Pays non trouvé.</p>
    <a href="${pageContext.request.contextPath}/countries">Retour à la liste</a>
</c:if>

