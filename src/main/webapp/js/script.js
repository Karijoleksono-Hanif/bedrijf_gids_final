// fetch("http://localhost:8080/bedrijfgids_war/api/bedrijven/getAll").then((data)=>{
//     // console.log(data);
//     return data.json();
// }).then((objectData)=>{
//     console.log(objectData[0].title);
//     let tableData="";
//     objectData.map((values)=>{
//         tableData+=
//         `<tr>
//             <td>${values.id}</td>
//             <td>${values.bedrijf_naam}</td>
//             <td>${values.email_adress}</td>
//         </tr>`;
//     });
//     document.getElementById("table_body").innerHTML=tableData;
// }).catch((err)=>{
//     console.log(err);
// })
//

fetch('http://localhost:8080/bedrijfgids_war/api/bedrijven/getAll')
    .then(response => response.json())
    .then(data => {
        const table = document.querySelector('#table tbody');

        data.forEach(row => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
						<td>${row.id}</td>
						<td>${row.bedrijf_naam}</td>
						<td>${row.email_adress}</td>
					`;
            table.appendChild(tr);
        });
    })
    .catch(error => console.error(error));