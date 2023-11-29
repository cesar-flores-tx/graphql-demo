package com.inmarket.samples.graphqldemo.mutation

import com.expediagroup.graphql.server.operations.Mutation
import com.inmarket.samples.graphqldemo.model.Demo
import com.inmarket.samples.graphqldemo.service.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DemoMutation: Mutation {

    @Autowired
    private lateinit var demoService: DemoService

    fun createDemo(text: String): Demo {
        return demoService.createDemo(text)
    }
}