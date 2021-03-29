package org.imanity.framework.kotlin.bukkit

import org.bukkit.entity.Player
import org.imanity.framework.bukkit.util.Chat

/**
 * Chat functions
 */
fun Player.sendRaw(message: String) = Chat.sendRaw(this, message)

fun Player.sendTitleRaw(title: String) = Chat.sendTitleRaw(this, title)