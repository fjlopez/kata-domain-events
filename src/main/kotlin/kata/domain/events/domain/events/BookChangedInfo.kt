package kata.domain.events.domain.events

import kata.domain.events.domain.Book

class BookChangedInfo(book: Book) {
    val authorEmail by lazy { book.author?.email }
}
