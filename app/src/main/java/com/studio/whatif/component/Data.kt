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
            description = "Tambah wawasan baru dalam hidupmu",
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
            title = "Meditasi 5 menit tiap pagi",
            description = "Sudahi overthinking itu",
            image = R.drawable.meditasi,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Pikiran Lebih Tenang", "Kamu merasa lebih rileks walau baru sebentar bermeditasi.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Lebih Mudah Fokus", "Meditasi bantu menghalau distraksi pikiranmu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Tidur Lebih Nyenyak", "Kamu mulai tidur lebih cepat dan pulas.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Emosi Terkontrol", "Meditasi bantu menahanmu bereaksi berlebihan saat stres.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Percaya Diri Tumbuh", "Kamu makin merasa damai dengan dirimu sendiri.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Bahagia Lebih Konsisten", "Meditasi bikin hormon bahagia lebih stabil.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Kesadaran Diri Tinggi", "Kamu makin mengenali pola pikirmu dan mengelolanya dengan baik.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Stres Mudah Reda", "Saat masalah datang, kamu lebih sigap menenangkan diri.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Kesehatan Mental Prima", "Meditasi rutin bantu mencegah gangguan mental jangka panjang.", R.drawable.sleepearlier, "null")

            )
        ),
        Habit(
            id = 4,
            title = "Kurangi scroll media sosial",
            description = "Biar nggak kehabisan waktu cuma buat mantengin layar.",
            image = R.drawable.scrolling,
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
            id = 5,
            title = "Journaling sebelum tidur",
            description = "Tuangin pikiranmu biar hati lebih tenang.",
            image = R.drawable.journaling,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Tidur Lebih Nyenyak", "Kamu merasa lebih lega karena unek-unek nggak cuma dipendam di kepala.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Pikiran Lebih Rapi", "Nulis rutin bikin kamu makin jago memilah mana yang penting dan nggak.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Lebih Kenal Diri", "Kamu makin paham apa yang kamu rasain dan butuhin.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Stress Lebih Terkelola", "Journaling jadi cara melepas emosi tanpa drama.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Emosi Lebih Stabil", "Kamu jarang meledak karena terbiasa refleksi diri.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Lebih Bersyukur", "Banyak hal kecil yang ternyata layak disyukuri setelah kamu tulis.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Kenangan Terekam Rapi", "Journaling bikin kamu bisa nostalgia kapan aja.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Mental Health Terjaga", "Menulis bantu kamu tetap waras di tengah sibuknya hidup.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Hidup Lebih Bermakna", "Kamu makin sadar setiap fase hidup punya pelajaran berharga.", R.drawable.sleepearlier, "null")

            )
        ),
        Habit(
            id = 6,
            title = "Bikin to-do list harian",
            description = "Biar hari nggak kerasa berantakan.",
            image = R.drawable.todo,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Lebih Fokus", "Hari ini kamu nggak bingung mau ngapain dulu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Lebih Produktif", "Kamu mulai kelarin tugas tepat waktu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Nggak Overwhelm", "To-do list bikin tugas besar terasa lebih ringan.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Lebih Puas Sama Diri", "Senang banget tiap bisa centang satu-satu tugas.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Manajemen Waktu Membaik", "Kamu makin jago bagi waktu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Lebih Percaya Diri", "Pencapaianmu bikin kamu makin pede.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Karier Makin Cemerlang", "Kamu dikenal rapi dan teratur.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Lebih Punya Kendali", "Hidupmu nggak lagi kebawa arus.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Hidup Terencana", "Kamu hidup lebih terarah dan tenang.", R.drawable.sleepearlier, "null")

            )
        )
        ,Habit(
            id = 7,
            title = "Mencatat pengeluaran",
            description = "Biar kamu makin melek ke mana uangmu pergi.",
            image = R.drawable.money,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Sadar Pengeluaran", "Kamu mulai tahu habisnya uang buat apa aja.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Kontrol Lebih Baik", "Kamu mulai mikir dua kali sebelum beli sesuatu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Punya Dana Cadangan", "Ada sisa uang yang bisa kamu tabung.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Bisa Bedain Kebutuhan & Keinginan", "Nggak gampang kebobolan belanja impulsif.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Punya Target Keuangan", "Kamu mulai bikin goal keuangan jangka panjang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Lebih Tenang", "Kamu nggak panik walau tanggal tua datang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Punya Investasi", "Keuanganmu makin sehat dan berkembang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Stabil Finansial", "Hidupmu lebih aman tanpa utang numpuk.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Mandiri Finansial", "Kamu bebas atur hidupmu tanpa khawatir duit.", R.drawable.sleepearlier, "null")

            )
        ),
        Habit(
            id = 8,
            title = "Kurangi fast food",
            description = "Supaya badan lebih sehat dan nggak gampang sakit.",
            image = R.drawable.junkfood,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Perut Lebih Ringan", "Nggak merasa begah atau kembung setelah makan.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Nafsu Makan Stabil", "Nggak craving junk food terus.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Kulit Lebih Bersih", "Jerawat mulai berkurang.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Berat Badan Turun", "Kamu mulai merasa lebih ringan.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Lebih Sehat", "Tes kesehatanmu makin bagus.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Kebiasaan Sehat", "Nggak lagi ngidam fast food tiap minggu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Dompet Lebih Tebal", "Uangmu banyak tersisa karena nggak jajan junk food.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Kesehatan Optimal", "Kamu jarang sakit dan badan makin fit.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Panjang Umur", "Tubuhmu awet sehat karena pola makan baik.", R.drawable.sleepearlier, "null")
            )
        ),
        Habit(
            id = 9,
            title = "Beresin kamar tiap pagi",
            description = "Biar pikiranmu juga ikut rapi kayak kamarmu.",
            image = R.drawable.bedroom,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Mood Lebih Oke", "Lihat kamar rapi bikin hati adem.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Mulai Jadi Kebiasaan", "Bangun tidur langsung pengin beres-beres.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Fokus Meningkat", "Kamu lebih konsentrasi belajar atau kerja.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Lebih Produktif", "Nggak buang waktu cari barang yang berantakan.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Hidup Terasa Ringan", "Nggak merasa sumpek sama kamar berantakan.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Pikiran Tenang", "Kamu lebih jarang stres.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Disiplin Terasah", "Kamu makin rajin di hal-hal lain juga.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Jadi Kebiasaan Permanen", "Nggak perlu disuruh, langsung beresin.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Rumah Idaman", "Lingkungan bersih jadi standar hidupmu.", R.drawable.sleepearlier, "null")
            )
        ),
        Habit(
            id = 10,
            title = "Berani bilang \"nggak\"",
            description = "Supaya kamu nggak gampang dimanfaatkan orang",
            image = R.drawable.sayno,
            simulations = listOf(
                Simulation("Day 1", "Sehari setelahnya", "Nggak Terbebani", "Kamu lega setelah berani menolak hal yang nggak kamu mau.", R.drawable.sleepearlier, "null"),
                Simulation("Day 7", "Seminggu setelahnya", "Lebih Percaya Diri", "Kamu mulai nyaman bilang nggak tanpa rasa bersalah.", R.drawable.sleepearlier, "null"),
                Simulation("Day 30", "Sebulan setelahnya", "Punya Batasan Sehat", "Orang lain makin menghargaimu.", R.drawable.sleepearlier, "null"),
                Simulation("Day 90", "Tiga bulan setelahnya", "Lebih Bahagia", "Nggak merasa hidupmu diatur orang lain.", R.drawable.sleepearlier, "null"),
                Simulation("Day 180", "Enam bulan setelahnya", "Mental Kuat", "Kamu nggak gampang dibohongi atau dibujuk.", R.drawable.sleepearlier, "null"),
                Simulation("Day 365", "Setahun setelahnya", "Lebih Mandiri", "Keputusanmu makin tegas.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1095", "Tiga tahun setelahnya", "Hidup Lebih Sehat", "Kamu lebih damai karena nggak memaksakan diri.", R.drawable.sleepearlier, "null"),
                Simulation("Day 1825", "Lima tahun setelahnya", "Jadi Panutan", "Orang lain kagum sama caramu menjaga diri.", R.drawable.sleepearlier, "null"),
                Simulation("Day 3650", "Sepuluh tahun setelahnya", "Hidup Penuh Kendali", "Kamu tahu apa yang kamu mau, nggak goyah.", R.drawable.sleepearlier, "null")
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



