package kata.domain.events.service

import javax.transaction.Transactional

interface BookUpdateService {

    @Transactional
    fun updateBook(bookId: Long, name: String, description: String)
}
