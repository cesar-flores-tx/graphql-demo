package com.inmarket.samples.graphqldemo.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class Demo {
    @Id
    val id: String = UUID.randomUUID().toString()
    var text: String = ""
}
