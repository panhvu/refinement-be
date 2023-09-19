package de.heizungshelden.plugins

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.application.Application
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation

fun Application.json() {
    install(ContentNegotiation) {
        json()
    }
}
