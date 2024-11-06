package top.goosople.gtlife

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "GT Life",
    ) {
        App()
    }
}