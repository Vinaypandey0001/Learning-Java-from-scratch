public class Ex5 {
    
 
	public static void main(String args[])
	{
		boolean f = false;
		System.out.println("Before the return.");

		if (f)
			return;

		// Compiler will return  every statement cause if block is false
		
		System.out.println("This will execute.");
	}
}
