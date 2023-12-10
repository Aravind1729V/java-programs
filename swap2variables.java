class swap2variables {
	public static void main(String[] args) {
		int a=4,b=6;
		a=a+b;//10
		b=a-b;//10-6=4
		a=a-b;//10-4=6
		System.out.println("a="+a);
		System.out.println("b="+b);
		}
	}