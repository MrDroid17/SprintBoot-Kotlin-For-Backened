package com.mrdroid.testspring.springkotlin.repositories

import com.mrdroid.testspring.springkotlin.models.Book
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : MongoRepository<Book, String> {

}