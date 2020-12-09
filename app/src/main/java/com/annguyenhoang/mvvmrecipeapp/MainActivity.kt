package com.annguyenhoang.mvvmrecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val bitmap = imageFromResource(
                res = resources,
                resId = R.drawable.happy_meal_small
            )
            DetailScreen(bitmap)
//            NewStory(bitmapReference = bitmap)
        }
    }

    @Composable
    fun DetailScreen(bitmap: ImageBitmap) {
        ScrollableColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF2F2F2))
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                elevation = 6.dp
            ) {
                Image(
                    bitmap = bitmap,
                    modifier = Modifier
                        .height(300.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            fontSize = TextUnit.Companion.Sp(26)
                        )
                    )

                    Text(
                        text = "$5.99",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        style = TextStyle(
                            color = Color(0xFF85bb65),
                            fontSize = TextUnit.Companion.Sp(17)
                        )
                    )
                }

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(
                    text = "800 Calories",
                    style = TextStyle(
                        fontSize = TextUnit.Companion.Sp(17)
                    )
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(
                        Alignment.CenterHorizontally
                    )
                ) {
                    Text(text = "Order Now")
                }

            }
        }
    }
}

//@Composable
//fun NewStory(bitmapReference: ImageBitmap) {
////    val fontSize = 25
//    val colorString = "e67e22"
//    val imageModifier = Modifier
//        .preferredHeight(180.dp)
//        .fillMaxWidth()
//        .clip(shape = RoundedCornerShape(8.dp))
//
//    MaterialTheme {
//        val typography = MaterialTheme.typography
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//
//            Image(
//                modifier = imageModifier,
//                bitmap = bitmapReference,
//                contentScale = ContentScale.Crop
//            )
//
//            Spacer(modifier = Modifier.preferredHeight(16.dp))
//
//            Text(
//                text = "A day wandering through the sandhills " +
//                        "in Shark Fin Cove, and a few of the " +
//                        "sights I saw",
//                color = changeColorToHex(colorString = colorString),
//                style = typography.h6,
//                maxLines = 2,
//                overflow = TextOverflow.Ellipsis
//            )
//            Text(
//                text = "Davenport, California",
//                color = changeColorToHex(colorString = colorString),
//                style = typography.body2
//            )
//            Text(
//                text = "December 2018",
//                color = changeColorToHex(colorString = colorString),
//                style = typography.body2
//            )
//        }
//    }
//}

fun changeColorToHex(colorString: String) =
    Color(android.graphics.Color.parseColor("#$colorString"))
