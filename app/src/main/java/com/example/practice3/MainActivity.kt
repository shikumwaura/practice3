package com.example.practice3

import android.content.Intent
import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice3.ui.theme.PRACTICE3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Home() {
    LazyColumn {
        item {
            Column(
//                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxHeight()


            ) {
                Text(
                    "Where you",
                    fontSize = 25.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,

                    )

                Text(
                    "wanna go?",
                    fontSize = 25.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold

                )

                Spacer(modifier = Modifier.height(15.dp))




                Row {
                    val kk = LocalContext.current
                    OutlinedCard(
                        modifier = Modifier
                            .clickable {
                                kk.startActivity(Intent(kk,MainActivity::class.java))

                            }
                            .height(100.dp)
                            .width(70.dp)
                            .padding(5.dp)
                    ) {



                        Image(
                            painter = painterResource(id = R.drawable.ho),
                            contentDescription = "hotel",
                            modifier = Modifier
//                                .size(34.dp)
                                .height(40.dp)
                                .padding(3.dp)
//                                .padding(2.dp)

                        )
                        Spacer(modifier = Modifier.height(7.dp))

                        Text("Hotel",
                            fontSize = 10.sp,
                            modifier = Modifier
                                .padding(12.dp)
                        )
                    }




                    OutlinedCard(
                        modifier = Modifier
                            .clickable {
                                kk.startActivity(Intent(kk,MainActivity::class.java))
                            }
                            .height(100.dp)
                            .width(70.dp)
                            .padding(5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fli),
                            contentDescription = "flight",
                            modifier = Modifier
                                .height(43.dp)
                                .size(50.dp)
                                .padding(5.dp)
                                .padding(4.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text("Flight",
                            fontSize = 10.sp,

                            modifier = Modifier
                                .padding(3.dp)
                                .padding(1.dp)


                                 )

                    }

                    OutlinedCard(
                        modifier = Modifier
                            .clickable {
                                kk.startActivity(Intent(kk,MainActivity::class.java))
                            }
                            .height(100.dp)
                            .width(70.dp)
                            .padding(5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pl),
                            contentDescription = "place",
                            modifier = Modifier
                                .height(40.dp)
                                .size(43.dp)
                        )
                        Text("Place",
                            fontSize = 10.sp,
                            modifier = Modifier
                                .padding(16.dp)
                        )

                    }




                    OutlinedCard(
                        modifier = Modifier
                            .clickable {
                                kk.startActivity(Intent(kk,MainActivity::class.java))
                            }
                            .height(100.dp)
                            .width(70.dp)
                            .padding(5.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fo),
                            contentDescription = "food",
                            modifier = Modifier
                                .height(40.dp)
                                .size(43.dp)
                        )
                        Text("Food",
                            fontSize = 10.sp,
                            modifier = Modifier
                                .padding(0.dp)
                                .padding(16.dp))

                    }

                }
                Spacer(modifier = Modifier.height(20.dp))

                Text("Popular Hotels",
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold

                )


                Spacer(modifier = Modifier.height(20.dp))




                Row {
                    OutlinedCard (
                        modifier = Modifier
                            .height(180.dp)
                            .width(130.dp)
                    ){

                        Image(painter = painterResource(id = R.drawable.ho1),
                            contentDescription = "hotel 1",
                            modifier = Modifier
                                .width(150.dp)
                                .height(200.dp)
                            )

                    }

                    Spacer(modifier = Modifier.width(15.dp))


                    OutlinedCard(
                        modifier = Modifier
                            .height(180.dp)
                            .width(130.dp)
                    ){

                        Image(painter = painterResource(id = R.drawable.ho2),
                            contentDescription = "hotel 1",
                            modifier = Modifier
                                .height(600.dp)
                                .size(800.dp)
                        )
//
                    }


                }





                Spacer(modifier = Modifier.height(20.dp))


                Text("Hot Deals",
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(10.dp))


                Row {

                    OutlinedCard(
                        modifier = Modifier
                            .height(150.dp)
                            .width(275.dp)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ho3),
                            contentDescription = "hotel 3",

                            modifier = Modifier
//                                .size(500.dp)

                        )

                    }
                }

































            }

        }

    }
}

