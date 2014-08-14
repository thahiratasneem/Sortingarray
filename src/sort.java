
public class sort {

	public static void main(String args[])
	{
	int number [] = {20,25,45,56,76};
	int n=number.length;
	System.out.println("the given list are :");
	for(int i=0;i<n;i++)
	{
		System.out.println("" +number[i]);
	
	}
	//sort
	for(int i=0;i<n;i++)
	{
		for (int j=i+1;j<n;j++)
		{
			 if (number[i] < number[j])
				 {
				int temp = number[i];
				 number[i]=number[j];
				 number[j]=temp;
				 }
		}
	}
	System.out.println("the sorted no are :");
	for(int i=0;i<n;i++)
	{
		System.out.println("" +number[i]);

	}
	}
}