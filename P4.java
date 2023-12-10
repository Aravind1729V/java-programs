class P4 {
	public static void main(String[] aravind) {
		int a=5;
		System.out.println((a%2==0)?"even number":"odd number");
		char b='b';
		System.out.println((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u')||(b=='A')||(b=='E')||(b=='I')||(b=='O')||(b=='U')?"vowel":"consonent");
		double l=8,m=67,n=70;
		System.out.println((l>m)?l +"is larger":m+" is larger");	
		System.out.println(l>m&&l>n?l+"is larger":m>l&&m>n?m+"is larger":n+"is larger");	
		}
	}
