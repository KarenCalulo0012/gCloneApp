package com.appscals.googleclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.appscals.googleclone.data.DrawerMenuData
import java.util.*

@Composable
fun DrawerMenu(scrollState: ScrollState) {

    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.Header1,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Sent,
        DrawerMenuData.Outbox,
        DrawerMenuData.Spam,
        DrawerMenuData.Trash,
        DrawerMenuData.Header2,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Settings,
        DrawerMenuData.Help
    )


    Column(Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Gmail",
            color = Color.Red,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontWeight = FontWeight.Bold,
        )
        menuList.forEach {

            when {
                it.isDivider -> {
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                }
                it.isHeader -> {
                    Text(
                        text = it.title!!.uppercase(Locale.getDefault()),
                        modifier = Modifier.padding(20.dp),
                        fontWeight = FontWeight.Light
                    )
                }
                else -> {
                    DrawerMenuItem(item = it)
                }
            }
        }
    }
}

@Composable
fun DrawerMenuItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier
                .weight(0.5f)
                .fillMaxHeight()
        )
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}