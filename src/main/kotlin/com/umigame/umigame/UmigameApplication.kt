package com.umigame.umigame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UmigameApplication

fun main(args: Array<String>) {
	runApplication<UmigameApplication>(*args)
	println("konotako")
}
