package com.annguyenhoang.mvvmrecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NewStory()
        }

    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}

@Composable
fun NewStory() {
    val fontSize = 25
    val colorString = "000000"

    Column(
        modifier = androidx.compose.ui.Modifier.padding(16.dp)
    ) {
        Text(
            text = "A day in Shark Fin Cove",
            fontSize = fontSize.sp,
            color = changeColorToHex(colorString = colorString)
        )
        Text(
            text = "Davenport, California",
            fontSize = fontSize.sp,
            color = changeColorToHex(colorString = colorString)
        )
        Text(
            text = "December 2018",
            fontSize = fontSize.sp,
            color = changeColorToHex(colorString = colorString)
        )
    }

}

fun changeColorToHex(colorString: String) =
    Color(android.graphics.Color.parseColor("#$colorString"))
