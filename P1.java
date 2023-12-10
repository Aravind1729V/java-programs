class P1 {
	public static void main(String[] rajesh) {
		int a='a';//-->javac  from jdk 1.5
			//int a=(int)'a'; hence auto-widening
		System.out.println(a);
		char ch=(char)32.9;//explict narrowing
		System.out.println(ch);
		System.out.println("hi");
		float f = 45l;
		System.out.println(f);
		double f1='b';
		System.out.println(f1);//98.0
			//double d1=true; CTE(compile time error)
		char ch1=65;//we don't get CTE even through it is explicit narrowing
		System.out.println(ch1);
		}
	}