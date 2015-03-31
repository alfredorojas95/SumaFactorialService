package Vista;

import java.rmi.RemoteException;

import servicio_met.SerSumaFacProxy;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerSumaFacProxy obj = new SerSumaFacProxy();
		
		
		try {
			int suma = obj.sumar(6, 3);
			int fac = obj.factorial(4);
			System.out.println("Suma: "+suma);
			System.out.println("Factorial : "+fac);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
