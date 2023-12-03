package me.dio.credit.application.system.repository

import me.dio.credit.application.system.ennumeration.JpaRepository
import me.dio.credit.application.system.entity.Credit
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Repository
interface CreditRepository: JpaRepository<Credit, Long> {
    fun save(credit: Credit): Credit

    @Query(value="SELECT * FROM CREDIT WHERE CREDIT_ID = ?l", nativeQuery = true)
    fun findAllByCredits(customerId: Long): List<Credit>


}