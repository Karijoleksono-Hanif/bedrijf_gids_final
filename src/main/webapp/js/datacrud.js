var form = document.getElementById('form')

form.addEventListener('submit', function(e){
    e.preventDefault()

    var bedrijf_naam = document.getElementById("bedrijf_naam").value;
    var filiaal = document.getElementById("filiaal").value;
    var filiaal_adress = document.getElementById("filiaal_adress").value;
    var email_adress = document.getElementById("email_adress").value;
    var telefoon_nummer = document.getElementById("telefoon_nummer").value;

    fetch("http://localhost:8080/bedrijfgids_war/api/bedrijven/addBedrijf",{
        method:'POST',
        body:JSON.stringify({
            "bedrijf_naam": bedrijf_naam,
            "filiaal": filiaal,
            "filiaal_adress": filiaal_adress,
            "email_adress": email_adress,
            "telefoon_nummer": telefoon_nummer,
        }),
        headers:{
            "Content-Type":"application/json; charset=UTF-8"
        }
    })
        .then(function(response){
            return response.json()
        })
        .then(function(data){
            console.log(data)
            var results = document.getElementById('results')
        })
})
