
public class StringComaprision3 {


	public static void main(String[] args) {
		String s1="ram";
		String s2="sita";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s3==s4)
		{
			System.out.println("same references");
		}
		else
		{
			System.out.println("Different references");
		}
		if(s3.equals(s4))
		{
			System.out.println("same data");
		}
		else
		{
			System.out.println("different data");
		}

	}

}


