package kata.domain.events.service

interface EmailService {
    fun send(email: String, message: String)
}
