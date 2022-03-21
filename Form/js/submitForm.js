
const form = document.getElementById("form");
form.addEventListener("submit",(e) =>{
    e.preventDefault();
    var from = document.getElementById("from").value;
    var to = document.getElementById("to").value;
    var quantity = document.getElementById("quantity").value;

    console.log(from + to + quantity )
    
    fetch(`http://localhost:8100/currency-exchange/from/${from}/to/${to}/${quantity}`
  
    )
    .then(response=> response.json())
    .then(json=> responseData(json))
    .catch((err) => {console.log("Request Failed", err)})
});
function responseData(response){
console.log(response.totalCalculatedAmount)
    var dataSection = document.getElementById("responseData");
    dataSection.innerHTML='';

            var idTag = `
            <p class="h2">${response.totalCalculatedAmount}</p>
            `
          
    
         dataSection.innerHTML += idTag
            console.log("hello")
}
