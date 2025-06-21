<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="${pageContext.request.contextPath}/countries" method="post">

    <c:if test="${not empty country}">
        <input type="hidden" name="id" value="${country.id}" />
    </c:if>
    <p>
    <label for="nameCountry">Nom du Pays : </label>
    <input type="text" id="nameCountry" name="nameCountry" maxlength="255" value="${country.countryName}">
    </p>
    <p>
    <label for="iso3Country">ISO3 du Pays : </label>
    <input type="text" id="isoCountry" name="isoCountry" maxlength="3" value="${country.isoAlpha3}">
    </p>
    <button type="submit">Envoyer</button>
</form>
