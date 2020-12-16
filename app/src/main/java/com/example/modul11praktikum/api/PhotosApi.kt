package com.example.modul11praktikum.api

import com.example.modul11praktikum.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    //untuk mengambil value photos dan di simpan dalam getPhotos
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}