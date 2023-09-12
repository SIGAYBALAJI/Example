import java.util.Scanner;

public class StringConcatanation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		//String concatanation
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println("******************************************");
		//String UpperCase
		String s4=s1.toUpperCase();
		System.out.println(s4);
		System.out.println("***************************************");
		//String Lower
				String s5=s1.toLowerCase();
				System.out.println(s5);
				System.out.println("**************************************");
				//String charater at given index
				char s6=s1.charAt(2);
				System.out.println(s6);
				System.out.println("*************************************");
				//index of character at first time
			int s7=s1.indexOf('m');
				System.out.println(s7);
				System.out.println("***************************");
				
		
	}

}
