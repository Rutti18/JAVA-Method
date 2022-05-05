public class MethodReturnTypes {

	public static void main(String args[]) {
		MethodReturnTypes returnTypes = new MethodReturnTypes();
		System.out.println(returnTypes.method1());
		System.out.println(returnTypes.method2());
		System.out.println(returnTypes.method3());
	}
		private String method1() {
		return "String of Text";
	}
		private int method2() {
		return 5;
	}
		private boolean method3() {
		return false;
	}
}