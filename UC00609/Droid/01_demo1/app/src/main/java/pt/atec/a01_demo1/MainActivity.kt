package pt.atec.a01_demo1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            // var nome = remember { mutableStateOf("Gonçalo") }
            var nome by remember { mutableStateOf("Gonçalo") }
            var tf_nome by remember { mutableStateOf("") }


            Column(verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp) // dp -> elementos

            ) {

                Text(nome,
                    fontSize = 50.sp) // sp -> txt
                /*
                               Text("Ola Mundo 4",
                                   fontSize = 20.sp,
                                   modifier = Modifier
                                       .background(Color.Green)
                                       .padding(vertical = 20.dp)) // sp -> txt

                               Text("Ola Mundo 4",
                                   fontSize = 20.sp,
                                   modifier = Modifier
                                       .background(Color.Green)
                                       .padding(vertical = 20.dp)) // sp -> txt

                               Text("Ola Mundo 5",
                                   fontSize = 20.sp,
                                   fontWeight = FontWeight.Bold,
                                   fontFamily = FontFamily.Cursive,
                                   modifier = Modifier
                                       .padding(bottom = 20.dp)
                                       .background(Color.Blue))
                               */


                TextField(value = tf_nome, placeholder = {
                    Text("Nome")
                }, onValueChange = {
                    tf_nome = it
                },
                    modifier = Modifier.fillMaxWidth()

                    )



                Button(onClick = {

                    Log.d("Aula", nome)
                    if (tf_nome.length >= 2) {
                        nome = tf_nome
                        tf_nome = ""
                    }


//                    Log.d("Aula 1", "It Works")
//                    Log.i("Aula 1", "It Works")
//                    Log.e("Aula 1", "It Works")
//                    Log.w("Aula 1", "It Works")

                    Log.d("Aula", nome)


                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)) {

                    Text(" Click me")
                }





            } // Column

        }// onCreate
    }
}