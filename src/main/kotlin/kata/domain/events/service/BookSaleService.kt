package kata.domain.events.service

import javax.transaction.Transactional

interface BookSaleService {

    @Transactional
    fun sellBook(bookId: Long)
}
