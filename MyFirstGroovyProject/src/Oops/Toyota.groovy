package Oops

class Toyota extends Cars {
	
	int TopSpeed
	
	def topspeed() {
		println "top speed is $TopSpeed"
	}

	static void main(args) {
		Toyota car1 = new Toyota()
		car1.name = "toyota"
		car1.color = "Red"
		car1.model = 2019
		car1.topSpeed = 200
		car1.StartEngine()
		car1.stopEngine()
		car1.accelerate()
		car1.topspeed()
		
	}
}
