package com.example.bankaccountprogram

fun main() {
    val StevAccount = BackAccount("Stevanie",999.99)
    StevAccount.deposit(999.99)
    StevAccount.withdraw(99.99)
    StevAccount.displayHistory()
    StevAccount.displayBalance()

}