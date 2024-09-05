package com.example.bankaccountprogram

class BackAccount (var AccountName : String, var balance : Double){

    private val history = mutableListOf<String>()

    fun deposit(amount:Double){
        history.add("$AccountName Deposit of $amount")
        balance+=amount
    }

    fun withdraw(amount:Double){
        balance-=amount
        history.add("$AccountName Withdraw of $amount")
    }

    fun displayHistory(){
        println("Transaction History of $AccountName")
        for(item in history)
            println(item)
    }

    fun displayBalance(){
        println("The Balance of $AccountName are :$balance ")
    }

}