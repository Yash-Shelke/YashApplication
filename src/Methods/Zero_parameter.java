package Methods;

public class Zero_parameter {

	public static void main(String[] args) {
		Zero_parameter L1 = new Zero_parameter () ;
		L1.A5();
		L1.A6();
	
		
		//Method will call from the different class For this Prosses we are create object of this non static method and call ; 
		Non_Static_Method_Call_from_Same_Class K1 = new Non_Static_Method_Call_from_Same_Class ();
		K1.A3();
	}
	
	public void A5 () {
		System.out.println("Method from same class");
	}
      public void A6 () {
    	  System.out.println("Method from same class with zero arrgument");
      }
      
}
