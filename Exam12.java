package Array;

public class Exam12 {

	public static void main(String[] args) 
	{
		int numbers[] = {33,53,73,94,22,45,23,87,13,63};
	    int small = numbers[0];
	    int Large = numbers[0];

	    for(int i=1; i< numbers.length; i++)
	    {
	            if(numbers[i] > Large)
	                    Large = numbers[i];
	            else if (numbers[i] < small)
	                    small = numbers[i];
	           
	    }
	   
	    System.out.println("Large Number is : " + Large);
	    System.out.println("Small Number is : " + small);
	}
}
