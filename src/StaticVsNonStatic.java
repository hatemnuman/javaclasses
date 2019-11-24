
public class StaticVsNonStatic {
	
	//template for students (School, name, grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	//instance Method
	void getInfo() {
		System.out.println("My name is"+ name+"and iam going to "+school+"and my garde is "+grade);
	}
	
	
	//static method
	static void getInfo1() {
		
		System.out.println("Iam attending class at "+school);
	}

}
