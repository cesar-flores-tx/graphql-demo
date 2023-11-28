package com.inmarket.samples.graphqldemo.model

import org.springframework.data.annotation.Id
import java.util.UUID

data class Demo(
    @Id
    val id: String? = UUID.randomUUID().toString(),
    val text: String,
)
