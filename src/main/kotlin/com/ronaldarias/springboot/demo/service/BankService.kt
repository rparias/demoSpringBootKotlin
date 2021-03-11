package com.ronaldarias.springboot.demo.service

import com.ronaldarias.springboot.demo.datasource.BankDataSource
import com.ronaldarias.springboot.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}