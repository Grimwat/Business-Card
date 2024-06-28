package com.example.buisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buisnesscard.ui.theme.BuisnessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Infoset()
                }
            }
        }
    }
}
@Composable
fun Info (modifier: Modifier = Modifier, name: String, email: String, number: String ){
    val face = painterResource (R.drawable.face_24dp)
    val mail = painterResource (R.drawable.mail_outline_24dp)
    val phone = painterResource(R.drawable.smartphone_24dp)
    Column (modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start) {
        Row (
            modifier = Modifier.padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image (
                painter = face,
                contentDescription = null,

            )
        Text (
            text = name,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 5.dp)
        )
        }
        Row (
            modifier = Modifier.padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = mail ,
                contentDescription = null)
            Text(
                text = email,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 5.dp)
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = phone,
                contentDescription = null)
            Text(
                text = number,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 5.dp)
            )
        }
    }
}
@Composable
fun Infoset (modifier: Modifier = Modifier) {
    val me = painterResource(R.drawable.card)
        Column(
            modifier = modifier,


        ) {
            Image(
                painter = me,
                contentDescription = null,
                modifier = Modifier.padding(bottom = 20.dp),
                Alignment.Center
            )

            Info(
                modifier = modifier.padding(8.dp),
                name = stringResource(R.string.Name),
                email = stringResource(R.string.Email),
                number = stringResource(R.string.Number)
            )
        }
    }


@Preview(showBackground = true)
@Composable
fun BuisnessCardPreview() {
    BuisnessCardTheme {
        Infoset()
    }
}