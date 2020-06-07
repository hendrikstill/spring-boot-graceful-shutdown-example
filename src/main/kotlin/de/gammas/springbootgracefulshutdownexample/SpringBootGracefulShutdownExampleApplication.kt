package de.gammas.springbootgracefulshutdownexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootGracefulShutdownExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootGracefulShutdownExampleApplication>(*args)
}
