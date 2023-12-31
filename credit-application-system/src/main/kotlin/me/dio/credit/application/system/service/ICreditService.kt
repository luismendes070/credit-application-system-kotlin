package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Credit
import java.util.*


interface ICreditService {

    fun save(credit: Credit): List<Credit>

    fun findAllByCustomer(customerId: Long): List<Credit>

    fun findByCreditCode(creditCode: UUID): Credit

}