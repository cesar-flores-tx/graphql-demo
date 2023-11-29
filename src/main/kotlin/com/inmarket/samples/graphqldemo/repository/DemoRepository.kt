package com.inmarket.samples.graphqldemo.repository

import com.inmarket.samples.graphqldemo.model.Demo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository: CrudRepository<Demo, String> {
}