package com.olivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Input() {
    Column (
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = AbsoluteAlignment.Left


    ){
        var name by remember { mutableStateOf(TextFieldValue("")) }
        TextField(value = name, onValueChange = {name = it },
            label = { Text(text = "enter name")}

            )

        Spacer(modifier = Modifier.height(17.dp))



        var email by remember { mutableStateOf(TextFieldValue("")) }
        TextField(value = email,
            onValueChange = {email = it },
            
            label = { Text(text = "enter email")}
            )



        var phone by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(value = phone,
            onValueChange = {phone = it },

            label = { Text(text = "enter phone")}
        )


    }
}


