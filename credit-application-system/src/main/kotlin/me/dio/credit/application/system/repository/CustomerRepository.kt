package me.dio.credit.application.system.repository

import me.dio.credit.application.system.ennumeration.JpaRepository
import me.dio.credit.application.system.entity.Customer
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {

}