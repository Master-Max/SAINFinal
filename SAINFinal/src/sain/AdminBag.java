package sain;

import java.util.ArrayList;

public class AdminBag {
	
	public static ArrayList<Admin> adminArray;
	
	public AdminBag(){
		adminArray = new ArrayList<Admin>();
	}
	
	public static void add(Admin newAdmin){
		adminArray.add((Admin) newAdmin);
	}
	
	public Admin findByUsername(String enteredUN){
		for(int i = 0; i < adminArray.size(); i++){
			if(enteredUN.equals(adminArray.get(i).getName())){
				return adminArray.get(i);
			}
		}
		return null;
	}
	
	public Admin findByIndexNum(int index){
		return adminArray.get(index);
	}

}
