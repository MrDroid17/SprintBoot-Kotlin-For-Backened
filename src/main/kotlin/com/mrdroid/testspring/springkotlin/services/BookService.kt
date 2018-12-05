package com.mrdroid.testspring.springkotlin.services

import com.mrdroid.testspring.springkotlin.models.Book
import com.mrdroid.testspring.springkotlin.repositories.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService {
    @Autowired
    lateinit var bookRepository: BookRepository

    // save or add book
    fun save(book: Book): Book {
        return bookRepository.save(book)
    }

    // for edit book
    // for get all book
    // for get book details
    // for delete book

}