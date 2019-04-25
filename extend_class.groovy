class People {
	private String name
	private Long id
	
	People(name, id) {
		this.name = name
		this.id = id
	}
	
	def show_people() {
		println("Name: ${this.name}; Id: ${this.id}")
	}
}


class Student extends People {
	private String school
	private String name
	private Long id

	Student(name, id, school) {
		super(name, id)
		this.school = school
	}
	def show_student() {
		super.show_people()
		println("School: ${this.school}")
	}
}


student_1 = new Student("CaraWang",1,"BeiJing University")
student_1.show_student()
