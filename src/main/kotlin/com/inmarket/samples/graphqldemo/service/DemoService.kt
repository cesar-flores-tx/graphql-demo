package com.inmarket.samples.graphqldemo.service

import com.inmarket.samples.graphqldemo.model.Demo
import com.inmarket.samples.graphqldemo.repository.DemoRepository
import org.springframework.stereotype.Service

@Service
class DemoService(private val demoRepository: DemoRepository) {

    fun createDemo(text: String): Demo {
        val model = Demo()
        model.text = text
        return demoRepository.save(model)
    }

    fun findById(demoId: String) : Demo {
        return demoRepository.findById(demoId).orElse(null)
    }

    fun findAll(): List<Demo> {
        return demoRepository.findAll().toList()
    }
}
