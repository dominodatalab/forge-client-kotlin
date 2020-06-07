package com.dominodatalab.forge

interface ClientApi {
    fun createContainerImageBuild(name: String): String
}
