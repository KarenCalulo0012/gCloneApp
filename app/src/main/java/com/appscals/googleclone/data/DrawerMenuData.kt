package com.appscals.googleclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {
    object AllInboxes : DrawerMenuData(
        icon = Icons.Rounded.AllInbox,
        title = "All Inboxes"
    )

    object Primary : DrawerMenuData(
        icon = Icons.Rounded.Inbox,
        title = "Primary"
    )

    object Social : DrawerMenuData(
        icon = Icons.Rounded.People,
        title = "Social"
    )

    object Promotions : DrawerMenuData(
        icon = Icons.Rounded.Sell,
        title = "Promotions"
    )

    object Starred : DrawerMenuData(
        icon = Icons.Rounded.Star,
        title = "Starred"
    )

    object Snoozed : DrawerMenuData(
        icon = Icons.Rounded.Snooze,
        title = "Snoozed"
    )

    object Sent : DrawerMenuData(
        icon = Icons.Rounded.MarkEmailRead,
        title = "Sent"
    )

    object Outbox : DrawerMenuData(
        icon = Icons.Rounded.Outbox,
        title = "Outbox"
    )

    object Spam : DrawerMenuData(
        icon = Icons.Rounded.Report,
        title = "Spam"
    )

    object Trash : DrawerMenuData(
        icon = Icons.Rounded.Delete,
        title = "Trash"
    )

    object Calendar : DrawerMenuData(
        icon = Icons.Rounded.CalendarViewMonth,
        title = "Calendar"
    )

    object Contacts : DrawerMenuData(
        icon = Icons.Rounded.AccountCircle,
        title = "Contacts"
    )

    object Settings : DrawerMenuData(
        icon = Icons.Rounded.Settings,
        title = "Settings"
    )

    object Help : DrawerMenuData(
        icon = Icons.Rounded.HelpOutline,
        title = "Help & Feedback"
    )

    object Divider : DrawerMenuData(
        isDivider = true
    )

    object Header1 : DrawerMenuData(
        title = "All Labels",
        isHeader = true
    )

    object Header2 : DrawerMenuData(
        title = "Google Apps",
        isHeader = true
    )

}
