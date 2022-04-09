package com.appscals.googleclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.appscals.googleclone.R

@Composable
fun AccountDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountDialogUI()
    }
}

@Preview(showBackground = true)
@Composable
fun AccountDialogPreview() {
    AccountDialogUI()
}

@Composable
fun AccountDialogUI(modifier: Modifier = Modifier) {
    Card() {
        Column(modifier = modifier.background(Color.White)) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Rounded.Close, "CloseDialog",
                        modifier = modifier.weight(0.5f)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "gLogo",
                    modifier = modifier
                        .weight(2.0f)
                        .size(50.dp)
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                )
                Column(
                    modifier = modifier
                        .weight(2.0f)
                        .padding(start = 16.dp)
                ) {
                    Text(text = "Karen Calulo", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "kcalulo@gmail.com")
                }
                Text(
                    text = "99+", modifier = modifier
                        .padding(end = 16.dp)
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier = modifier.requiredWidth(200.dp),
                    border = BorderStroke(1.dp, Color.LightGray),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Text(
                        text = "Manage Google Account",
                        modifier = modifier.padding(8.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = modifier.width(10.dp))
            }
            Divider(
                modifier = modifier.padding(top = 16.dp, bottom = 16.dp),
                color = Color.LightGray
            )
        }
    }

}
