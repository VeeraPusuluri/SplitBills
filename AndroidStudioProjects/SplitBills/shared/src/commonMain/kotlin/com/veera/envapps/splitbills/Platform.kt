package com.veera.envapps.splitbills

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform