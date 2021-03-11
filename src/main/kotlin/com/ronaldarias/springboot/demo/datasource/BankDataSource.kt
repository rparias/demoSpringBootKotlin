package com.ronaldarias.springboot.demo.datasource

import com.ronaldarias.springboot.demo.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}