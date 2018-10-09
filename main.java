
//number between 1 to 100 divisible by 3 and 5

public class Main 
{
  
	public static void main(String[] args) 
	{
  
		for(int i=1;i<=100;i++)
  //for loop running from number 1 to 100
		{
    
			if((i%3==0)&&(i%5==0))
   // checking the number is divisible by 3 as well as 5 using if statement 		
			System.out.println(i);
  //displaying the number divisible by  3 and 5
		}
  
	
}

}
