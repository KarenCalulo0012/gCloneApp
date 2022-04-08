package com.appscals.googleclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun MailFAB(scrollState: ScrollState) {
    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp) },
            icon = { Icon(imageVector = Icons.Rounded.Edit, contentDescription = "Compose") },
            backgroundColor = MaterialTheme.colors.surface,
            onClick = { /*TODO*/ })
    } else {
        FloatingActionButton(
            backgroundColor = MaterialTheme.colors.surface,
            onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Rounded.Edit, contentDescription = "Compose")
        }
    }
}
