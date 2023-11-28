package com.inmarket.samples.graphqldemo.config

import com.expediagroup.graphql.generator.execution.SimpleKotlinDataFetcherFactoryProvider
import graphql.schema.DataFetcherFactory
import kotlin.reflect.KClass
import kotlin.reflect.KFunction

class CustomDataFetcherFactoryProvider(): SimpleKotlinDataFetcherFactoryProvider() {
    override fun functionDataFetcherFactory(
        target: Any?,
        kClass: KClass<*>,
        kFunction: KFunction<*>
    ): DataFetcherFactory<Any?> = DataFetcherFactory {
        CustomFunctionDataFetcher(target = target, fn = kFunction)
    }
}
