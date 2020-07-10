package com.test.demo

def employee = [
	'name' : 'John',
	'Age' : 40
	]
println employee

println employee.name

println employee['name']

println employee.get('Age')

println employee.getAt('Age')

println employee.size()

employee.put('city', 'paris')
println employee

println employee.containsKey('city')

println employee.containsValue('paris')

println employee.getClass()

def emp2 = employee.clone()
println emp2

employee.each { key, value -> 
	println "$key : $value"
}

employee.eachWithIndex { key, value ->
	println "$key : $value" 
}

employee.each{entry ->
	println "$entry.key" : "$entry.value"
}

def map1 = ['a' : 1, 'b' : 2]

def entries = map1.entrySet()

entries.forEach { entry -> 
	assert entry.key in ['a','b']
	assert entry.value in [1,2]
}

employee.clear()
println employee

	
