public class Sumador {
	public static void main(String[]args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int resul = 0;
	
		for(int i=num1; i<=num2; i++) {
			System.out.println(resul + " + " + i + " = " + (resul+i));
			resul+=i;
		}
		System.out.println("La suma es: "+resul);
		
	}
}