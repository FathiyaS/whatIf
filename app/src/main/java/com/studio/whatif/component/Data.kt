package com.studio.whatif.component

import com.studio.whatif.R

object habits{
    data class Habit(
        val id: Int,
        val title: String,
        val description: String,
        val image: Int,
        val simulations: List<Simulation> = emptyList()
    )
        data class Simulation(
        val dayLabel: String,     // misalnya "Day 1", "1 minggu", dll
        val description: String,
        val highlight : String,
        val highlightDescription : String,
        val illustration: Int? = null,   // kalau ada gambar lokal
        val gifUrl: String? = null     // kalau mau ambil GIF dari internet
    )

    val goodhabits = mutableListOf(
        Habit(
            id = 1,
            title = "Tidur lebih awal",
            description = "Apa jadinya kalau kamu mulai tidur jam 9 malam tiap hari?",
            image = R.drawable.sleepearlier,
            simulations = listOf(
                Simulation(
                    dayLabel = "Day 1",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExbnVwbGV0d3gzMGZmN3I5cWw1YXU0OWdiODl4ZXZycXh5a2p2NXM2OCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9dg/ajO2EBhDngzJnL2Inr/giphy.gif"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExbnVwbGV0d3gzMGZmN3I5cWw1YXU0OWdiODl4ZXZycXh5a2p2NXM2OCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9dg/ajO2EBhDngzJnL2Inr/giphy.gif"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExbnVwbGV0d3gzMGZmN3I5cWw1YXU0OWdiODl4ZXZycXh5a2p2NXM2OCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9dg/ajO2EBhDngzJnL2Inr/giphy.gif"
                )
            )

        ),
        Habit(
            id = 2,
            title = "Baca buku 15 menit",
            description = "Menambah wawasan",
            image = R.drawable.reading,
            simulations = listOf(
                Simulation(
                    dayLabel = "Day 1",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExbnVwbGV0d3gzMGZmN3I5cWw1YXU0OWdiODl4ZXZycXh5a2p2NXM2OCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9dg/ajO2EBhDngzJnL2Inr/giphy.gif"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExbnVwbGV0d3gzMGZmN3I5cWw1YXU0OWdiODl4ZXZycXh5a2p2NXM2OCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9dg/ajO2EBhDngzJnL2Inr/giphy.gif"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExbnVwbGV0d3gzMGZmN3I5cWw1YXU0OWdiODl4ZXZycXh5a2p2NXM2OCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9dg/ajO2EBhDngzJnL2Inr/giphy.gif"
                )
            )
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



