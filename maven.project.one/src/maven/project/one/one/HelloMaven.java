package maven.project.one.one;

public class HelloMaven {
	
	public HelloMaven(){
		System.out.println("Hello there you have invoked the default constructor!");
	}
	
	//adding method
	public int sum(int a,int b){
		int c = a+b;
		return c;
	}
	
	//printing method
	public void print(){
		System.out.println("Test Printing");
	}
	
}
