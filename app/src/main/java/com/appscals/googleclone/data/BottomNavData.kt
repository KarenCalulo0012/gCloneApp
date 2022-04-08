package com.appscals.googleclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Mail
import androidx.compose.material.icons.rounded.Videocam
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavData(
    val icon: ImageVector? = null,
    val title: String? = null
) {
    object Mail : BottomNavData(icon = Icons.Rounded.Mail, title = "Mail")
    object Meet : BottomNavData(icon = Icons.Rounded.Videocam, title = "Meet")
}
