package kata.domain.events.domain.events

import kata.domain.events.domain.Book
import kata.domain.events.domain.BookArchive
import java.time.OffsetDateTime

class BookUpdated(book: Book) {
    val bookArchive = BookArchive(
        book = book,
        name = book.name,
        description = book.description,
        dateArchiveCreated = OffsetDateTime.now(),
        lastDateVersionUpdated = book.lastDateUpdated ?: book.dateCreated,
        soldBooks = book.bookSales.size
    )
}
