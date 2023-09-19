package de.heizungshelden.routes

import de.heizungshelden.model.EstimateDTO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.testing.testApplication
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class PostEstimateTest {

    @Test
    fun `test receiving estimate post request`() = testApplication {
        val client = createClient {
            install(ContentNegotiation) {
                json()
            }
        }
        val estimateDTO = EstimateDTO(1)
        val response = client.post("/estimate") {
            contentType(ContentType.Application.Json)
            setBody(estimateDTO)
        }
        assertEquals(Json.encodeToString(estimateDTO), response.bodyAsText())
        assertEquals(HttpStatusCode.Created, response.status)
    }
}
