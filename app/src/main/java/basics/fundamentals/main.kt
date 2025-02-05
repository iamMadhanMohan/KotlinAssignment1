package basics.fundamentals


fun main() {
//    >>>> How to declare variables in Kotlin? >>>>

    /*
    *  we declare variables using the below keywords
    *  1. var (mutable)
    *  2. val (immutable)
    * */

    var a = 23
    a = 48
    a = 65 // we can change value as many times as we want

    val b = 33
//    b = 75  // it will throw an error

//    >>>> Data types >>>>

    /*
    * the following are the different types of datatypes used to store different values
    *
    *  Byte
    *  Short
    *  Int
    *  Long
    *
    *  Float
    *  Double
    *
    *  Char
    *  String
    *  Arrays
    * */


    var c: Byte = 3
    var d: Short = 12
    var e: Int = 324
    var f: Long
    f = 2442974L

    var g: Float = 12.324f
    var h: Double = 422.4221324

    var i: Char = 'a'
    var j: String = "android"

//   >>>> Nullable types / handling null in kotlin >>>>

    var k: String? = "atlanta"
    k = null // we can assign null to the variable k because of ? operator


    /*
     * we can use the below operators to handle the null values
     *  1. safe call operator (?.)
     *  2. elvis operator (?:)
     *  3. let function
     *  4. not null assertion operator (!!)
     */

    println(k?.length) // it will throw an error if we not use the ?. operator

    val k_length = k?.length ?: 0 // it will return the length if it is not null else it return 0
    println(k_length)

    k?.let {
        println("the length of k is ${k.length}") // this block will execute of the k is not null
    }

//    var k_length_2 = k!!.length // it will throw a null pointer exception

}