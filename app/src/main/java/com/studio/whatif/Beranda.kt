package com.studio.whatif

import android.widget.Button
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.studio.whatif.component.habits
import com.studio.whatif.ui.theme.Typography
import com.studio.whatif.ui.theme.green
import com.studio.whatif.ui.theme.mint
import com.studio.whatif.ui.theme.white
import java.net.URLEncoder

@Composable
fun Beranda(navController: NavController) {
    val allHabits = habits.goodhabits

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colorStops = arrayOf(
                        0.78f to white,
                        0.88f to mint,
                    )
                )
            )
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 25.dp,
                    vertical = 40.dp,
                ),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .weight(0.5f)
                            .padding(end = 5.dp)
                    ) {
                        Text(
                            text = "Pilih salah satu kebiasaan dibawah ini dan cari tau manfaatnya dalam 10 tahun kedepan",
                            style = Typography.bodySmall,
                        )
                        Divider(
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .height(2.dp),
                            color = mint
                        )
                    }
                    Image(
                        painter = painterResource(R.drawable.grinch),
                        contentDescription = null,
                        modifier = Modifier.height(200.dp)
                    )
                }
            }

            items(habits.goodhabits) { habit ->
                HabitCard(
                    habit = habit,
                    onClick = {
                        navController.navigate("simulasi/${habit.id}")
                    }
                )
            }

            item {
                Spacer(modifier = Modifier.height(100.dp))
            }
        }

        // Sticky Text
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(color = mint)
                .height(110.dp)
                .padding(16.dp)
        ) {
            Text(
                text = "All big things come from small beginnings",
                style = Typography.bodyLarge,
                textAlign = TextAlign.Center
            )
            Text(
                text = "- James Clear",
                style = Typography.bodySmall,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun HabitCard(habit: habits.Habit, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(white),
        border = BorderStroke(1.dp, green),
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .height(168.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(end = 5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.above),
                    contentDescription = null,
                    modifier = Modifier
                        .height(20.dp)
                        .padding(bottom = 5.dp)

                )
                Text(
                    text = habit.title,
                    style = Typography.bodyLarge,
                    modifier = Modifier
                        .padding(bottom = 2.dp)

                )
                Text(
                    text = habit.description,
                    style = Typography.bodySmall,
                )
            }
            Image(
                painter = painterResource(id = habit.image),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
            )
        }
    }
}

@Preview
@Composable
fun BerandaPreview() {
    val navController = rememberNavController()
    Beranda(navController)
}

