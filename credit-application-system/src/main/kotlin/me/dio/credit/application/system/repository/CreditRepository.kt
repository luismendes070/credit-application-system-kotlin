package me.dio.credit.application.system.repository

import me.dio.credit.application.system.ennumeration.JpaRepository
import me.dio.credit.application.system.entity.Credit
import org.springframework.stereotype.Repository


@Repository
interface CreditRepository: JpaRepository<Credit, Long> {



}