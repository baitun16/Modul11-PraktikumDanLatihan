package com.example.modul11praktikum.model

import com.google.gson.annotations.SerializedName
//untuk pengambilan data sesuai value dan pendelarasian tipe data
data class Photo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("thumbnailUrl")
    val thumbnail: String?,
    @SerializedName("url")
    val body: String?
)