package homework11.AOP;

public class AOPdemo {

	
	public static void main(String[] args) {
		
		AOPdemo app = new AOPdemo();
		aop.methodeOne(5);
		aop.methodeOne(10, "Hello");
		aop.methodeTwo("bye");
		
		
	}
	
	public void methodeOne(int var){
		System.out.println("methode One (with integer)");
	}
	
	public void methodeOne(int var, String str){
		System.out.println("methode One (with integer, String)");
	}
	
	public void methodeTwo(String str){
		System.out.println("methode two (With String)");
	}

}
