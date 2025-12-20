"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
exports.add = add;
function add() {
    var a = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        a[_i] = arguments[_i];
    }
    return a.reduce(function (x, y) { return (x + y); });
}
var Student = /** @class */ (function () {
    function Student(std) {
        var _this = this;
        //display(){
        //console.log(`${this.id}...${this.name}....${this.age}`)
        //}
        //good practice to use lambda expressions
        this.display = function () {
            console.log("".concat(_this.s1.id, "....").concat(_this.s1.name, "....").concat(_this.s1.age));
        };
        //this.id=std.id;
        //this.name=std.name;
        //this.age=std.age;
        this.s1 = std;
    }
    return Student;
}());
exports.Student = Student;
