package pt.atec.a03_listas


import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.a03_listas.ui.theme._03_listasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var num by remember { mutableStateOf("") }
            var lst = remember { mutableStateListOf("Val 1","Val 2", "Val 2") }
            val lst2 = remember { mutableStateListOf("nome 1","nome 2", "nome 3") }

            val lst_filter = lst.filter {
                it.contains(num)
            }


            _03_listasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier.padding(innerPadding)) {

                        /*
                        Text(lst.toList().toString(), fontSize = 20.sp)
                        */

                        TextField(value = num, onValueChange = {
                            //filtrar list
                            num = it

                        },
                            modifier = Modifier.fillMaxWidth())

                        Button(onClick = {
                            lst.add("val ${lst.size}")
                            //Log.d("Aula", lst.toString())
                        }, modifier = Modifier.fillMaxWidth()) {
                            Text("add elm")
                        }
                        ShowList(lst_filter.toList(),
                            onClick = { nome, len ->
                                Log.d("Aula", "nome: $nome e len: $len")
                            },
                            modifier = Modifier.padding(top = 20.dp).height(300.dp))


                        ShowList(lst2.toList(),
                            onClick = { nome, len ->
                                Toast.makeText(applicationContext,
                                        "nome: $nome",
                                    Toast.LENGTH_LONG
                                    ).show()
                            },
                            modifier = Modifier.padding(top = 20.dp))
                    }
                }
            }
        }
    }
}


@Composable
fun ShowList(nomes:List<String>, onClick:(String, Int) -> Unit, modifier: Modifier = Modifier){

    LazyColumn(modifier = modifier) {

        items(nomes) {
            Text(it,
                fontSize = 40.sp,
                modifier= Modifier.fillMaxWidth()
                    .height(70.dp)
                    .clickable{
                        val txt = it.lowercase()
                        onClick(txt, it.length)
                    }
            )
        }

    }
}