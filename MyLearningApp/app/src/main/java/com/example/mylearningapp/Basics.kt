package com.example.mylearningapp

import android.icu.text.AlphabeticIndex.ImmutableIndex
import android.widget.Toast

data class CoffeeDetails(val sugarCount:Int,val name:String,val size:String,val creamAmount:Int)


fun main(){

//    DATA TYPE
//    ---------VAL AND VAR-----------
//    println("Hello My Lovely App!!!")
//    val fixedNumber = 12
//    //Cannot reassign FixedNumber=11
//    var canChangedNumber = 23
//    println(canChangedNumber)
//    canChangedNumber =2
//
//    --------PRINT AND PRINTLN-------
//    //Print and println one has /n
//    println(fixedNumber)
//    println(canChangedNumber)
//
//    ------LONG,BYTE,FLOAT,DOUBLE------
//    //kotlin auto determine data type based on first initialize
//    //after that you put large number it will be error (def:int)
//    val notBigNumber :Byte =17 //Byte
//    val longNumber = 1L //Long
//    val pi = 3.1423433f
//    println(notBigNumber)
//    println(longNumber)
//    println(pi)

//    -----------BOOLEAN----------
//    var age :UByte = 35u
//    println(age)
//
//    val trueWord = true
//    val wrongWord : Boolean = false
//    println(trueWord || wrongWord)
//    println(wrongWord && trueWord)
//    println(!wrongWord)

//    ---------CHAR AND STRING-------
//    val charWord = 'a'
//    val specialWord = '\u00A9'
//    val escapeWord = '\\'
//    println(specialWord)
//    println(escapeWord)
//
//    val stringWord = "Stevanie"
//    println(stringWord.lowercase())
//    print(stringWord + " Lim")


//    -----------IF ELSE & readln() and toInt()-------------
//    print("Enter Your Age : ")
//    var age = 12
//    var inputAge = readln().toInt()
//
//    if(inputAge >= 18 && inputAge <= 60){
//        println("Go Adventure")
//    }
//    else{
//        println("Still need protection")
//    }

//      -------WHEN-------------
//    var count =0
//    while (count !=4){
//        count++
//        println("haha hihi $count")
//        if(count==5)
//            break
//    }

//    ------------MAKE COFFEE--------------
//    print("What Is Your Name? ")
//    var userName = readln()
//    print("How many amount of sugar cube do you wanna add to the coffee? ")
//    var sugar  = readln()
//    while(sugar.toIntOrNull() == null || sugar.toInt()<0) {
//        print("How many amount of sugar cube do you wanna add to the coffee? ")
//        sugar = readln()
//    }
//    println(makeCoffee(sugar.toInt(),userName))


//    ------------DATA ClASS----------------
//    val CoffeeForMe = CoffeeDetails(0,"Denis","XL",2)
//    println(makeCoffee(CoffeeForMe))

////    ---------------CLASSES--------------
//    var daisy = Dog("Daisy","Husky")
//    println("${daisy.name} is a ${daisy.breed} and are ${daisy.age} years old")
//
//    var myBook = BookClass()
//    println("The Author is ${myBook.author} publish ${myBook.title} in ${myBook.yearPublished}")
//
//    var customBook = BookClass("Maincraft","Nickelodion",1000)
//    println("The Author is ${customBook.author} publish ${customBook.title} in ${customBook.yearPublished}")

//    ---------------LIST---------------------
//    Cannot be changed
//    val saltythings = listOf("Chips","Gorengan","French Fries")
//////    Mutable can be changes
//    var sweetThings = mutableListOf("cake","cookie","brownies")
//    sweetThings.add("Frosting")
//    sweetThings.add(2,"Jelly")
//    sweetThings.removeAt(0)
//    sweetThings.remove("cookie")
//    sweetThings[2] = "Sugar"
//    sweetThings.set(0,"Flour")
//    sweetThings.removeLast()
//    println(sweetThings)
//    println(sweetThings[1])
//    val Exist = saltythings.contains("Chips")
//    if(Exist){
//        println("DOne")
//    }
//    for(item in sweetThings){
//        println(item)
//        if(item == "Flour")
//            break
//    }
//    for(item in 0 until sweetThings.size){
//        println("item ${sweetThings[item]} are in index of $item")
//    }

    //BUTTON AND TOAST
//    val context = LocalContext.current
//    Button(onClick = { Toast
//        .makeText(context,
//            "Thanks for Clicking!",
//            Toast.LENGTH_LONG).show()}) {
//        Text("Convert")
//    }

//Padding modifier offer simplicity perfect for adding space
//            around individual elements but lack reusability for
//                consistant spacing across multiple platform
//
//Spacer Elements terbalek


}

//--------------Function-------------

//fun makeCoffee(coffeeDetails: CoffeeDetails):String{
//    println("hello ${coffeeDetails.name}, Proccedding to make a coffee...")
//    println("Grind Coffee")
//    println("Added Hot water")
//    if (coffeeDetails.sugarCount == 1)
//        println("Added ${coffeeDetails.sugarCount} cube into the coffee")
//    else if (coffeeDetails.sugarCount == 0)
//        println("No Added Sugar")
//    else
//        println("Added ${coffeeDetails.sugarCount} cubes into the coffee")
//    val struck = "Hello ${coffeeDetails.name}, With ${coffeeDetails.sugarCount} cube of sugar, you're Coffee ready"
//    return struck
//}



















