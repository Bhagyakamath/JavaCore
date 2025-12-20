var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var s1 = "Amrutha";
console.log(s1);
console.log("Hello ".concat(s1));
var arr = [1, 2, 3];
console.log(arr[0]);
var a = 10;
var b = 20;
var c = 30;
var d;
console.log(d);
function f1(n) {
    for (var i = 0; i < n; i++) {
        console.log(i);
    }
    return i;
}
console.log(f1(5));
var a1 = {
    id: 10,
    fname: "Aditi"
};
console.log("".concat(a1.id, ".... ").concat(a1.fname));
var a2 = __assign(__assign({}, a1), { city: "Manipal" });
console.log(a2.city);
//Rest operator
function f2() {
    var a3 = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        a3[_i] = arguments[_i];
    }
    a3.forEach(function (el) {
        console.log("".concat(el.id, "...").concat(el.fname, "...").concat(el.city));
    });
}
f2(a2, a2, { id: 3, fname: "Naina", city: "Bangalore" });
//write a function to receive individual integer values, apply stream and filters to display only even numbers
var f3 = function () {
    var numbers = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        numbers[_i] = arguments[_i];
    }
    numbers.filter(function (el) { return (el % 2 === 0); }).forEach(function (el) {
        console.log(el);
    });
};
f3(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//Multiplication Table
function table() {
    var inputElement = document.getElementById("num");
    var outputElement = document.getElementById("output");
    if (!inputElement || !outputElement) {
        console.error("Required DOM elements not found");
        return;
    }
    var n = Number(inputElement.value);
    var result = "<ul>";
    for (var i = 1; i <= 10; i++) {
        result += "<li>".concat(n, " x ").concat(i, " =").concat(n * i);
    }
    result += "</ul>";
    outputElement.innerHTML = result;
}
