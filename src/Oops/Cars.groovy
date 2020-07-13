package Oops

class Cars {
	
	String name
	String color
	int model
	
	def StartEngine(){
		println "Engine started for $name "
	}
	
	def stopEngine() {
		println "Engine stopped for $name "
	}
	
	def accelerate() {
		println "Accelerate $name"
	}
}
