package Methods;

public class Method_With_Parameter {

	public static void main(String[] args) {
		Method_With_Parameter P1 = new Method_With_Parameter () ;
		P1.add (20,0);
		P1.add (200,115);
		P1.add (120,50);
		P1.add (1120,0);
		
		Method_With_Parameter A1 = new Method_With_Parameter () ;
		System.out.println("Substraction");
		A1.sub(500, 200);
		A1.sub(10, 5);
		

	}
	
	public void add (int num1 ,int num2) {
		System.out.println(num1 + num2);
		
	}
	
	public void sub (int sub1 ,int sub2) {
		System.out.println(sub1-sub2);
	}

}

//We are using the parameter because we are modify code and reuse the code
