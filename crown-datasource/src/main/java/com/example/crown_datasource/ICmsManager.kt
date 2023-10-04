package com.example.crown_datasource

interface ICmsManager {

    fun fetch(isStartUp: Boolean, isFinished: () -> Unit)

    suspend fun getString(): String
    suspend fun getPrivileges(): Any
    suspend fun getCategories(): Any
    suspend fun getRewards(): Any
    suspend fun getTiers(): Any
    suspend fun getStructured(): Any
}