abstract class Person { 
   String name; 
   Person() {
   } 
   abstract void DisplayInfo();
}

class Student extends Person { 
   private int studentID
   private String name
	
   Student(name, studentID) { 
   	  this.name = name
      this.studentID = studentID
   } 
	
   void DisplayInfo() { 
      println("Name: ${this.name}, ID: ${this.studentID}") 
   }

}

student = new Student("Cara", 1)
student.DisplayInfo()