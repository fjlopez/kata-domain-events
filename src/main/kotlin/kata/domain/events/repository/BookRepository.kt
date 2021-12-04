package kata.domain.events.repository

import kata.domain.events.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository:  JpaRepository<Book, Long>