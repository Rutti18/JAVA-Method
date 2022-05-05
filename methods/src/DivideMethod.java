public class DivideMethod {

	public static void main(String args[]) {
		DivideMethod divMethod = new DivideMethod(); 
		divMethod.divide(1, 3); 
	}	
		private void divide(int num1, int num2) {
		double result = (double)num1 / num2;
		System.out.println(result);
	}
}