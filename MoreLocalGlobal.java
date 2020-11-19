package localGlobal;

public class MoreLocalGlobal {
	
	static int y=2222;
	//global,intance,Class level above public main is global
	

	public static void main(String[] args) {
		//non static to non static you dont need an object
		
	//inside the main method is local.we can only declare the value outside the method.
		//to print global in local you will need the class name or create an object.
		int y=10;
		System.out.println(y);
		System.out.println(y+10);
		xyz();
	

	}
//this is another local
	public  static void xyz() {
		int y=100;
		System.out.println(y);
	
		
	}

}
