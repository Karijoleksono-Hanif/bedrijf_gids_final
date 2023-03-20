//
//
// var form = document.getElementById('form-delete')
//
// form.addEventListener('submit', function(deleteBedrijf){
//     deleteBedrijf.preventDefault()
//
//     function deleteBedrijf(id){
//         $.ajax({
//             url: 'http://localhost:8080/bedrijfgids_war/api/bedrijven/' + id,
//             method: 'DELETE',
//             success: function () {
//                 alert('bedrijf has been deleted');
//             },
//             error: function (error){
//                 alert(error);
//             }
//         })
//     }})

//
//
//     $(document).ready(function() {
//     $("#delete-btn").click(function() {
//         $("#delete-form").submit();
//     });
//
//     $("#delete-form").submit(function(event) {
//     event.preventDefault();
//     var bedrijfId = $("#bedrijf-id").val();
//     deleteBedrijf(bedrijfId);
// });
//
//     function deleteBedrijf(id) {
//     $.ajax({
//     url: 'http://localhost:8080/bedrijfgids_war/api/bedrijven/' + id,
//     method: 'DELETE',
//     success: function() {
//     alert('Bedrijf has been deleted');
// },
//     error: function(error) {
//     alert(error);
// }
// });
// }
// });

$(document).ready(function() {
    $("#delete-btn").click(function() {
        var bedrijfId = $("#bedrijf-id").val();
        deleteBedrijf(bedrijfId);
    });

    $("#bedrijf-id").keypress(function(event) {
        if (event.keyCode === 13) { // Enter key code
            event.preventDefault();
            var bedrijfId = $("#bedrijf-id").val();
            deleteBedrijf(bedrijfId);
        }
    });

    function deleteBedrijf(id) {
        $.ajax({
            url: 'http://localhost:8080/bedrijfgids_war/api/bedrijven/' + id,
            method: 'DELETE',
            success: function() {
                alert('Bedrijf has been deleted');
            },
            error: function(error) {
                alert(error);
            }
        });
    }
});
