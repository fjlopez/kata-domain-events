package kata.domain.events.service.listeners

import kata.domain.events.domain.events.BookUpdated
import kata.domain.events.repository.BookArchiveRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionPhase
import org.springframework.transaction.event.TransactionalEventListener


@Component
class BookUpdatedListener(
    val bookArchiveRepository: BookArchiveRepository,
) {
    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    fun archiveBook(bookUpdated: BookUpdated) {
        bookArchiveRepository.save(bookUpdated.bookArchive)
    }
}
