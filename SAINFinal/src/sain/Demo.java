package sain;

public class Demo {
	public static void main(String[] args){
		
		PersonFactory personFactory = new PersonFactory();
		
		StudentBag sb = new StudentBag();
		
		personFactory.makeNewStudent("John");
		
		System.out.println(sb.findByIndexNum(0).getName());
		System.out.println(sb.findByIndexNum(0).getUsername());
		System.out.println(sb.findByIndexNum(0).getPassword());
		System.out.println(sb.findByIndexNum(0).getId());
		System.out.println(sb.findByIndexNum(0).getAccess());
	}
}
