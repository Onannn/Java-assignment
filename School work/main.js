/*
let name = "Ire";
console.log("Output");
let y = 10 ** 15;
console.log(y);
console.log(typeof null);
console.log(typeof undefined);
console.log(null === undefined);
console.log(null == undefined);
console.log("Diff between const and let");
console.log("One can not be changed");

let amount = 500;
let discount = amount - (amount * 0.5);
console.log(discount);

let sale = 1000000000;
if (sale > 5000) {
    let Max = sale - ( sale * 0.9);
    alert(Max);
} else {
    let Max = sale - ( sale * 0.5);
    alert(Max);
}

for (let i = 0; i < 15; i++) {
    console.log(i);
}
    */

let temperature = 20;

if (temperature < 10 ) {
    console.log("It's cold,wear a jacket and a hat");
} else if (temperature >= 10 && temperature <= 20) {
    console.log("Cool,wear a jacket");
} else if (temperature > 20 && temperature <= 30) {
    console.log("Warm,a t-shirt should be fine");
} else if (temperature > 30) {
    console.log("It's hot,wear a light clothing");
} else {
    console.log("Invalid input");
}