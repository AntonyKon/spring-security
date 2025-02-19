package com.example.springsecurityold.domain.entity

import com.example.springsecurityold.domain.enumerated.EmployeeType
import javax.persistence.*

@Entity
@Table(name = "employees")
class Employee (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
    @Column(name = "phone", nullable = false)
    var phone: String,
    @Column(name = "work_hours", nullable = false)
    var workHours: String,
    @Column(name = "emplyee_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    var employeeType: EmployeeType,
    @Column(name = "user_id", nullable = false)
    var userId: Long,
    @Column(name = "speciality", nullable = false)
    var speciality: String,
    @Column(name = "full_name", nullable = false)
    var fullName: String
)