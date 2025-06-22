<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<nav id="mainNav">
    <div id="logoContainer">
        <img id="logo" src="${pageContext.request.contextPath}/Images/logoCentreSportif.jpg" alt="Logo" />
    </div>
    <ul id="navLinks">
        <li><a href="${pageContext.request.contextPath}/index.jsp">Accueil</a></li>
        <li><a href="${pageContext.request.contextPath}/countries">Pays</a></li>
        <li><a href="${pageContext.request.contextPath}/contact.jsp">Contact</a></li>


        <c:choose>
            <c:when test="${sessionScope.role == 'ADMIN'}">

                <li><a href="${pageContext.request.contextPath}/login?action=logout">Se déconnecter</a></li>
            </c:when>

            <c:when test="${sessionScope.role == 'USER'}">
                <li><a href="${pageContext.request.contextPath}/login?action=logout">Se déconnecter</a></li>
            </c:when>

            <c:otherwise>
                <li><a href="${pageContext.request.contextPath}/login">Se connecter</a></li>
            </c:otherwise>
        </c:choose>


        <!-- Ajoute d'autres liens ici -->
    </ul>
</nav>

