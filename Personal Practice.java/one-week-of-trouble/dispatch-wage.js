function calculateWage(successfulDeliveries) {
    let rate;

    if (successfulDeliveries < 50) {
        rate = 160;
    } else if (successfulDeliveries < 60) {
        rate = 200;
    } else if (successfulDeliveries < 70) {
        rate = 250;
    } else {
        rate = 500;
    }

    return (successfulDeliveries * rate) + 5000;
}

console.log(calculateWage(25)); 
console.log(calculateWage(55)); 
console.log(calculateWage(65));
console.log(calculateWage(80)); 