
public class PrintEvenNumbers 
{

	public static boolean evenNumbers( int lastNum )
	{

		if (lastNum < 0)
		{
			System.out.println("No evens lie between 0 and " + lastNum);
			return false;
		}
		else
		{
			for (int i=0; i<=lastNum; i+=2)
			{
				System.out.print(i + ", ");
			}
			System.out.println();
			return true;
		}
	}

	public static void main(String[] args)

	{
		int nums[] = {4,5,-7,7,8,10,15,20,-626 };

		for ( int i=0; i < nums.length ; i++)
		{
			//evenNumbers(nums[i]);

			if(evenNumbers(nums[i]) == true)
			{
				System.out.println("Valid data");
			}
			else
			{
				System.out.println("Invalid data");
			}
		}


	}

}
