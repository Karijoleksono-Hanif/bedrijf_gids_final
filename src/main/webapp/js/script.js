

const apiUrl = "http://localhost:8080/bedrijfgids_war/api/bedrijven/getAll";
fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
        const tableBody = document.querySelector("#table tbody");

        data.forEach(row => {
            const tr = document.createElement("tr");
            tr.innerHTML = `
        <td>${row.id}</td>
        <td>${row.bedrijf_naam}</td>
        <td>${row.filiaal}</td>
        <td>${row.filiaal_adress}</td>
        <td>${row.email_adress}</td>
        <td>${row.telefoon_nummer}</td>
      `;
            tableBody.appendChild(tr);
        });
    })
    .catch(error => console.error(error));

