package com.test.demo

// for loop

for (int i =1; i<=5; i++) {
	//println i
}

//for in loop

for (i in 1..3) {
	//println i
}

1.upto(6) { println "$it" }

3.times { println "$it" }

1.step(10, 2) { println "$it" }

for (i in [0,1,3,4]) {
	println i
}

//iterate over a map
def map = ["name":"Groovy", "subject":"Automation"]
for (e in map) {
	print e.key+ ":"
	println e.value
}

