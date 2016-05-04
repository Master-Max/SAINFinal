package sain;

public class PersonFactory {
	public Student makeNewStudent(String name){
		Student newStudent = new Student(name);
		StudentBag.add(newStudent);
		return newStudent;
	}
	
	public Staff makeNewStaff(String name){
		Staff newStaff = new Staff(name);
		return newStaff;
	}
	
	public Admin makeNewAdmin(String name){
		Admin newAdmin = new Admin(name);
		return newAdmin;
	}
}
