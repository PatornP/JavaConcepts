package Package.One;

public class ClassTwo extends ClassOne{
	public int size;
	public static void main(String args[]){
		ClassTwo two = new ClassTwo();
		two.age = 9;
		ClassOne one = new ClassOne();
		one.age = 10;
	}
}

/* Public - accessed by all classes. 
   Protected - accessed by all classes in same package and other packages as sub class.
   package private - accessed by call classes within same package
   private - accessed only within the same class as declared */