package com.ronaldarias.springboot.demo.model

data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)

// When data is before the class name, behind scenes it adds methods like equals, hashCode or toString