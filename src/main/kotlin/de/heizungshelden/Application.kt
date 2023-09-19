package de.heizungshelden

import de.heizungshelden.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    // self-containe package, includes Netty configuration
    // starts embedded server with main application
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
//        .start(wait = true)
    EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
    json()
}
