package airtel;

import java.util.Scanner;

public class Srvicntr {
 static int y;
	 public static void main (String[] args)
	 {
	   mainmenu();
	   }
	public static	void mainmenu()
		{int a;
		 Srvicntr english=new  Srvicntr();
		 Srvicntr hindi=new  Srvicntr();
		 Scanner userinput = new Scanner(System.in);
		System.out.println("\n 1. To continue in english press 1");
		System.out.println("\n 2. Hindi mein jaankari ke liye 2 dabayein \n");
		
         if(userinput.hasNextInt())
        {
        	 a=userinput.nextInt();
	         switch(a)
           {
              case 1: english.engmenu();
                      english.print(y);
                      break;
              case 2: hindi.hindmenu();
                      hindi.print(y);
                      break;
                      default:  System.out.println("enter correct choice");
                      mainmenu();
            }
        }
		}	
	static void engmenu()
				{
	     System.out.println( "\n 1. To know your bill press 1");
		 System.out.println("\n 2. For porting request press 2");
		 System.out.println("\n 3. To talk to our customer care executive press 3");
		 System.out.println("\n 4. To go back to previous menu press 9");
		 System.out.println("\n 5. To exit press 0");
				}
	static void hindmenu()
	           {
        System.out.println( "\n  1. bill ki jankari ke liye 1 dabaie");
        System.out.println("\n  2. porting request ke liye 2 dabaie");
        System.out.println("\n  3. customer care executive se baat karne ke liye 3 dabaie");
        System.out.println("\n  4. phichli menu me jaane ke liye 9 dabai");
        System.out.println("\n  5. samapti ke liye 0 dabaie");
	           }
				
	public static int print(int x)
	
	{   y=x;
	    int p,q,r,s;
		Scanner userinput1 = new Scanner(System.in);
		Scanner userinput2 = new Scanner(System.in);
		Scanner userinput3 = new Scanner(System.in);

		if(userinput1.hasNextInt())
		{x= userinput1.nextInt();
		switch (x)
		{
		case 1: System.out.println("\n");
			System.out.println("Your bill is 800 Rupees.");
			 System.out.println("\n");
		 System.out.println("To go back to previous menu press 9");
		 System.out.println("To exit press 0");
		 p= userinput1.nextInt();
		 if (p==9)
			{mainmenu();}
		   else if (p==0)
		   { System.out.println("Thankyou for your visit");}
		  else{ System.out.println("enter correct choice");
		       print(y);}
		 break;
		
		case 2:
			 System.out.println("\n");	
			 System.out.println("Your porting request is under process.");
			 System.out.println("\n");
			 System.out.println("To go back to previous menu press 9");
			 System.out.println("To exit press 0");
			 r= userinput1.nextInt();
			 if (r==9)
				mainmenu();
			   else if (r==0)
				   System.out.println("Thankyou for your visit");
				   else System.out.println("enter correct choice");
			break;
	
		case 3:
			   System.out.println("\n");
		       System.out.println("Please wait while we contact to costomer care");
		       System.out.println("\n");
		       System.out.println("To go back to previous menu press 9");
		       System.out.println("To exit press 0");
		       s= userinput1.nextInt();
		       if( s==9)
			   mainmenu();
			   else if (s==0)
				   System.out.println("Thankyou for your visit");
				   else System.out.println("enter correct choice");
		       break;
		case 9: System.out.println("\n"); 
			    mainmenu();
			    
		        break;
		case 0: System.out.println("\n");
			    System.out.println("Thanks for your visit");
		        break;
		
	    default:System.out.println("Enter correct choice");
	           print(y);
	}
		}return y;
	
}
}
	    
	
