package kata.domain.events.service.listeners

import kata.domain.events.domain.events.BookChangedInfo
import kata.domain.events.service.EmailService
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionPhase
import org.springframework.transaction.event.TransactionalEventListener

@Component
class BookChangedInfoListener(
    val emailService: EmailService
) {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    fun notifyAuthorByEmail(bookChangedInfo: BookChangedInfo) {
        bookChangedInfo.authorEmail?.let {
            emailService.send(it, "Your book's info has been changed")
        }
    }
}