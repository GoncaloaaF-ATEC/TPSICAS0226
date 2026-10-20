package pt.atec.a04_img_locais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.a04_img_locais.ui.theme._04_img_locaisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()) {

                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()) {

                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = "Pizza hot dog",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp)
                            .size(80.dp, 80.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Red, CircleShape)
                    )

                    Column {
                        Text("Pizza Hot Dog",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)

                        Text("10€",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold

                        )
                    }

                }// base Row
            } // base Column
        }// setContent
    }
}
