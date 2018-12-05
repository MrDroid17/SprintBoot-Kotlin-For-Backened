package com.mrdroid.testspring.springkotlin.Controllers

import com.mrdroid.testspring.springkotlin.models.Book
import com.mrdroid.testspring.springkotlin.services.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {
    @Autowired
    lateinit var bookService: BookService

    // save new book
    @PostMapping("/books")
    fun create(@RequestBody book: Book): Book {
        return bookService.save(book)
    }

    // for edit book
    // for get all book
    // for get book details
    // for delete book

}