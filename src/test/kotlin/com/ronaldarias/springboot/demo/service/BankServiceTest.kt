package com.ronaldarias.springboot.demo.service

import com.ronaldarias.springboot.demo.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)

    @Test
    internal fun `calls its data source to retrieve banks`() {
        // can omit next line if the mock declaration uses relaxed=true
//        every { dataSource.retrieveBanks() } returns emptyList()

        bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}