class Student {
   private int StudentID;
   private String StudentName;
	
   void setStudentID(int pID) {
      StudentID = pID;
   }
	
   void setStudentName(String pName) {
      StudentName = pName;
   }
	
   int getStudentID() {
      return this.StudentID;
   }
	
   String getStudentName() {
      return this.StudentName;
   }
}
student_1 = new Student()
student_1.setStudentID(1)
student_1.setStudentName("Cara Wang")
println(student_1.getStudentID())
println(student_1.getStudentName())