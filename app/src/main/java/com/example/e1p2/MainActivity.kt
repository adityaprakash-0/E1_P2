package com.example.e1p2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e1p2.ui.theme.E1P2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            E1P2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginForm( Modifier.padding(innerPadding))
                }

            }
        }
    }
}



@Composable
fun LoginForm(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {

        var name by remember { mutableStateOf("") }
        var registrationNumber by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var contact by remember { mutableStateOf("") }
        var address by remember { mutableStateOf("") }


        Text(text = "Login Form",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 40.dp, bottom = 20.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier= Modifier.padding(40.dp))
        TextField(
            value = name,
            onValueChange = {name = it},
            label = {Text("Name:")},
            singleLine = true,
            modifier = Modifier.padding(start=30.dp, bottom = 10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        TextField(
            value = registrationNumber,
            onValueChange = {registrationNumber=it},
            singleLine = true,
            label = {Text("Registration No:")},
            modifier = Modifier.padding(start=30.dp, bottom = 10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = email,
            onValueChange = {email = it},
            label = {Text("Email Address:")},
            singleLine = true,
            modifier = Modifier.padding(start=30.dp, bottom = 10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        TextField(
            value = contact,
            onValueChange = { contact = it},
            label = {Text("Contact:")},
            singleLine = true,
            modifier = Modifier.padding(start=30.dp, bottom = 10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = address,
            onValueChange = {address = it},
            label = {Text("Address:")},
            modifier = Modifier.padding(start=30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

        )
       Button(onClick = { /*TODO*/ },
           modifier= Modifier.fillMaxWidth().padding(20.dp)){
           Text(text = "LOG IN")
       }




    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview(){
    E1P2Theme {
        LoginForm()
    }
}