
import java.io.*;
import java.util.*;
public class checkISBN {

	
	private static String isbn13(String digits) {
		int sum=0,sumE=0,sumO = 0, prod=0;
		int[] digitsArr13 = new int[13];
		 //add digits to array
		  for (int i = 0; i < digitsArr13.length; i++) 
	  		{
			  digitsArr13[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
	  		}

		  // compute sum of a 13 digit ISBN
		  for (int i = 0; i < digitsArr13.length; i++) 
	  		{
			  if(i%2 == 0) //even index digit in array
			  	{  
	
				  sumE = sumE + digitsArr13[i];
				 
				 
			  	}
			  else //odd index in digit in array
			  	{
				  
				  prod = digitsArr13[i]*3;
				  sumO = sumO + prod;
				  
			  	}
			  
			  
	  		}
	
		  sum = sumE + sumO;
		  
		  
		  if(sum%10 == 0) //isbn13 is valid
	  			{
			  		
			  		return "Valid";
	  			}
		  else  {
			    
			    	return "Invalid";
		  		}
		
	}
	public static void isbn10to13(String digits) {
		for(int c = 0; c < 10; c++) 
			{
			String placeHolder = "978" + digits.substring(0,9) + c;
			if(isbn13(placeHolder) == "Valid") 
				{
				String isbn10to13=placeHolder;
				System.out.print(isbn10to13);
				break;
				}
			
			}
	}
	
	   public static void main(String[] args) throws IOException
	   {
	      String digits;
	      int sum=0, multi=0, prod=0;
	      int[] digitsArr = new int[10];
	      
	      
	      // User input
	      System.out.print("Enter 10-digit or 13- digit ISBN number: ");
	      Scanner stringScanner = new Scanner(System.in);
	      digits = stringScanner.next();
	  
	      //check if the entered number is 10 or 13 digits digits long
	      //numString = "" + digits;
	    
	    
	     // int test = Integer.parseInt(String.valueOf(digits.charAt(0)));
	      //System.out.print(test);
	      //System.out.print(digits.length());
	      if (digits.length() != 10 )
	      {
	    	  if(digits.length()!= 13)
	    	  	{
	    		  System.out.println("ISBN must be 10 or 13 digits long");
	    	  	}
	    	  else// it's a 13 digit isbn
	    	    {
	    		  //call function to check isbn13 valid
	    		  if(isbn13(digits)== "Valid") {
	    			  System.out.print("Valid");
	    		  }
	    		  else {
	    			  System.out.print("Invalid");
	    		  }
	    		  
	    	    }
	      }
	    
	      else 
	    	  
	    	  {
	    	  	if(digits.length() == 10)
	    	  		{
	    		  // create space for 10 digits in array
	    		  
	    		 //case when last digit is X, convert to 10
	    	  			if(digits.charAt(9) == 'X') 
	    	  				{
	    	  					String newDigits = digits.substring(0,9) + "10";
	    	  						// System.out.print(newDigits);
	    	  						//Add newDigits to array
	    	  						for (int i = 0; i < digitsArr.length-1; i++) 
	    	  							{
	    	  								//add digits to array
	    	  								digitsArr[i] = Integer.parseInt(String.valueOf(newDigits.charAt(i)));
		    			 
	    	  							}
	    	  						digitsArr[9] = 10;
	    	  						multi = 10;
	    	  						// compute multiplicative sum of a 10 digit ISBN
	    	  						for (int i = 0; i < digitsArr.length; i++) 
	    	  							{
	    		    			    
	    	  								prod = digitsArr[i]*multi;
	    	  								sum = sum + prod;
	    	  								multi--;
	    	  							}
	    	  						if(sum%11==0) 
	    		    	  				{
	    	  								//isbn10 is valid so convert to 13. Call function.
	    	  							isbn10to13(digits);
	    	  								
	    	  								
	    		    			  
	    		    		  
	    		    	  				}
	    		    		  
	    	  						else 
	    	  							{
	    	  								System.out.print("Invalid");
	    		    		  
	    	  							}
	    	  				}
	    	  			else //add numbers to array normally
	    	  				{
	    			
	    	  					for (int i = 0; i < digitsArr.length; i++) 
	    	  							{
	    	  							//add digits to array
	    	  							digitsArr[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
	    	  							}
	    	
	    	  							multi = 10;  
	    	  							// compute multiplicative sum of a 10 digit ISBN
	    	  							for (int i = 0; i < digitsArr.length; i++) 
	    	  							{
	    			  
	    	  								prod = digitsArr[i]*multi;
	    	  								sum = sum + prod;
	    	  								multi--;
	    			  
	    	  							}
	    	  					if(sum%11==0) 
	    	  							{
	    	  						////isbn10 is valid so convert to 13. Call function.
	    	  						isbn10to13(digits);
	    	  							}
	    		  
	    	  					else 	{
	    	  								System.out.print("Invalid");
	    	  							}
	    	  				}
	    	  }//end of if statement of number being 10 digit ISBN
	   
	    	 
	    }
	    	  
	
	      stringScanner.close();
	   
	
}

	
}




