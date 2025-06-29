package com.studio.whatif.component

import com.studio.whatif.R

object habits{
    data class Habit(
        val id: Int,
        val title: String,
        val description: String,
        val image: Int,
    )

    val goodhabits = mutableListOf(
        Habit(
            id = 1,
            title = "Tidur lebih awal",
            description = "Apa jadinya kalau kamu mulai tidur jam 9 malam tiap hari?",
            image = R.drawable.sleepearlier

        ),
        Habit(
            id = 2,
            title = "Tidur lebih awal",
            description = "Apa jadinya kalau kamu mulai tidur jam 9 malam tiap hari?",
            image = R.drawable.sleepearlier
        )
    )
}


//object habits{
//    data class Habit(
//        val id: Int,
//        val title: String,
//        val description: String,
//        val image: Int,
//        val simulations: List<Simulation>
//    )
//    data class Simulation(
//        val dayLabel: String,     // misalnya "Day 1", "1 minggu", dll
//        val description: String,
//        val highlight : String,
//        val highlightDescription : String,
//        val illustration: Int? = null,   // kalau ada gambar lokal
//        val gifUrl: String? = null     // kalau mau ambil GIF dari internet
//    )
//
//    val goodhabits = mutableListOf(
//        Habit(
//            id = 1,
//            title = "Tidur lebih awal",
//            description = "Apa jadinya kalau kamu mulai tidur jam 9 malam tiap hari?",
//            image = R.drawable.sleepearlier,
//            simulations = listOf(
//                Simulation(
//                    dayLabel = "Day 1",
//                    description = "Tubuhmu merasa lebih segar besok pagi.",
//                    highlight = "Highlight",
//                    highlightDescription = "Deskripsi highlight",
//                    illustration = R.drawable.sleepearlier,
//                    gifUrl = "null"
//                ),
//                Simulation(
//                    dayLabel = "Day 7",
//                    description = "Tubuhmu merasa lebih segar besok pagi.",
//                    highlight = "Highlight",
//                    highlightDescription = "Deskripsi highlight",
//                    illustration = R.drawable.sleepearlier,
//                    gifUrl = "null"
//                ),
//                Simulation(
//                    dayLabel = "Day 14",
//                    description = "Tubuhmu merasa lebih segar besok pagi.",
//                    highlight = "Highlight",
//                    highlightDescription = "Deskripsi highlight",
//                    illustration = R.drawable.sleepearlier,
//                    gifUrl = "null"
//                )
//            )
//        )
//    )
//}



