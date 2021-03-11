package com.ronaldarias.springboot.demo.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    val mockDataSource = MockBankDataSource()

    @Test
    internal fun `returns a collection of banks`() {
        val banks = mockDataSource.retrieveBanks()

        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    internal fun `provides some mock data`() {
        val banks = mockDataSource.retrieveBanks()

        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch {it.trust != 0.0}
        assertThat(banks).anyMatch {it.transactionFee != 0}
    }
}