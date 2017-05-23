package maven.project.one.one;

public class HelloMaven {
	
	public HelloMaven(){
		System.out.println("Hello there you have invoked the default constructor!");
	}
	
	
	public int sum(int a,int b){
		int c = a+b;
		return c;
	}
	
	//print method name changed and one more line added
	public void printMethod(){
		System.out.println("Test Printing");
		System.out.println("just another print line added");
	}
	
}
