package kata.domain.events.service

import kata.domain.events.domain.changeInfo
import kata.domain.events.repository.BookRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class BookUpdateServiceImpl(
    private val bookRepository: BookRepository
) : BookUpdateService {

    @Transactional
    override fun updateBook(bookId: Long, name: String, description: String) {
        val book = bookRepository.findById(bookId)
            .orElseThrow {
                NoSuchElementException("Book is not found")
            }
        book.changeInfo(name, description)
        bookRepository.save(book)
    }
}