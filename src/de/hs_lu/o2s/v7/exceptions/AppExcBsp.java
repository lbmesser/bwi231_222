package de.hs_lu.o2s.v7.exceptions;

public class AppExcBsp {

	public static void main(String[] args) {
		criticalMethod();

	}
	
	public static void criticalMethod() {
		
		try {
			System.out.println("Start von criticalMethod");
			
			// Zero Division 
			int a = 5; int b = 1;
				System.out.println("Durch Null teilen: " + a/b);
			
			
			// Nullpointer
			BspClass bsp = null;
			if (bsp != null) {
				System.out.println(bsp.toString());
			}
			
			// IndexOutOfbounds
			String[] strA = new String[2];
			System.out.println(strA[100]);
			
			System.out.println("Ende von criticalMethod");

		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());			
		} catch(IndexOutOfBoundsException iob) {
			iob.printStackTrace();
		} catch(NullPointerException npe) {
			System.out.println(npe.getClass());
		}
	}

}