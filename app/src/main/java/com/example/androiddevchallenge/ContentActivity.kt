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
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.BrowseTheme
import com.example.androiddevchallenge.ui.theme.MyTheme

class ContentActivity : AppCompatActivity() {
    val browseTheme: MutableList<BrowseTheme> = mutableListOf(
        BrowseTheme(
            "$7,918",
            -0.54f,
            "ALK",
            "Alaska Air Group,Inc",
            R.drawable.ic_home_alk
        ),
        BrowseTheme(
            "$1,293",
            4.18f,
            "BA",
            "Boeing Co.",
            R.drawable.ic_home_ba
        ),
        BrowseTheme(
            "$893.50",
            -0.54f,
            "DAL",
            "Delta Airlines Inc.",
            R.drawable.ic_home_dal
        ),
        BrowseTheme(
            "$12,301",
            2.51f,
            "EXPE",
            "AExpedia group Inc.",
            R.drawable.ic_home_exp
        ),
        BrowseTheme(
            "$12,301",
            1.38f,
            "EADSY",
            "Airbus SE",
            R.drawable.ic_home_eadsy
        ),
        BrowseTheme(
            "$8,521",
            1.56f,
            "JBLU",
            "Jetblue Airways Crop.",
            R.drawable.ic_home_jblu
        ),
        BrowseTheme(
            "$521",
            2.75f,
            "MAR",
            "Marriott International Inc",
            R.drawable.ic_home_mar
        ),
        BrowseTheme(
            "$5,481",
            0.14f,
            "CCL",
            "Carnival Crop",
            R.drawable.ic_home_ccl
        ),
        BrowseTheme(
            "$9,184",
            1.69f,
            "RCL",
            "Royal Caribbean Cruises",
            R.drawable.ic_home_rcl
        ),
        BrowseTheme(
            "$654",
            3.23f,
            "TRVL",
            "Travelocity Inc",
            R.drawable.ic_home_trvl
        )
    )
    val rowModel: MutableList<String> = mutableListOf(
        "Week", "ETFs", "Stocks", "Funds", "Money"
    )

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MyContentApp(browseTheme, rowModel)
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun MyContentApp(browseTheme: MutableList<BrowseTheme>, rowModel: MutableList<String>) {

    LazyColumn() {

        item {
            Row(
                modifier = Modifier.paddingFromBaseline(top = 40.dp)
            ) {
                Text(
                    "ACCOUNT",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.button.copy(
                        color = MaterialTheme.colors.onBackground
                    )
                )
                Text(
                    "WATCHLIST",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.button.copy(
                        color = MaterialTheme.colors.onBackground.copy(alpha = 0.5f)
                    )
                )
                Text(
                    "PROFILE",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.button.copy(
                        color = MaterialTheme.colors.onBackground.copy(alpha = 0.5f)
                    )
                )
            }
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                "Balance",
                modifier = Modifier
                    .fillMaxWidth()
                    .paddingFromBaseline(top = 32.dp)
                    .wrapContentWidth(align = Alignment.CenterHorizontally),
                style = MaterialTheme.typography.subtitle1.copy(
                    color = MaterialTheme.colors.onBackground
                )
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))

            Text(
                "$73,589.01",
                modifier = Modifier
                    .fillMaxWidth()
                    .paddingFromBaseline(top = 48.dp)
                    .wrapContentWidth(align = Alignment.CenterHorizontally),
                style = MaterialTheme.typography.h1.copy(
                    color = MaterialTheme.colors.onBackground
                )
            )
            Spacer(modifier = Modifier.padding(top = 24.dp))
            Text(
                "+412.35 today",
                modifier = Modifier
                    .fillMaxWidth()
                    .paddingFromBaseline(top = 16.dp)
                    .wrapContentWidth(align = Alignment.CenterHorizontally),
                style = MaterialTheme.typography.subtitle1.copy(
                    color = MaterialTheme.colors.primaryVariant
                )
            )

            Spacer(modifier = Modifier.padding(top = 32.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 8.dp)
                    .height(48.dp)
                    .background(
                        color = MaterialTheme.colors.primary,
                        shape = RoundedCornerShape(24.dp)
                    ),
            ) {
                Text(
                    "TRANSACT",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(align = Alignment.Center),
                    style = MaterialTheme.typography.button.copy(
                        color = MaterialTheme.colors.onPrimary

                    )
                )
            }
            Spacer(modifier = Modifier.padding(top = 26.dp))

            LazyRow(
                modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()
                    .padding(start = 8.dp)
            ) {

                itemsIndexed(rowModel) { index, item ->

                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 8.dp)
                            .border(
                                BorderStroke(1.dp, color = MaterialTheme.colors.onBackground),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .background(
                                color = Color.Transparent,

                            ),
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(start = 16.dp, end = 16.dp)
                        ) {
                            Text(
                                item,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(align = Alignment.Center),
                                style = MaterialTheme.typography.body1.copy(
                                    color = MaterialTheme.colors.onBackground

                                )
                            )
                            if (index == 0) {
                                Icon(
                                    Icons.Filled.ExpandMore,
                                    contentDescription = "expand",
                                    Modifier
                                        .fillMaxSize()
                                        .wrapContentHeight(align = Alignment.CenterVertically)
                                        .size(16.dp)
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.padding(top = 16.dp))

            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_illos),
                contentDescription = "main_background",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
            )
            Spacer(modifier = Modifier.padding(top = 32.dp))

//               Row()
//               {
//
//                   horizontalDivider()
//                   horizontalDivider()
//                   horizontalDivider()
//                   horizontalDivider()
//                   horizontalDivider()
//                   horizontalDivider()
//                   horizontalDivider()
//
//               }
//                Column() {
//                    Divider(
//                        color = Color.White,
//                        modifier=Modifier.width(1.dp).weight(1f)
//                    )
//                    Divider(color = Color.White,
//                        modifier=Modifier.width(1.dp).weight(1f))
//                    Divider(color = Color.White,
//                        modifier=Modifier.width(1.dp).weight(1f))
//                    Divider(color = Color.White,
//                        modifier=Modifier.width(1.dp).weight(1f))
//                    Divider(color = Color.White,
//                        modifier=Modifier.width(1.dp).weight(1f))
//                }
//            }
        }
        item {
            Box(
                Modifier.background(
                    color = MaterialTheme.colors.surface
                )
            ) {

                Column() {

                    Text(
                        "Positions",
                        modifier = Modifier
                            .fillMaxWidth()
                            .paddingFromBaseline(top = 40.dp)
                            .wrapContentWidth(align = Alignment.CenterHorizontally),
                        style = MaterialTheme.typography.subtitle1.copy(
                            color = MaterialTheme.colors.onSurface
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 24.dp))
                    Column() {
                        browseTheme.forEach {
                            ContentScreen(it)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ContentScreen(item: BrowseTheme) {
    Divider(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        color = MaterialTheme.colors.onSurface
    )
    Row(modifier = Modifier.height(56.dp).padding(start = 16.dp, end = 16.dp)) {

        val isPercentageNegative = item.percent <0
        Column(
            modifier = Modifier.paddingFromBaseline(top = 24.dp)
        ) {
            Row() {
                Text(
                    item.money,
                    style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface),

                    modifier = Modifier.width(64.dp)
                )
                Text(
                    item.stock,
                    style = MaterialTheme.typography.h3.copy(color = MaterialTheme.colors.onSurface),
                )
            }
            Row() {
                Text(
                    if (!isPercentageNegative) { "+" } else { "" } + item.percent.toString() + "%",
                    style = MaterialTheme.typography.body1.copy(color = if (isPercentageNegative) { MaterialTheme.colors.secondary } else { MaterialTheme.colors.primaryVariant }),

                    modifier = Modifier.width(64.dp)
                )
                Text(
                    item.detail,
                    style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface),

                )
            }
        }
        Image(
            imageVector = ImageVector.vectorResource(id = item.image),
            contentDescription = "main_background",
            modifier = Modifier.fillMaxSize().wrapContentSize(align = Alignment.CenterEnd)
        )
    }
}

@Composable
fun horizontalDivider() {
    Box(
        modifier = Modifier
            .width(1.dp)
            .fillMaxHeight()
            .background(color = Color.White)
    ) {
    }
}

/*

 Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {

        SearchText("Search")
        Text(
            "Browse themes",
            Modifier
                .paddingFromBaseline(top = 32.dp)
                .padding(start = 16.dp),
            style = MaterialTheme.typography.h1
        )
        LazyRow(

            Modifier.padding(top = 16.dp, start = 16.dp)
        ) {
            itemsIndexed(browseTheme) { index: Int, item: BrowseTheme ->
                Box(
                    modifier = Modifier
                        .padding(start = 8.dp, bottom = 2.dp)
                        .size(136.dp)
                        .shadow(elevation = 1.dp, shape = RoundedCornerShape(4.dp), clip = true)
                ) {

                    Box(
                        modifier = Modifier
                            .background(
                                color = MaterialTheme.colors.background,
                                shape = RoundedCornerShape(4.dp)
                            )
                            .fillMaxSize()

                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    color = MaterialTheme.colors.surface,
                                    shape = RoundedCornerShape(4.dp)
                                )
                        ) {

                            CoilImage(
                                data = item.imageUrl,
                                contentDescription = item.imageName,
                                contentScale = ContentScale.Crop,
                                fadeIn = true,
                                modifier = Modifier
                                    .height(96.dp)
                                    .fillMaxWidth()

                            )
                            Text(
                                item.imageName,
                                Modifier
                                    .padding(start = 16.dp)
                                    .height(40.dp)
                                    .wrapContentHeight(align = Alignment.CenterVertically),
                                style = MaterialTheme.typography.h2
                            )
                        }
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        ) {
            Text(
                "Design your home garden",
                Modifier
                    .paddingFromBaseline(top = 40.dp),
                style = MaterialTheme.typography.h1
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_logo),
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(align = Alignment.CenterEnd)
                    .size(24.dp),
                contentDescription = "filter",
            )
        }
        Box() {
            LazyColumn(
                modifier = Modifier
                    .padding(bottom = 56.dp)
                    .fillMaxSize()

            ) {
                itemsIndexed(designModel) { index: Int, item: DesignModel ->
                    val checkStatus: MutableState<Boolean> = remember { mutableStateOf(true) }
                    Column(
                        modifier = Modifier
                            .height(64.dp)
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
                    ) {

                        Row() {
                            CoilImage(
                                data = item.imageUrl,
                                contentDescription = item.imageName,
                                contentScale = ContentScale.Crop,
                                fadeIn = true,
                                modifier = Modifier
                                    .size(64.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )

                            Box() {
                                Row() {
                                    Column(
                                        modifier = Modifier
                                            .padding(start = 16.dp)
                                    ) {

                                        Text(
                                            item.imageName,
                                            Modifier
                                                .paddingFromBaseline(top = 24.dp),
                                            style = MaterialTheme.typography.h2
                                        )
                                        Text(
                                            item.imageDescription,
                                            Modifier
                                                .paddingFromBaseline(bottom = 24.dp),
                                            style = MaterialTheme.typography.body1.copy(
                                                MaterialTheme.colors.onPrimary
                                            )
                                        )
                                    }
                                    Box() {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .wrapContentSize(align = Alignment.CenterEnd)
                                                .size(24.dp)
                                                .clip(shape = RoundedCornerShape(4.dp))
                                                .border(
                                                    border = BorderStroke(
                                                        1.dp,
                                                        color = MaterialTheme.colors.secondary
                                                    ),
                                                    shape = RoundedCornerShape(4.dp)
                                                )
                                                .background(
                                                    color = if (index == 0) {
                                                        MaterialTheme.colors.secondary
                                                    } else {
                                                        Color.Transparent
                                                    },
                                                )

                                        )
                                        if (index == 0) {
                                            Icon(
                                                imageVector = ImageVector.vectorResource(id = R.drawable.ic_logo),
                                                contentDescription = "checkbox",
                                                modifier = Modifier
                                                    .fillMaxSize()
                                                    .wrapContentSize(align = Alignment.CenterEnd)

                                                    .wrapContentSize(align = Alignment.Center)
                                                    .padding(4.dp)
                                                    .size(16.dp),
                                                tint = MaterialTheme.colors.onSecondary
                                            )
                                        }
                                    }
                                }
                                Divider(
                                    color = MaterialTheme.colors.onPrimary,
                                    startIndent = 8.dp,
                                    modifier = Modifier.fillMaxHeight().wrapContentHeight(align = Alignment.Bottom)
                                )
                            }
                        }
                    }
                }
            }

            Box(

                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(align = Alignment.BottomCenter)
                    .height(56.dp)
                    .background(MaterialTheme.colors.primary)
                    .fillMaxWidth()

            ) {
                Row() {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    ) {
                        contentDown(R.drawable.ic_logo, "Home")
                    }

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    ) {
                        contentDown(R.drawable.ic_logo, "Favorites")
                    }

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    ) {
                        contentDown(R.drawable.ic_logo, "Profile")
                    }

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    ) {
                        contentDown(R.drawable.ic_logo, "Cart")
                    }
                }
            }
        }
    }

 */
@Composable
private fun contentDown(icon: Int, name: String) {
    Icon(
        imageVector = ImageVector.vectorResource(id = icon),
        contentDescription = name,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .size(24.dp),
        tint = if (name == "Home") {
            MaterialTheme.colors.onBackground
        } else {
            MaterialTheme.colors.primaryVariant
        }
    )
    Text(
        name,
        style = MaterialTheme.typography.caption.copy(
            color = if (name == "Home") {
                MaterialTheme.colors.onBackground
            } else {
                MaterialTheme.colors.primaryVariant
            }
        ),
        modifier = Modifier
            .fillMaxWidth()

            .wrapContentWidth(align = Alignment.CenterHorizontally)
    )
}

@Composable
fun SearchText(hint: String) {
    val inputValue = remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = inputValue.value,
        onValueChange = { changedValue ->
            inputValue.value = changedValue
        },
        placeholder = {
            Text(

                hint,
                style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onPrimary),
                modifier = Modifier
                    .fillMaxHeight()
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        },

        leadingIcon = {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_logo),
                contentDescription = "Search",
                Modifier.size(18.dp)
            )
        },
        textStyle = MaterialTheme.typography.body1,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        modifier = Modifier

            .height(56.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentHeight(align = Alignment.CenterVertically)
            .padding(start = 16.dp, end = 16.dp)
            .border(
                BorderStroke(1.dp, color = MaterialTheme.colors.onPrimary),
                shape = RoundedCornerShape(4.dp)
            )
    )
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    val browseTheme: MutableList<BrowseTheme> = mutableListOf(
        BrowseTheme(
            "$7,918",
            -0.54f,
            "ALK",
            "Alaska Air Group,Inc",
            R.drawable.ic_home_alk
        ),
        BrowseTheme(
            "$1,293",
            4.18f,
            "BA",
            "Boeing Co.",
            R.drawable.ic_home_ba
        ),
        BrowseTheme(
            "$893.50",
            -0.54f,
            "DAL",
            "Delta Airlines Inc.",
            R.drawable.ic_home_dal
        ),
        BrowseTheme(
            "$12,301",
            2.51f,
            "EXPE",
            "AExpedia group Inc.",
            R.drawable.ic_home_exp
        ),
        BrowseTheme(
            "$12,301",
            1.38f,
            "EADSY",
            "Airbus SE",
            R.drawable.ic_home_eadsy
        ),
        BrowseTheme(
            "$8,521",
            1.56f,
            "JBLU",
            "Jetblue Airways Crop.",
            R.drawable.ic_home_jblu
        ),
        BrowseTheme(
            "$521",
            2.75f,
            "MAR",
            "Marriott International Inc",
            R.drawable.ic_home_mar
        ),
        BrowseTheme(
            "$5,481",
            0.14f,
            "CCL",
            "Carnival Crop",
            R.drawable.ic_home_ccl
        ),
        BrowseTheme(
            "$9,184",
            1.69f,
            "RCL",
            "Royal Caribbean Cruises",
            R.drawable.ic_home_rcl
        ),
        BrowseTheme(
            "$654",
            3.23f,
            "TRVL",
            "Travelocity Inc",
            R.drawable.ic_home_trvl
        )
    )

    val rowModel: MutableList<String> = mutableListOf(
        "Week", "ETFs", "Stocks", "Funds", "Money"
    )
    MyTheme {
        MyContentApp(browseTheme, rowModel)
    }
}
