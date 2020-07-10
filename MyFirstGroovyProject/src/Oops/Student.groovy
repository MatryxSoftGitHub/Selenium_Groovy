package Oops

class Student {
	
	String name
	int sub1marks
	int sub2marks
	
	def PrintTotal() {
		println "$name total marks = "+(sub1marks + sub2marks)
	}

	static void main(args) {
		Student student1 = new Student()
		student1.name = "John"
		student1.sub1marks = 77
		student1.sub2marks = 88
		student1.PrintTotal()
	}
}
