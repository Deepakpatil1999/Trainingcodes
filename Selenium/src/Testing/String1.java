package Testing;

public class String1 {
	public static void main(String[] args) {
		String s1 = "deepakpatil";

		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(0));
		
		System.out.println(String.valueOf(s1).replaceAll("", "-"));
		
		s1=String.join(" ", s1.split(""));
		System.out.println(s1);

		/*
		 * for (int i = s1.length() - 1; i >= 0; i--) {
		 * System.out.println(s1.charAt(i)); }
		 */
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
	}

}