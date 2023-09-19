package de.heizungshelden.routes

import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.post
import io.ktor.server.testing.testApplication
import kotlin.test.Test

class PostEstimateTest {

    @Test
    fun `test receiving estimate post request`() = testApplication{
        val response = client.post(
            url = "/estimate",
        )
    }
}