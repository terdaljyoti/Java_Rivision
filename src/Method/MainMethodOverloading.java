package Method;

public class MainMethodOverloading 
{
	
	public static void main(int a,int b) 
	 {
		System.out.println(a+b);
	 }
	public static void main(double a,double b) 
	 {
		System.out.println(a+b);
	 }

	 public static void main(String[] args) 
	 {
		 MainMethodOverloading.main(392.98, 635.767);
		 main(56, 89);
	 }
}
