package com.betrybe.trybnb.data.api

import com.betrybe.trybnb.data.models.AuthResponse
import com.betrybe.trybnb.data.models.AuthRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/auth")
    suspend fun authenticate(@Body authRequest: AuthRequest): Response<AuthResponse>
}
