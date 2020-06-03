package com.dominodatalab.forge.v1alpha1

import io.kubernetes.client.openapi.apis.CustomObjectsApi

class Client(customObjectsApi: CustomObjectsApi): ClientApi {
    override fun createContainerImageBuild(name: String): String {
        return "things work"
    }
}
