<form action="${pageContext.request.contextPath}/countries" method="post">

    <label for="nameCountry">Nom du Pays : </label>
    <input type="text" id="nameCountry" name="nameCountry" maxlength="255">

    <label for="iso3Country">ISO3 du Pays : </label>
    <input type="text" id="isoCountry" name="isoCountry" maxlength="3">
    <button  type="submit">Envoyer</button>
</form>
