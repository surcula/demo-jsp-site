<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${sessionScope.role == 'ADMIN'}">
    <nav id="adminNav">
        <ul id="adminNavLinks">
            <li><a href="${pageContext.request.contextPath}/halls">Halls</a></li>
            <li><a href="${pageContext.request.contextPath}/sports">Sports</a></li>
            <li><a href="${pageContext.request.contextPath}/countries">Pays</a></li>
            <li><a href="${pageContext.request.contextPath}/users">Utilisateurs</a></li>
            <li><a href="${pageContext.request.contextPath}/login?action=logout">Se déconnecter</a></li>
        </ul>
    </nav>
</c:if>

