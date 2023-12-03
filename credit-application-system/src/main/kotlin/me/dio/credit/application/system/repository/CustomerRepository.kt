package me.dio.credit.application.system.repository

import org.springframework.data.jpa.repository.JpaRepository
import me.dio.credit.application.system.entity.Customer
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {

}