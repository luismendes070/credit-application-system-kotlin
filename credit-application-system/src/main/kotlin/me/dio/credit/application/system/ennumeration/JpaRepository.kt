package me.dio.credit.application.system.ennumeration

import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import org.springframework.stereotype.Repository

@Repository
interface JpaRepository {

    fun save(customer: Customer)

}