
public class WrapperClasses {
	public static void main(String args[]){
	Integer $9 = 9; //converted to object
	int $10 = 10;
	String myName = "Patorn";
	String myString = new String("Yea");
	System.out.println(myString.toString());
	if(myString.toString() instanceof String){
		System.out.println("yea its a String object");
	}
	System.out.println($9.toString());
	
	if($9 instanceof Integer){
		System.out.println("$9 instance of Integer");
	}
	
	if($9.toString() instanceof String){
		System.out.println("$9 is a String object now with " +
				"a string value");
	}
	
	System.out.println($9 + 10); //converted back to primitive data
								//type
	String result = "5 " + 5;
	System.out.println(result);
	String ten = Integer.toString($10); //or String.valueOf($10)
	System.out.println(ten instanceof String);
	System.out.println("Length of my name is " + myName.length());
	//in array its length
  }
}
