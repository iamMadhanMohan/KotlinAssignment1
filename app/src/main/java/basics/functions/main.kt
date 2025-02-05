package basics.functions


fun main() {

    println(greaterValue(12, 32))

    //  2. named arguments - passing the values along with the arguments
    println(greaterValue( b = 11, c = 22, a = 12))

    // 3. Extension function created for a class Circle
    fun Circle.perimeter(): Double{
        return 2 * 3.14 * radius;
    }

    // create object for class Circle
    val circle = Circle(2.5);

    println("Area of the circle is ${circle.area()}")

    // invoking extension function
    println("Perimeter of the circle is ${circle.perimeter()}")

}

 // 1. default values - c argument have the default value 0 if no value is passed at runtime
fun greaterValue(a: Int, b: Int, c: Int = 0): Int{
    if(a > b && a > c){
        return a
    }else if( b > c ){
        return b
    }else{
        return c
    }
}

// 3. extension functions
class Circle (val radius: Double){
    // member function of class
    fun area(): Double{
        return 3.14 * radius * radius;
    }
}
