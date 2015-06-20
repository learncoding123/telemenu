package airtel;
import java.util.Scanner;
public class english extends Srvicntr {

	Scanner userinput1 = new Scanner(System.in);
		
			
			
			
public void display()
			{
     System.out.println( "\n To know your bill press 1");
	 System.out.println("\n For porting request press 2");
	 System.out.println("\n To talk to our customer care executive press 3");
	 System.out.println("\n To go back to previous menu press 9");
	 System.out.println("\n To exit press 0");
			}
			
public void print(int x)
{
	if(userinput1.hasNextInt())
	{x= userinput1.nextInt();
	while (x==1)
	{System.out.println("Your bill is 800 Rupees.");
	System.out.println("To go back to previous menu press 9");
	mainmenu();
	System.out.println("To exit press 0");
	}
	while (x==2)
	{System.out.println("Your request is bieng ported ");
	System.out.println("To go back to previous menu press 9");
	mainmenu();
	System.out.println("To exit press 0");
	}
	while (x==3)
	{System.out.println("Please wait while we contact to costomer care");
	System.out.println("To go back to previous menu press 9");
	mainmenu();
	System.out.println("To exit press 0");
	}
	while (x==9)
	{mainmenu() ;
	}
	while (x==0)
	{System.out.println("Thanks for your visit");
	
	}
}
}
}

