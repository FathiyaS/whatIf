package com.studio.whatif

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.studio.whatif.navigation.Screen
import com.studio.whatif.ui.theme.mint
import com.studio.whatif.ui.theme.white
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember { Animatable(0f) }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 500,
                easing = FastOutSlowInEasing
            )
        )
        delay(1500)
        navController.navigate(Screen.beranda.route) {
                popUpTo(Screen.splash.route) { inclusive = true }
        }
    }

    Box(modifier = Modifier
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

        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.scale(1.5f)
                .height(519.dp)
                .width(144.dp)
        )
    }
}

