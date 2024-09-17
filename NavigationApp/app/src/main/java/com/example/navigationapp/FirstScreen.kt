package com.example.navigationapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(navigationToSecondScreen:(String,Int)->Unit) {
    val name = remember {
        mutableStateOf("")
    }
    val age = remember {
        mutableStateOf(0)
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("This is the First Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = name.value, onValueChange ={
            name.value = if (it.isEmpty()) "Unknown" else it},
            label = { Text("Name") })  //hmm empty?

        OutlinedTextField(value = age.value.toString(), onValueChange ={
            age.value = if (it.isEmpty()) 0 else it.toInt()},
            label = { Text("Age") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )


        OutlinedButton(onClick = {
            navigationToSecondScreen(name.value,age.value)
        }){
            Text("Go To the Second Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstPreview(){
//    FirstScreen()
}