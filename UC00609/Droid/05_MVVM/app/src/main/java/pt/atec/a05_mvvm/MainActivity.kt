package pt.atec.a05_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val aluno by viewModel.aluno.observeAsState()

            Column(verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)) {


                Text(aluno?.nome ?: "Sem nome",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)


                //Criar uma caixa de texto e mudar o nome com base
                // no que esta na caixa de texto

                Button(onClick = {

                    viewModel.mudarNome("Maria")

                }, modifier = Modifier.fillMaxWidth()) {
                    Text("mudar  nome")
                }

            }
        }
    }
}
