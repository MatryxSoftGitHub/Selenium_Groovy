package Oops

class CarObject {

	static void main(args) {
		
		Car toyota = new Car()
		Car ford = new Car()
		
		toyota.name = "Toyota"
		toyota.color = "Black"
		toyota.model = 2018
		
		ford.name = "Ford"
		ford.color = "white"
		ford.model = 2019
		
		toyota.getCarDetails()
		toyota.startEngine()
		println "===================="
		ford.getCarDetails()
		ford.startEngine()
	
		
	}
}
