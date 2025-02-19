package com.example.springsecurityold.domain.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "visits")
class Visit (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
    @Column(name = "client_id", nullable = false)
    var clientId: Long,
    @Column(name = "doctor_id", nullable = false)
    var doctorId: Long,
    @Column(name = "visit_notes", nullable = false)
    var visitNotes: String,
    @Column(name = "visit_time", nullable = false)
    var visitTime: LocalDateTime
)