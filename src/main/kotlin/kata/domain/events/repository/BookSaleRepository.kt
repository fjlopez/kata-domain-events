package kata.domain.events.repository

import kata.domain.events.domain.BookSale
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookSaleRepository:  JpaRepository<BookSale, Long>