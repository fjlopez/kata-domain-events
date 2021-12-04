package kata.domain.events.domain.events

import kata.domain.events.domain.Book
import kata.domain.events.domain.BookSale
import java.time.OffsetDateTime

class BookSold(book: Book) {
    val bookSale = BookSale(
        book = book,
        dateSold = OffsetDateTime.now(),
        priceSold = book.price
    )
    val totalSoldBooksCount by lazy { book.bookSales.count() }
    val authorEmail by lazy { book.author?.email }
}
