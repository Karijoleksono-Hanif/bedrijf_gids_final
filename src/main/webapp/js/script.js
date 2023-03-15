fetch("http://localhost:8080/bedrijfgids_war/api/bedrijven").then((data)=>{
    // console.log(data);
    return data.json();
}).then((objectData)=>{
    console.log(objectData[0].title);
    let tableData="";
    objectData.map((values)=>{
        tableData+=
        `<tr>
            <td>${values.id}</td>
            <td>${values.bedrijf_naam}</td>
            <td>${values.email_adress}</td>
        </tr>`;
    });
    document.getElementById("table_body").innerHTML=tableData;
}).catch((err)=>{
    console.log(err);
})

