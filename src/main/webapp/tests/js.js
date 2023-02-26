
fetch('https://fakestoreapi.com/products')
.then(res=>res.json())
.then(data=>{
    console.log('data',data);

    displayProducts(data);
})

async function displayProducts(products) {
let html = '';
await products.forEach((product, index, array) => {
    html += '<tr>';
    html += `<td>
                <img src="${product.image}" style="width:50px;height:50px;border-radius:50%" alt="">
             </td>
            <td>${product.title}</td>
            <td>${product.category}</td>
            <td>${product.price}$</td>`;
    html += '</tr>';
})
document.querySelector('tbody').innerHTML = await html;
// 
$(document).ready(function () {
    $('#example').DataTable();
});
}