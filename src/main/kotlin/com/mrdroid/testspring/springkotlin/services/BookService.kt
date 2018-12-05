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
//    fun updateBook(id: String): Book {
//        return bookRepository.
//    }

    // for get all book
    fun getAllBooks(): List<Book> = bookRepository.findAll()

    // for get book details
    fun getBookDetail(id: String) = bookRepository.findById(id)

    // for delete book
    fun deleteBook(id:String) = bookRepository.deleteById(id)

}