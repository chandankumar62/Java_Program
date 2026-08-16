class Course {
  static int maxCapacity = 10;
  String courseName;
  int enrollStudent;
  String[] enrolledStudents;
  

  Course(String courseName){
    this.courseName = courseName;
    this.enrollStudent = 0;
    this.enrolledStudents = new String[maxCapacity];
  }
  static void setMaxCapacity(int maxCapacity){
    Course.maxCapacity = maxCapacity;
  }
  void enrollStudent(String studentName){
    enrolledStudents[enrollStudent] = studentName;
    enrollStudent++;
  }
  void unenrollStudent(String studentName){
    System.out.println("Student removed");
    enrollStudent--;
  }
}
