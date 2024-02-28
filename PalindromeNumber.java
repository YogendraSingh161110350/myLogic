public class PrimeNumber
{
	private static boolean isPalindrome(int num)
	{
		int temp = num;
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return num==rev;
	}
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(12));
	}
}