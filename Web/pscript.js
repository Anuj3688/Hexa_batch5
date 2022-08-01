let tCost  = 0;
const products = [];
function addPro(cost,number) {
    console.log("Product added to list with no "+number);
    console.log("The cost is "+cost);
    tCost+=cost;
    console.log(tCost);
    document.getElementById("total").innerText = ""+tCost+" Rs";
    products.push("Product"+number+" with cost "+cost+" Rs");
    document.getElementById("products").innerText=products.join("\n");
    var id1 = "p"+number; 
    document.getElementById(id1).style.backgroundColor="#fb5607";
}

function pay() {
    var j = document.getElementById("total").innerText;
    
    window.alert("Bill Generated! \nYou need to pay "+j);
}