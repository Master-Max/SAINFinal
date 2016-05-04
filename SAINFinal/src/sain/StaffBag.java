package sain;

import java.util.ArrayList;

public class StaffBag {
	
	public static ArrayList<Staff> staffArray;
	
	public StaffBag(){
		staffArray = new ArrayList<Staff>();
	}
	
	public static void add(Staff newStaff){
		staffArray.add((Staff) newStaff);
	}
	
	public Staff findByUsername(String enteredUN){
		for(int i = 0; i < staffArray.size(); i++){
			if(enteredUN.equals(staffArray.get(i).getName())){
				return staffArray.get(i);
			}
		}
		return null;
	}
	
	public Staff findByIndexNum(int index){
		return staffArray.get(index);
	}

}
