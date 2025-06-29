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
                Simulation("Day 1", "Sehari setelahnya", "Energi Lebih Terjaga", "Tidur lebih cepat bikin badanmu terasa segar dan pikiran lebih jernih keesokan harinya.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Konsentrasi Meningkat", "Rutinitas tidur teratur mulai memperbaiki fokus dan membuatmu lebih produktif.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Mood Stabil", "Kamu jadi lebih jarang uring-uringan karena tidur cukup bantu menyeimbangkan hormon.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Daya Tahan Tubuh Membaik", "Imunitas tubuh meningkat karena sel-sel lebih optimal memperbaiki diri saat tidur.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Kebiasaan Positif Terbentuk", "Tidur cepat sudah jadi kebiasaanmu tanpa perlu dipaksa lagi.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Jantung Lebih Sehat", "Risiko penyakit jantung menurun karena pola tidurmu stabil.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Proses Penuaan Melambat", "Kualitas tidur yang baik bantu menjaga tubuh tetap bugar dan awet muda.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Kesehatan Mental Meningkat", "Kamu jadi lebih tenang, jarang merasa cemas, dan punya pola pikir lebih positif.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Kualitas Hidup Tinggi", "Tidur cukup selama bertahun-tahun membuatmu tetap aktif, sehat, dan produktif.", R.drawable.sleepearlier, "null")

            )

        ),
        Habit(
            id = 2,
            title = "Baca buku 15 menit",
            description = "Minum air putih cukup",
            image = R.drawable.reading,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Dapat Wawasan Baru", "Hari ini kamu belajar hal baru yang bikin pikiranmu lebih terbuka.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Semakin Betah Membaca", "Kegiatan membaca mulai terasa menyenangkan, bukan kewajiban.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Percaya Diri Naik", "Pengetahuan yang kamu punya bikin kamu lebih pede ngobrol di mana saja.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Stress Berkurang", "Membaca jadi cara ampuh buatmu melepas stres setelah hari panjang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Pola Pikir Lebih Kritis", "Semakin banyak membaca, semakin tajam caramu menganalisis informasi.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Kreativitas Meningkat", "Banyak ide-ide segar yang muncul dari buku-buku yang kamu baca.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Percakapan Jadi Seru", "Kamu makin pintar menyusun kata dan bercerita dengan orang lain.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Karier Meningkat", "Pengetahuan luasmu jadi nilai lebih dalam pekerjaan.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Bijak Menghadapi Hidup", "Semakin banyak membaca, semakin kamu bijak menyikapi berbagai masalah.", R.drawable.sleepearlier, "null")
            )
        ),
        Habit(
            id = 3,
            title = "Kurangi scroll media sosial",
            description = "Biar nggak kehabisan waktu cuma buat mantengin layar.",
            image = R.drawable.sleepearlier,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Punya Waktu Lebih Banyak", "Hari ini kamu sadar banyak hal lain yang bisa kamu kerjain selain scroll tanpa henti.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Tidur Lebih Nyenyak", "Kurangin scroll sebelum tidur bikin kamu cepat terlelap.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Fokus Meningkat", "Kamu mulai lebih konsentrasi waktu kerja atau belajar karena distraksi berkurang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Mental Lebih Tenang", "Nggak lagi terlalu membandingkan diri sama hidup orang lain di sosmed.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Produktivitas Naik", "Waktu luangmu terpakai buat hal bermanfaat yang bikin kamu berkembang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Relasi Sosial Lebih Dekat", "Kamu lebih sering ngobrol langsung sama orang-orang di sekitarmu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Kesehatan Mata Terjaga", "Waktu layar berkurang bikin matamu lebih sehat dan nggak cepat lelah.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Kenal Diri Lebih Dalam", "Tanpa terlalu banyak distraksi sosmed, kamu makin ngerti apa yang kamu mau.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Hidup Lebih Seimbang", "Media sosial cuma jadi alat, bukan hal yang nguasain hidupmu.", R.drawable.sleepearlier, "null")
            )
        ),
        Habit(
            id = 4,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                )
            )
        ),
        Habit(
            id = 5,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                )
            )
        ),
        Habit(
            id = 6,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                )
            )
        )
        ,Habit(
            id = 7,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                )
            )
        ),
        Habit(
            id = 8,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                )
            )
        ),
        Habit(
            id = 9,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                )
            )
        ),
        Habit(
            id = 10,
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
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 7",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
                ),
                Simulation(
                    dayLabel = "Day 14",
                    description = "Tubuhmu merasa lebih segar besok pagi.",
                    highlight = "Highlight",
                    highlightDescription = "Deskripsi highlight",
                    illustration = R.drawable.sleepearlier,
                    gifUrl = "null"
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



