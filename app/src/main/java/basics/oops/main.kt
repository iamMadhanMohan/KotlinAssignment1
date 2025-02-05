package basics.oops

/*
*  Access Modifiers / Scope Modifiers
*  there are 4 types of modifiers
*  1. public -> access every where i.e all packages
*  2. private -> access to only current class
*  3. internal -> access to the current package
*  4. protected -> access to current class and subclasses
* */

fun main() {

    var employee1 = Employee("kevin" , 2345.23)
    println(employee1)
    println(employee1.toString())

    var employee2 = employee1.copy()

    println(employee2) // will be same as employee1

    println(employee1.component1()) // used to print each property
    println(employee1.component2())
}

// A class with 2 private properties and 1 public method
public class User(private var name: String, private var age: Int){

    public fun welcomeMessage(){
        println("welcome $name")
    }
}

// Data class - used to store only the data
// inbuilt methods - copy(), equals(), hashcode(), toString()
data class Employee( var name: String, var salary: Double)



