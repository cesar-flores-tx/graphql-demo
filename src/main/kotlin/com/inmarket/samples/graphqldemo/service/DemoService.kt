package com.inmarket.samples.graphqldemo.service

import com.inmarket.samples.graphqldemo.model.Demo
import com.inmarket.samples.graphqldemo.repository.DemoRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class DemoService(private val demoRepository: DemoRepository) {

    fun createDemo(text: String): Mono<Demo> {
        val model = Demo(text = text)
        return demoRepository.save(model)
    }

    fun findById(demoId: String) : Mono<Demo> {
        return demoRepository.findById(demoId)
    }

    fun findAll(): Flux<Demo> {
        return demoRepository.findAll()
    }
}
