package com.studio.whatif.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.studio.whatif.R

// Font app
val latofontfamily = FontFamily(
    Font(R.font.lato_bold, FontWeight.Bold),
    Font(R.font.lato_light, FontWeight.Light),
    Font(R.font.lato_lightitalic, FontWeight.Light),
    Font(R.font.lato_regular, FontWeight.Normal),
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = latofontfamily ,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = black
    ),
    titleLarge = TextStyle(
        fontFamily = latofontfamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 22.sp,
        color = black
    ),
    bodySmall = TextStyle(
        fontFamily = latofontfamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = black
    ),
//    bodyMedium = TextStyle(
//        fontFamily = latofontfamily,
//        fontWeight = FontWeight.Light,
//        fontStyle = FontStyle.Italic,
//        fontSize = 12.sp,
//        color = black
//    )


)