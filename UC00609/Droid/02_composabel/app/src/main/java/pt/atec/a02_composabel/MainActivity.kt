package pt.atec.a02_composabel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.a02_composabel.ui.theme._02_composabelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _02_composabelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )
                        Text2(
                            name = "Aula Android 2",
                            padding = 50
                        )
                    } // Column
                }//  Scaffold
            }// _02_composabelTheme
        }// setContent
    }// onCreate
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun Text2(name: String, padding: Int = 16) {
    Row {
    Text(
        text = "Hello",
        fontSize = 40.sp,
        fontWeight = FontWeight.W300,
        modifier = Modifier.padding(top = padding.dp)
    )

    Text(
        text = "$name!",
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = padding.dp, start = 4.dp)
    )
    }
}
