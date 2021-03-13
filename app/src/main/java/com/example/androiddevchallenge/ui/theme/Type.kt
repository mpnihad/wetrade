/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

// Set of Material typography styles to start with
val typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

private val appFontFamily = FontFamily(
    fonts = listOf(

        Font(
            resId = R.font.montserrat_bold,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),

        Font(
            resId = R.font.montserrat_extra_bold,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Normal
        ),

        Font(
            resId = R.font.montserrat_light,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.montserrat_medium,
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),

        Font(
            resId = R.font.montserrat_semibold,
            weight = FontWeight.SemiBold,
            style = FontStyle.Normal
        ),

    )
)

private val defaultTypography = Typography()
val appTypography = Typography(
    h1 = defaultTypography.h1.copy(fontFamily = appFontFamily, fontSize = 40.sp, letterSpacing = 1.25.sp, fontWeight = FontWeight.ExtraBold, fontStyle = FontStyle.Normal),
    h2 = defaultTypography.h2.copy(fontFamily = appFontFamily, fontSize = 36.sp, letterSpacing = 0.sp, fontWeight = FontWeight.ExtraBold, fontStyle = FontStyle.Normal),
    h3 = defaultTypography.h3.copy(fontFamily = appFontFamily, fontSize = 13.sp, letterSpacing = 0.sp, fontWeight = FontWeight.SemiBold, fontStyle = FontStyle.Normal),
    h4 = defaultTypography.h4.copy(fontFamily = appFontFamily),
    h5 = defaultTypography.h5.copy(fontFamily = appFontFamily),
    h6 = defaultTypography.h6.copy(fontFamily = appFontFamily),
    subtitle1 = defaultTypography.subtitle1.copy(fontFamily = appFontFamily, fontSize = 15.sp, letterSpacing = 0.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.Medium),
    subtitle2 = defaultTypography.subtitle2.copy(fontFamily = appFontFamily),
    body1 = defaultTypography.body1.copy(fontFamily = appFontFamily, fontSize = 13.sp, letterSpacing = 0.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.Light),
    body2 = defaultTypography.body2.copy(fontFamily = appFontFamily, fontSize = 12.sp, letterSpacing = 0.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.Light),
    button = defaultTypography.button.copy(fontFamily = appFontFamily, fontSize = 13.sp, letterSpacing = 1.25.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.Bold),
    caption = defaultTypography.caption.copy(fontFamily = appFontFamily, fontSize = 12.sp, letterSpacing = 0.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.SemiBold),
    overline = defaultTypography.overline.copy(fontFamily = appFontFamily)
)
