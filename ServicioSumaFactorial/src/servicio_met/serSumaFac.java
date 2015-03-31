package servicio_met;

public class serSumaFac {

	public int sumar(int a, int b){
		return a+b;
	}
	
	public int factorial(int a) {
		  int factorial = 1;

		  for (int i = 1; i <= a; i++) {
		   factorial *= i;
		  }
		  return factorial;
		 }
}
