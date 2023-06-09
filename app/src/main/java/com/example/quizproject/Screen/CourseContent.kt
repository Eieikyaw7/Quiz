package com.example.quizproject.Screen

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.animation.content.Content
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.quizproject.R
import com.example.quizproject.ui.theme.LightBlue
import java.time.format.TextStyle
import kotlin.random.Random


@Preview
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "NewApi")
@Composable
fun CourseContent(){
       Scaffold(
            containerColor = MaterialTheme.colorScheme.secondary,
            topBar = {
                TopAppBar(
                    colors =TopAppBarDefaults.smallTopAppBarColors(MaterialTheme.colorScheme.secondary),
                    title = {
                        Row {
                            Box(modifier = Modifier.padding(10.dp)) {
                               Icon(Icons.Default.ArrowBack, contentDescription = "back",
                                   tint = Color.Black)
                           }
                          Box(modifier = Modifier.padding(10.dp)){
                              Text(text = "FE Class",
                                  style = androidx.compose.ui.text.TextStyle(
                                      color = Color.Black,
                                      fontWeight = FontWeight.Bold,
                                      fontSize = 18.sp
                                  )
                              )
                          }
                        }
                    })
                 },
           content = {
               val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.presentation)  )
               Column {
                   Spacer(modifier = Modifier.height(40.dp))
                   Column(
                       modifier = Modifier
                           .fillMaxHeight(0.4f),
                       verticalArrangement = Arrangement.Bottom,
                       //  horizontalAlignment = Alignment.CenterHorizontally
                   ) {
                       LottieAnimation(
                         //  modifier = Modifier.fillMaxSize(),
                           iterations = 1000, composition = composition
                       )
                   }
                   Column(modifier = Modifier
                       .fillMaxHeight(0.1f)
                       .fillMaxWidth(1f),
                       horizontalAlignment = Alignment.CenterHorizontally,
                       verticalArrangement = Arrangement.Center) {
                       Text(text = "Choose Your Category",
                           style = androidx.compose.ui.text.TextStyle(
                               color = Color.Black,
                               fontWeight = FontWeight.Bold,
                               fontSize = 18.sp
                           ))
                   }
                   Column(
                      // modifier = Modifier.fillMaxHeight(1f),
                       modifier = Modifier.fillMaxSize(),
                       verticalArrangement = Arrangement.Center,
                       horizontalAlignment = Alignment.CenterHorizontally
                   ) {

                      /* Card(
                           shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                           modifier = Modifier
                               .fillMaxWidth()
                               .fillMaxHeight(1f),
                           colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),
                           ) {
                           Spacer(modifier = Modifier.width(16.dp))
                           Column(
                               modifier = Modifier
                                   .padding(25.dp)
                                   .fillMaxSize(),
                               verticalArrangement = Arrangement.Center,
                               horizontalAlignment = Alignment.CenterHorizontally
                           ) {

                               Spacer(modifier = Modifier.height(16.dp))

                               Row {

                                  Button(onClick ={},
                                      modifier = Modifier.size(100.dp),
                                      shape = RoundedCornerShape(20.dp),
                                      elevation = ButtonDefaults.elevatedButtonElevation(5.dp),
                                      //ButtonColors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onSecondary)
                                     border = BorderStroke(1.dp, color = MaterialTheme.colorScheme.tertiary)
                                  ) {
                                       Text(text = "FE",
                                           style = androidx.compose.ui.text.TextStyle(
                                               color = Color.Black
                                           )
                                       )
                                  }
                                   Spacer(modifier = Modifier.width(16.dp))

                                   Button(onClick ={},
                                       modifier = Modifier.size(100.dp),
                                       shape = RoundedCornerShape(20.dp),
                                       elevation = ButtonDefaults.elevatedButtonElevation(10.dp),
                                       border = BorderStroke(1.dp, color = MaterialTheme.colorScheme.tertiary)

                                   ) {

                                       Text(text = "Favorite",
                                           style = androidx.compose.ui.text.TextStyle(
                                               color = Color.Black
                                           )
                                       )


                                   }
                               }

                               Spacer(modifier = Modifier.height(16.dp))

                               Row {

                                   Button(onClick ={},
                                       modifier = Modifier.size(100.dp),
                                       shape = RoundedCornerShape(20.dp),
                                       elevation = ButtonDefaults.elevatedButtonElevation(10.dp),
                                       border = BorderStroke(1.dp, color = MaterialTheme.colorScheme.tertiary)

                                   ) {

                                       Text(text = "Quiz",
                                           style = androidx.compose.ui.text.TextStyle(
                                               color = Color.Black
                                           )
                                       )


                                   }
                                   Spacer(modifier = Modifier.width(16.dp))

                                   Button(onClick ={},
                                       modifier = Modifier.size(100.dp),
                                       shape = RoundedCornerShape(20.dp),
                                       elevation = ButtonDefaults.elevatedButtonElevation(10.dp),
                                       border = BorderStroke(1.dp, color = MaterialTheme.colorScheme.tertiary)

                                   ) {

                                       Text(text = "Test",
                                           style = androidx.compose.ui.text.TextStyle(
                                               color = Color.Black
                                           )
                                       )


                                   }
                               }
                           }


                       }*/

                       Spacer(modifier = Modifier.width(20.dp))
                       Column {
                           Row(verticalAlignment = Alignment.CenterVertically,
                               horizontalArrangement = Arrangement.Center) {
                               Card (modifier = Modifier
                                   .size(150.dp),
                                   colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),
                                   onClick = {}
                               ){

                                  Box(modifier = Modifier.fillMaxSize(),
                                      contentAlignment = Alignment.Center
                                      ){ Text(text = "FE",
                                       style = androidx.compose.ui.text.TextStyle(
                                           color = Color.Black ,
                                           fontSize = 16.sp)
                                  )
                                  }
                               }
                               Spacer(modifier = Modifier.width(20.dp))
                               Card (modifier = Modifier
                                   .size(150.dp),
                                   colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)
                               ){
                                   Box(modifier = Modifier.fillMaxSize(),
                                       contentAlignment = Alignment.Center
                                   ){ Text(text = "Favorite",
                                       style = androidx.compose.ui.text.TextStyle(
                                           color = Color.Black  ,
                                           fontSize = 16.sp)
                                   )
                                   }
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(20.dp))

                       Column(verticalArrangement = Arrangement.Center) {
                           Row(verticalAlignment = Alignment.CenterVertically,
                               horizontalArrangement = Arrangement.Center) {
                               Card (modifier = Modifier
                                   .size(150.dp),
                                   colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)
                               ){
                                   Box(modifier = Modifier.fillMaxSize(),
                                       contentAlignment = Alignment.Center
                                   ){ Text(text = "Quiz",
                                       style = androidx.compose.ui.text.TextStyle(
                                           color = Color.Black  ,
                                           fontSize = 16.sp)
                                   )
                                   }
                               }
                               Spacer(modifier = Modifier.width(20.dp))
                               Card (modifier = Modifier
                                   .size(150.dp),
                                   colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)
                               ){
                                   Box(modifier = Modifier.fillMaxSize(),
                                       contentAlignment = Alignment.Center
                                   ){ Text(text = "Test",
                                       style = androidx.compose.ui.text.TextStyle(
                                           color = Color.Black ,
                                           fontSize = 16.sp)
                                   )
                                   }
                               }
                           }
                       }
                   }
                       }
           }

        )
}

