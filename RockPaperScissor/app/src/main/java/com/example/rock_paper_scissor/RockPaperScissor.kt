package com.example.rock_paper_scissor

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Choose rock, paper, scissor!")
    while (playerChoice != "rock" && playerChoice !="paper" && playerChoice !="scissor")
        playerChoice = readln().lowercase()

    val randomNumber = (1..3).random()

    computerChoice = when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissor"
    }

    val winner = when {
        playerChoice == computerChoice -> "It's Tie!"
        playerChoice == "rock" && computerChoice == "scissor" -> "Player Win!"
        playerChoice == "paper" && computerChoice == "rock" -> "Player Win!"
        playerChoice == "scissor" && computerChoice == "paper" -> "Player Win!"
        else -> "Computer Win WAHAHAHAHAHA!"
    }
    println("$winner Congratulation!")

}