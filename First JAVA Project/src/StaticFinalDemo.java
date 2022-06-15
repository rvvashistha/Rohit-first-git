
public class StaticFinalDemo {
	int var1 = 10;
	static int var2 = 10;

	void method1() {
		var1++;
		System.out.println(var1);
	}

	void method2() {
		var2++;
		System.out.println(var2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticFinalDemo ob1 = new StaticFinalDemo();
		StaticFinalDemo ob2 = new StaticFinalDemo();
		StaticFinalDemo ob3 = new StaticFinalDemo();
		StaticFinalDemo ob4 = new StaticFinalDemo();
		System.out.println("using non static variable: ");
		ob1.method1();
		ob2.method1();
		ob3.method1();
		// System.out.println('\n');
		System.out.println("using static variable: ");
		ob1.method2();
		ob2.method2();
		ob3.method2();
		ob4.method2();

	}

}
