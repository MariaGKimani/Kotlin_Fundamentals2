import kotlin.random.Random

fun main(){
    backslashp()
    slashes()
    sign()
    types()
    println("Accessing URL $URL_LINK")
//    user()
//    convert()
    random()
//    greeting()
    nums()
    birthYear()
    implicit()
    explicit()
    input()
    number()

}
//create an immutable variable and print it to the console
//outcome should be My cat's name is "Fluffy"
fun backslashp(){
    val x = "My cat\'s name is \"Fluffy\""
    println(x)
}
//create a variable and print it to the console
//the outcome shoulld be  Two types of slashes:\ and/
//the outcome of the 2nd variable should be http://www.google.com
fun slashes(){
    var c = "There are two types of slashes: \\ and /"
    println(c)
    println(c.decapitalize())
    println(c.get(0))
    println(c[4])
    println(c.substring(2))
    println(c.substring(2,20))

    var d = "http://www.google.com"
    println(d)
    println(d.length)


}
fun sign(){
    val dogName = "Teddy"
    println("My dog's name is $dogName")
    //curly braces are not important unless it's an expression
    println("My dog's name is ${dogName}")
    println("I have ${1 + 1} cars")
    println("I have ${25 / 5} cars")
    println("I have ${22 * 4} cars")
    println("I have ${100 % 10} cars")
}

fun types(){
    //Extract the string "car"from this variable and print it
    var myCar = "My car won't start"
    println(myCar.substring(3,6))
//A client has purchased a number of products that have a certain price
//Print out the total amount that the clients need to pay
     val client ="Mary"
    val  products = 3
    val  price =30
    println("$client your total is ${products*price}")
}
const val URL_LINK ="google.com"


/////USER INPUT///////////////////////////USER INPUT/////////////////////USER INPUT///////////////////////////USER INPUT/////////////////////
fun user(){
    println("Input something:")
    val userInput = readLine()
    //to avoid it being empty or returning a null we use ?:""
    // val userInput2 = readLine()?:""
    println("You wrote: $userInput")
}
///////Converting string to a number
fun convert(){
    println("Input a number:")
    val userInput3 = readLine()?:""
    println("Double is: ${userInput3.toInt() * 2}")

    println("Input a text:")
    val userInput4 = readLine()?:""
    println("You wrote: ${userInput4.toString()}")

}

/////GENERATING A RANDOM N.O///////////////////////////GENERATING A RANDOM N.O/////////////////////GENERATING A RANDOM N.O////////////////////////
fun random(){
    println(Random.nextInt())
    println(Random.nextInt(10,100))
    println(Random.nextInt(100))
    println(Random.nextInt(10))
    println(Random.nextInt(10,20))

    println(Random.nextDouble(38.5))
    println(Random.nextDouble(38.5,90.7))

    println(Random.nextFloat())
}

//Write a program that asks the user for their name
// and prints out a personalized greeting
fun greeting(){
    println("Enter Name: ")
    val userInput6 = readLine()?:""
    println("Goodmorning $userInput6 ,How are you?")

}
//Write a program that asks the user for a number
// and prints out that number multiplied by 5
fun nums(){
    println("Enter age: ")
    val userAge = readLine()?:""
    println("Multiplied by 5 is ${userAge.toInt() * 5}")
}


//Ask the user for a number,and read the input
fun number(){
    println("Enter a number:")
    val randomNum = readLine()?:""
    val randomNum1 =randomNum.toString()
    println("your n.o is ${randomNum}")
    println(randomNum1:: class.java)
}
//Ask the user to input a number of type double
//Multiply it by pi
//print the type of the resulting variable
//print result
var pi = 4.14159
fun input(){
    println("enter a Double")
    var c = readLine()?:""
    var num1 =c.toDouble()
    val pi = 3.1415
    var result = num1* pi
    println("your n.o is $result")

}


//Create a program that asks a user's birth year.
//Then prints out the user's estimated age
//(currentYear -birthYear)
fun birthYear(){
    println("Enter birthYear:")
    val userBirth = readLine()?:""
    val year = userBirth.toInt()
    val age  = 2023 - year
    println("Your age  is ${age}")
}
fun implicit(){
    val cats =3
    println(cats::class.java)
    val price = 14.99
    println(price::class.java)
}
fun explicit(){
    val dogs: Byte =5
    println(dogs::class.java)
}
fun transform(){
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)

}
fun conversion(){
    val cats = 3
    val catsString = cats.toString()
    println(catsString::class.java)
    val pi =3.1415
    println(pi::class.java)
    val piString = pi.toString()
    println(piString::class.java)

}
