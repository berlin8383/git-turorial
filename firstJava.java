class firstJava {
	public static void main(String[] args) {
		int a = 6;
		int b =3;

		System.out.println("add(a,b) : " + add(a, b));

		System.out.println("sub(a,b) : " + sub(a, b));

	}

	public static int add(int a, int b){
		return a+b;
	}
	public static int sub(int a, int b){
		return a-b;
	}
}