package basics.oops

// Sealed class
// we cannot create object for sealed class
// subclasses must be declared in same file
// if we create new subclass it should be updated in when statement or else it will throw an error
sealed class Shape

data class Circle(var radius: Double): Shape()

class Square(var side: Double): Shape()

class Rectangle(var length: Double, var breadth: Double): Shape()


fun main() {

    var circle = Circle(15.0)
    var square = Square(12.5)
    var rectangle = Rectangle(5.0, 10.0)

    checkShape(circle)

}

fun checkShape(shape: Shape){
    when(shape){
        is Circle -> println("circle area = ${3.14 * shape.radius * shape.radius}")
        is Rectangle -> println("rectangle area = ${shape.length * shape.breadth}")
        is Square -> println("square area = ${shape.side * shape.side}")
    }
}