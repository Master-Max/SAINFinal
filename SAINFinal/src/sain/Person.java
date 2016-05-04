package sain;

import java.util.Random;

public class Person {
	
	private int access; //Sets level of access - Student[0], Staff[1], Admin[2]
	private String name;
	private String username;
	private String password;
	private int id;
	private int idCount = 100;
	
	public Person(){}
	
	public Person(int access, String name){
		this.access = access;
		this.name = name;
	}
	
	public void createAccount(String name, int access){
		setName(name);
		genId();
		genUsername();
		genPassword();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int getAccess(){
		return this.access;
	}
	
	public void genUsername(){
		this.username = this.name.substring(0, 3) + this.id;
	}
	
	public void genId(){
		this.id = idCount;
		idCount++;
	}
	
	public void genPassword(){
		Random rng = new Random();
		
		String characters = "0123456789";
		
		char[] text = new char[8];
		for(int i = 0; i < 8; i++){
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		this.password = new String(text);
	}

}
