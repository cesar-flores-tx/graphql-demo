package com.inmarket.samples.graphqldemo.query

import com.expediagroup.graphql.server.operations.Query
import com.inmarket.samples.graphqldemo.model.Demo
import com.inmarket.samples.graphqldemo.service.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class DemoQuery: Query {

    @Autowired
    private lateinit var demoService: DemoService

    fun demo(id: String): Mono<Demo> {
        return demoService.findById(id)
    }

    fun demoAll(): Flux<Demo> {
        return demoService.findAll()
    }
}
