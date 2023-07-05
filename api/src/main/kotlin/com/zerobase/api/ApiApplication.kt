package com.zerobase.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = ["com.zerobase.domain"])
@EntityScan(basePackages = ["com.zerobase.domain"])
@ComponentScan(basePackages = ["com.zerobase.kafka"])
class ApiApplication

fun main(args: Array<String>){
    runApplication<ApiApplication>(*args)
}