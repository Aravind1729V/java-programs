class largestOfFourNumbers {
	public static void main (String[] args)
		{ 
			int a=1,b=2,c=3,d=4;
			int l=(a>b&&a>c&&a>d)?a:(b>a&&b>c&&b>d)?b:(c>a&&c>b&&c>d)?c:d;
			System.out.println(l+" = is larger number");
		}
	}