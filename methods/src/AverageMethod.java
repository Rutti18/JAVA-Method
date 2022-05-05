public class AverageMethod {

	public static void main(String[] args) {
		AverageMethod avgMethod = new AverageMethod(); 
		System.out.println("The average is: "+avgMethod.average(2, 5, 8)); 
	}
			private int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
			private float average(int num1, int num2, int num3) {
		return (float) sum(num1,num2,num3) / 3 ;
	}
}
