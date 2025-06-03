function deleteCountry(id) {
    if (confirm("Supprimer ce pays ?")) {
        fetch("countries?id=" + id, {
            method: "DELETE"
        })
            .then(response => {
                if (response.ok) {
                    window.location.reload();
                } else {
                    alert("Échec de la suppression");
                }
            });
    }
}


