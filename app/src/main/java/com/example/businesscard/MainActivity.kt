package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                BusinessCardBox(modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.CenterStart))
                BusinessCardBoxTwo(modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.BottomCenter))
            }
        }
    }
}

@Composable
fun BusinessCardBox(modifier: Modifier = Modifier) {
    Box() {
        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector = Icons.Rounded.Email, contentDescription = null, modifier = Modifier
                .height(250.dp)
                .width(250.dp)
                .offset(0.dp,40.dp),
                tint = colorResource(R.color.teal_700))
            Text(
                stringResource(R.string.full_name), fontSize = 70.sp, textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.title),
                fontSize = 20.sp,
                lineHeight = 40.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun BusinessCardBoxTwo(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.email)
    Box() {
        Column(modifier = modifier, horizontalAlignment = Alignment.Start,  ) {
            Row(horizontalArrangement = Arrangement.Start) {
                Icon(
                    imageVector = Icons.Rounded.Email, contentDescription = null)
                Text(
                    stringResource(id = R.string.phone_number)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Icon(
                    imageVector = Icons.Rounded.Email, contentDescription = null)
                Text(
                    stringResource(id = R.string.socialMediaHandle)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Icon(
                    imageVector = Icons.Rounded.Email, contentDescription = null)
                Text(
                    stringResource(id = R.string.email)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardApp() {
    BusinessCardTheme {
        BusinessCardBox(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.CenterStart))
        BusinessCardBoxTwo(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.BottomCenter))
    }
}