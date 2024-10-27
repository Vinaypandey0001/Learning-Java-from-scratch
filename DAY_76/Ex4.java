public class Ex4 {
    
 
	public static void main(String args[])
	{
		boolean t = true;
		System.out.println("Before the return.");

		if (t)
			return;

		// Compiler will bypass every statement
		// after return
		System.out.println("This won't execute.");
	}
}
