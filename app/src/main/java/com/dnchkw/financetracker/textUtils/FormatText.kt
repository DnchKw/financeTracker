package com.dnchkw.financetracker.textUtils

fun String.formatText(maxChars: Int): String {
    return if(this.length >= maxChars) {
        this.slice(0..maxChars) + "..."
    } else {
        this
    }
}