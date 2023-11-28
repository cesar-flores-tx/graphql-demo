package com.inmarket.samples.graphqldemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CustomDataFetcherConfig {
    @Bean
    fun dataFetcherFactoryProvider() = CustomDataFetcherFactoryProvider()
}