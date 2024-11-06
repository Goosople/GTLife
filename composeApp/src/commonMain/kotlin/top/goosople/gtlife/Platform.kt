package top.goosople.gtlife

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform