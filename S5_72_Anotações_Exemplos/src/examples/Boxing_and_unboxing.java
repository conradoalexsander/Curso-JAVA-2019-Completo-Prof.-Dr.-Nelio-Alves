package examples;

public class Boxing_and_unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		
		Object obj = x; // boxing de x
		System.out.println(obj); // retorna 20
		
		int y = (int) obj; // unboxing x
		System.out.println(y); // retorna 20
		
		
	}

}
