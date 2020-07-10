package Oops

class Car {
	String name
	String color
	int model
	
	def getCarDetails() {
		println "You are driving $model, color coloured $name"
	}
	
	def startEngine() {
		println "Starting engine for $name"
	}
	
}
