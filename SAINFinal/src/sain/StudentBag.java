package sain;

import java.util.ArrayList;

public class StudentBag {

	public static ArrayList<Student> studentArray;
	
	public StudentBag(){
		studentArray = new ArrayList<Student>();
	}
	
	public static void add(Student newStudent){
		studentArray.add((Student) newStudent);
	}
	
	public Student findByUserName(String enteredUN){
		for(int i = 0; i < studentArray.size(); i++){
			if(enteredUN.equals(studentArray.get(i).getName())){
				return studentArray.get(i);
			}
		}
		return null;
	}

	public Student findByIndexNum(int index){
		return studentArray.get(index);
	}
	
}
