package com.mrdroid.testspring.springkotlin.models

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Book (
        val _id:String? = null,

        val name: String,

        val genre: String,

        val author: String,

        val description:String,

        val price: Int
)


