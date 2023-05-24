package Methods;

public class Non_Static_Method_Call_from_Same_Class {

	public static void main(String[] args) {
		
		//Syntax of object creation is className objectName = new className () {}
		Non_Static_Method_Call_from_Same_Class K1 = new Non_Static_Method_Call_from_Same_Class ();
		K1.A1();
		K1.A2();
	
		//Non_Static_Method_Call_from_Same_Class- Is a className-------As a dataType of object
		//K1 ----ObjectName ------identify object
		//new ---KeyWord -------create blank or empty object 
		//Non_Static_Method_Call_from_Same_Class---class -- used to copy or load all members of class into object 
		
		
		
		
		

	}
	
	public void A1 () {
		System.out.println("Non static method A1 from same class");
	}
     public void A2 () {
    	 System.out.println("A2 from same class 7219525800");
     }
     public void A3 () {
    	 System.out.println("Method from different class");
     }
}
