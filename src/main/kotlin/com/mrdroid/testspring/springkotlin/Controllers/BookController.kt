package com.mrdroid.testspring.springkotlin.Controllers

import com.mrdroid.testspring.springkotlin.models.Book
import com.mrdroid.testspring.springkotlin.services.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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
//    @PutMapping("/books/{id}")
//    fun update

    // for get all book
    @GetMapping("/books")
    fun getAll() = bookService.getAllBooks()

    // get book detail
    @GetMapping("/books/{id}")
    fun getBookDetail(@PathVariable id: String) = bookService.getBookDetail(id)

    // for delete book
    @DeleteMapping("/books/{id}")
    fun deleteBook(@PathVariable id: String) {
       return bookService.deleteBook(id)
    }

}