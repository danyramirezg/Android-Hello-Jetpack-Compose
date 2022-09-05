package com.example.myapplicationhellojetpackcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationhellojetpackcompose.ui.theme.MyApplicationHelloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationHelloJetpackComposeTheme {
                AllInformation()
            }
        }
    }
}

@Composable
fun Greeting(name: String, color: Color, style: TextStyle) {
    Text(text = "Hello $name!", color = color, style = style)
}

@Composable
fun ShowImage() {
    Image(painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Default image",
        modifier = Modifier
            .clip(
                CircleShape
            )
            .background(Color.Cyan)
            .size(32.dp)
            .clickable { })
}

@Composable
fun AllInformation() {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.onBackground)
            .padding(16.dp)
    ) {
        ShowImage()

        Column(modifier = Modifier.padding(start = 8.dp)) {
            Greeting(
                "Dany",
                MaterialTheme.colorScheme.secondary,
                MaterialTheme.typography.titleLarge
            )
            Row(modifier = Modifier.padding(end = 8.dp)) {
                Text("Welcome to ")
                Text("Jetpack Compose!")

            }
            Spacer(modifier = Modifier.height(8.dp))
            Column {
                Text(text = "Tell me,")

                Text(text = "How are you?")

            }
        }
    }
}

@Preview() // Shows the light theme.
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES) //Shows the dark theme
@Preview(showSystemUi = true) // Shows how will see in the phone
@Composable
fun DefaultPreview() {
    MyApplicationHelloJetpackComposeTheme {

        val scroll = rememberScrollState()
        Column(modifier = Modifier.verticalScroll(scroll)) {
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
            AllInformation()
        }

    }
}

