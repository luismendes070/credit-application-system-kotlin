package me.dio.credit.application.system.entity

data class Customer (
    var firstName: String = "",
    var secondName: String = "",
    var cpf: String,
    var email: String = "",
    var password: String = "",
    var address: Address = Address(),
    var credits: List<Credit> = mutableListOf(),
    var id: Long? = null
    )