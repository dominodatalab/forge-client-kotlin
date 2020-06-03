package com.dominodatalab.forge.v1alpha1

import io.kubernetes.client.openapi.apis.CustomObjectsApi
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ClientTest {
    @Test
    fun `things should work`() {
        val mockApi = mockk<CustomObjectsApi>()
        val client = Client(mockApi)

        val actual = client.createContainerImageBuild("unused")
        assertEquals("things work", actual)
    }
}
