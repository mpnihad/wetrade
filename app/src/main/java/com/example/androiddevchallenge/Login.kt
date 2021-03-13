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

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Password
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
import com.example.androiddevchallenge.ui.theme.MyTheme

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                // A surface container using the 'background' color from the theme
                MyAppLogin() {

                    startActivity(Intent(this, ContentActivity::class.java))
                }
            }
        }
    }
}

@Composable
fun MyAppLogin(onLoginClicked: () -> Unit) {
    Surface(color = MaterialTheme.colors.surface) {
        Column(

            modifier = Modifier.fillMaxSize()
        ) {
            Box() {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_login_bg),
                    contentDescription = "main_background",
                    modifier = Modifier.fillMaxWidth(),
                )
                Text(
                    text = "Welcome back",
                    style = MaterialTheme.typography.h2.copy(color = MaterialTheme.colors.onBackground),

                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally)
                        .paddingFromBaseline(top = 152.dp)

                )
            }
            Spacer(Modifier.padding(top = 40.dp))
            EditText("Email address", Icons.Filled.MailOutline)
            EditText("Password ", Icons.Filled.Password)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp)
                    .height(48.dp)
                    .clickable {
                        onLoginClicked()
                    }
                    .background(
                        color = MaterialTheme.colors.primary,
                        shape = RoundedCornerShape(24.dp)
                    ),
            ) {
                Text(
                    "LOGIN",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(align = Alignment.Center),
                    style = MaterialTheme.typography.button.copy(
                        color = MaterialTheme.colors.onPrimary

                    )
                )
            }
        }
    }
}

@Composable
fun EditText(hint: String, icPassword: ImageVector) {
    var inputValue = remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = inputValue.value,
        onValueChange = { changedValue ->
            inputValue.value = changedValue
        },
        placeholder = {
            Text(
                hint,
                style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface)
            )
        },
        leadingIcon = {
            Icon(
                icPassword,
                contentDescription = hint,
                Modifier.size(24.dp)
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
            .padding(start = 16.dp, end = 16.dp, top = 8.dp)
            .border(
                BorderStroke(1.dp, color = MaterialTheme.colors.onSurface),
                shape = RoundedCornerShape(4.dp)
            )
    )
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyTheme {
        MyAppLogin() {
        }
    }
}
