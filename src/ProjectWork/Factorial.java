package ProjectWork;

public class Factorial {
	//static int fact =1,i=1;
	int fact =1,i=1;
	public static int fact(int n) {
	 Factorial obj = new Factorial();
		while (obj.i<=n) {
			obj.fact = obj.fact * obj.i ; 
			obj.i++;
		}
		return obj.fact ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact1 =Factorial.fact(6);
		System.out.println("factorial of the number is " +fact1);
	}

}
