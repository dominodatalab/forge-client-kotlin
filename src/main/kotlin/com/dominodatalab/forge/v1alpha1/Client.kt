package com.dominodatalab.forge.v1alpha1

import com.dominodatalab.forge.ClientApi
import io.kubernetes.client.openapi.apis.CustomObjectsApi

class Client(val customObjectsApi: CustomObjectsApi) : ClientApi {
    override fun createContainerImageBuild(name: String): String {
        return "things work"
    }
}
