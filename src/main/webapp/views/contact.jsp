<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="template/templateHeader.jsp" />

<h1 id="contactTitle">Contactez-nous</h1>

<form id="contactForm" action="${pageContext.request.contextPath}/contact" method="post">
    <div class="form-group">
        <label for="firstName">Prénom :</label>
        <input type="text" id="firstName" name="firstName" required />
    </div>

    <div class="form-group">
        <label for="lastName">Nom :</label>
        <input type="text" id="lastName" name="lastName" required />
    </div>

    <div class="form-group">
        <label for="email">Email :</label>
        <input type="email" id="email" name="email" required />
    </div>

    <div class="form-group">
        <label for="message">Message :</label>
        <textarea id="message" name="message" rows="5" required></textarea>
    </div>

    <button type="submit">Envoyer</button>
</form>

<jsp:include page="template/templateFooter.jsp" />
