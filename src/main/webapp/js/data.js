function submitBedrijfModal() {
    var form = document.getElementById("add-bedrijf-modal");

    form.addEventListener('submit', function (e) {
        e.preventDefault();
        submitBedrijfModal();
    });

    var bedrijf_naam = document.getElementById("bedrijf_naam").value;
    var filiaal = document.getElementById("filiaal").value;
    var filiaal_adress = document.getElementById("filiaal_adress").value;
    var email_adress = document.getElementById("email_adress").value;
    var telefoon_nummer = document.getElementById("telefoon_nummer").value;

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/bedrijfgids_war/api/bedrijven/addBedrijf");
    xhr.setRequestHeader("Content-Type", "application/json charset=utf-8");

    xhr.onload = function () {
        if (xhr.status == 200) {
            alert("Bedrijf added successfully!");
            form.reset();
        } else {
            alert("Error adding bedrijf");
        }
    };

    xhr.send(JSON.stringify({
        "bedrijf_naam": bedrijf_naam,
        "filiaal": filiaal,
        "filiaal_adress": filiaal_adress,
        "email_adress": email_adress,
        "telefoon_nummer": telefoon_nummer,
    }));

}

// var form = document.getElementById("add-bedrijf-modal");






//
//
//
// function submitBedrijfModal() {
//     var form = document.getElementById("add-bedrijf-modal");
//
//     form.addEventListener('submit', function (e){
//
//         e.preventDefault()
//         submitBedrijfModal();
//
//         var bedrijf_naam = document.getElementById("bedrijf_naam").value;
//         var filiaal = document.getElementById("filiaal").value;
//         var filiaal_adress = document.getElementById("filiaal_adress").value;
//         var email_adress = document.getElementById("email_adress").value;
//         var telefoon_nummer = document.getElementById("telefoon_nummer").value;
//
//         fetch("http://localhost:8080/bedrijfgids_war/api/bedrijven/addBedrijf",{
//             method: 'POST',
//             body: JSON.stringify({
//                 "bedrijf_naam": bedrijf_naam,
//                 "filiaal": filiaal,
//                 "filiaal_adress": filiaal_adress,
//                 "email_adress": email_adress,
//                 "telefoon_nummer": telefoon_nummer,
//             }),
//
//             headers: {
//                 "Content-Type": "application/json; charset=UTF-8"
//             }
//         })
//             .then(function (response){
//                 return response.json()
//             })
//             .then(function (data){
//                 console.log(data)
//             })
//     });
// }