package com.example.navigationapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(name:String, age:Int, navigationToThirdScreen:()->Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("This is the Second Screen", fontSize = 30.sp,
            textAlign = TextAlign.Center)
        Text("Welcome! $name", fontSize = 30.sp)
        Text("Your age is  $age", fontSize = 30.sp)

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = {
            navigationToThirdScreen()
        }){
            Text("Go To the Third Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview(){
    SecondScreen("Stev",0,{})
}