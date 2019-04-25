class PersonConstructor {
    String name
    Integer age

    PersonConstructor(name, age) {
        this.name = name
        this.age = age
    }
    def show_person() {
    	println("Name: ${this.name}, age: ${this.age}")
    }
}

def person1 = new PersonConstructor('Marie', 1)
def person2 = ['Marie', 2] as PersonConstructor
PersonConstructor person3 = ['Marie', 3]
person1.show_person()
person2.show_person()
person3.show_person()