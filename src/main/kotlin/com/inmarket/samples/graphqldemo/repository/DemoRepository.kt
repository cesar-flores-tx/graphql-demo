package com.inmarket.samples.graphqldemo.repository

import com.inmarket.samples.graphqldemo.model.Demo
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository: ReactiveMongoRepository<Demo, String> {
}