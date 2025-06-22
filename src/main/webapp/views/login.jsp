<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 6/22/2025
  Time: 2:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2>Connexion</h2>

<form method="post" action="${pageContext.request.contextPath}/login">
    <label>ID Utilisateur :</label>
    <input type="text" name="userId" required />
    <br/>
    <label>Rôle :</label>
    <select name="role">
        <option value="ADMIN">ADMIN</option>
        <option value="USER">USER</option>
    </select>
    <br/>
    <input type="submit" value="Se connecter" />
</form>

<c:if test="${not empty error}">
    <p style="color:red;">${error}</p>
</c:if>
