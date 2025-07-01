package com.studio.whatif

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.ImageDecoderDecoder
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.studio.whatif.component.habits
import com.studio.whatif.ui.theme.Typography
import com.studio.whatif.ui.theme.black
import com.studio.whatif.ui.theme.green
import com.studio.whatif.ui.theme.mint
import com.studio.whatif.ui.theme.white
import kotlinx.coroutines.delay

@RequiresApi(Build.VERSION_CODES.P)
@OptIn(ExperimentalPagerApi::class)
@Composable
fun Simulasi(habitId: Int){
    val context = LocalContext.current
    val visible = remember { mutableStateOf(false) }


    val habit = habits.goodhabits.firstOrNull { it.id == habitId }
    val gifEnabledLoader = ImageLoader.Builder(context)

        .components {
            add(ImageDecoderDecoder.Factory())
        }
        .build()


    if (habit == null) {
        Text("Habit tidak ditemukan.")
        return
    }

    val pagerState = rememberPagerState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colorStops =
                    arrayOf(
                        0.78f to white,
                        0.88f to mint,

                        )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 50.dp),

            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,

            ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    IconButton(onClick = { /* Handle back button click */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back),
                            contentDescription = null,
                            tint = green,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                Text(
                    text = habit.title,
                    style = Typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = black,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
            HorizontalPager(
                count = habit.simulations.size,
                state = pagerState,
                modifier = Modifier
                    .padding(top = 30.dp)
                    .fillMaxWidth()
                    .height(687.dp)
            ) { page ->

                val simulation = habit.simulations[page]
                LaunchedEffect(page) {
                    visible.value = false
                    delay(1000)
                    visible.value = true
                }

                AnimatedVisibility(
                    visible = visible.value,
                    enter = fadeIn(animationSpec = tween(800)) + slideInVertically(
                        initialOffsetY = { fullHeight -> fullHeight }
                    ),
                    exit = fadeOut()
                ) {
                    Card(
                        colors = CardDefaults.cardColors(white),
                        border = BorderStroke(1.dp, green),
                        elevation = CardDefaults.cardElevation(8.dp),
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .height(687.dp)
                            .fillMaxWidth()
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = simulation.dayLabel,
                                style = Typography.titleLarge,
                                textAlign = TextAlign.Center,
                            )
                            Text(
                                text = simulation.description,
                                style = Typography.bodySmall,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Light,
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            if (!simulation.gifUrl.isNullOrEmpty() && simulation.gifUrl != "null") {
                                AsyncImage(
                                    model = simulation.gifUrl,
                                    imageLoader = gifEnabledLoader,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(15.dp))
                                        .height(400.dp)
                                        .padding(vertical = 50.dp),
                                    contentScale = ContentScale.Crop,
                                )
                            } else {
                                Image(
                                    painter = painterResource(
                                        id = simulation.illustration ?: R.drawable.sleepearlier
                                    ),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(400.dp)
                                        .padding(vertical = 50.dp),
                                    contentScale = ContentScale.Crop
                                )
                            }

                            // Animasi untuk highlight
                            AnimatedVisibility(
                                visible = visible.value,
                                enter = fadeIn(animationSpec = tween(1000)) +
                                        slideInVertically(initialOffsetY = { it / 2 }),
                            ) {
                                Text(
                                    text = simulation.highlight,
                                    style = Typography.bodyLarge,
                                    textAlign = TextAlign.Center,
                                )
                            }

                            // Animasi untuk highlightDescription
                            AnimatedVisibility(
                                visible = visible.value,
                                enter = fadeIn(animationSpec = tween(1200)) +
                                        slideInVertically(initialOffsetY = { it / 2 }),
                            ) {
                                Text(
                                    text = simulation.highlightDescription,
                                    style = Typography.bodySmall,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(horizontal = 10.dp)
                                )
                            }
                        }
                    }
                }
            }

        }

    }

}
