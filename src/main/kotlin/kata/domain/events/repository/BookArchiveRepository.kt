package kata.domain.events.repository

import kata.domain.events.domain.BookArchive
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookArchiveRepository:  JpaRepository<BookArchive, Long>