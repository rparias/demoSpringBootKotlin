package com.ronaldarias.springboot.demo.datasource.mock

import com.ronaldarias.springboot.demo.datasource.BankDataSource
import com.ronaldarias.springboot.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 1.0, 1),
        Bank("2345", 3.1, 10),
        Bank("3456", 2.3, 17),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}