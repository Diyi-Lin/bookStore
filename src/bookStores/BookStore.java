package bookStores;
import java.util.Scanner;
public class BookStore {
	// -------------------------------------------------------
		// Assignment1
		// part2
	    // Written by: (Diyi Lin student id40086388)
		// For COMP 249 Section  � winter 2019
		// --------------------------------------------------------



	//two find... static method	
		public static void findBooksBy(String author,Book[] inventory) 
		{for(int i=0;i<Book.findNumberOfCreatedBooks()-1;i++)
			if(inventory[i].getAuthor().equals(author))
				System.out.println(inventory[i].toString());
		}
		
		public static void findCheaperThan(double price,Book[] inventory) 
		{for(int i=0;i<Book.findNumberOfCreatedBooks();i++)
			if(inventory[i].getPrice()<price)
			System.out.println(inventory[i].toString());
		}	

	//main method	
		public static void main(String[] args) {
			final String password = "password";
			int enterTimesCounter1 = 3;
			int enterTimesCounter12 = 4;
			int enterTimesCounter2 = 3;
			int choice = 0,j,k;
			 String b;
			 String title;
			 String author;
			 long ISBN;
			 double price;		
			 Scanner code = new Scanner(System.in);
		    System.out.println("    ****Here is the second best bookstore in Montreal****   ");  
		    
		    System.out.print("Please enter the maximum number of books: ");
		    int maxBooks = code.nextInt();
		    Book inventory[] = new Book[maxBooks];
	   
		while(enterTimesCounter12 > 0 && choice != 5 ) 
	    {   enterTimesCounter1 = 3;
	        enterTimesCounter2 = 3;
	        System.out.println("                     Main menu");
		    System.out.println("What do you want to do?");
		    System.out.println("    1.  Enter new books(password required)");
		    System.out.println("     2.  Change information of a book(password required)");
		    System.out.println("      3.  Display all books by a specific author");
		    System.out.println("       4.  Display all books under a certain price");
		    System.out.println("        5.  Quit");
		    System.out.print("Please enter your choice>");
		   
		     choice = code.nextInt();
		    if (choice ==1) 
		    {  System.out.println("Please enter the password: ");
		       b = code.next();
	           while (!b.equals(password)) 
	           {
		    	if (enterTimesCounter1 == 1) 
		    	{
		    		enterTimesCounter12--; 
		    		break;
		    	}
		    	else
		    	{
		          System.out.println("Check your password."+(enterTimesCounter1-1)+" attemps remained.");	  
		          enterTimesCounter1--;
		    	  b = code.next();
		    	}
		       }
	           if (b.equals(password))
	           {System.out.print("How many books are you going to enter?");
		    	j = code.nextInt();
		    	k =  Book.findNumberOfCreatedBooks();
		    	while (!(j < maxBooks-k) )
		    	{
		        System.out.println("Sorry,there are/is only "+(maxBooks-k)+" left in your bookstore.");
		        j = code.nextInt();
		    	} 
		    	for(int i=0;i<j;i++) 
		    	{
		    		System.out.println("Please enter the name of your book"+(i+1)+":");
		    	    title = code.next();
		    	    System.out.println("Please enter the author of your book"+(i+1)+":");
		    	    author = code.next();
		    	    System.out.println("Please enter the ISBN of your book"+(i+1)+":");
		    	    ISBN = code.nextLong();
		    	    System.out.println("Please enter the price of your book"+(i+1)+":(CAD)");
		    	    price = code.nextDouble();
		    	    inventory[i+k] = new Book(title,author,ISBN,price);
		    	    
		    	}
		        System.out.println("You have finished entering the book(s).");
	           }    	
	          }
	          if(choice ==2) 
	          {  System.out.print("Please enter the password: ");
	        	 b = code.next();
	             while (!b.equals(password)) 
	             {
	   	    	  if (enterTimesCounter2 == 1) 
	   	    		break;
	   	    	  else
	   	    	  {
	   	          System.out.println("Check your password."+(enterTimesCounter2-1)+" attemps remained.");	  
	   	          enterTimesCounter2--;
	   	    	  b = code.next();
	   	    	  }
	   	         }
	             if (b.equals(password))
	             {System.out.println("Please enter the number of the book you are going to update: ");
	              j = code.nextInt();  
	              while(j+1>Book.findNumberOfCreatedBooks()) 
	              {
	              System.out.println("Sorry,there is no book in this number here.");
	              j = code.nextInt();
	              }
	              k = j;
	              System.out.println();
	              System.out.println("*   *Book"+k); 
	              System.out.println("  *  Author: "+inventory[k].getAuthor());
	              System.out.println(" *** Title: "+inventory[k].getTitle());
	              System.out.println("  *  ISBN: "+inventory[k].getISBN());
	              System.out.println("*   *Price: CAD"+inventory[k].getPrice());
	              System.out.println();
	              System.out.println("                     Update menu");
	              System.out.println("    What information would you like to change?");
	              System.out.println("        1.author");
	              System.out.println("        2.title");
	              System.out.println("        3.ISBN");
	              System.out.println("        4.price");
	              System.out.println("        5.Quit");
	              System.out.println("    Enter your choice>");
	             j = code.nextInt();
	              if(j == 1) 
	              {System.out.print("Please enter the new author: ");
	               author = code.next();
	               inventory[k].setAuthor(author);
	               System.out.println("The author has been changed into "+inventory[k].getAuthor());
	              }
	              if(j == 2)
	              {System.out.print("Please enter the new title: ");
	               title = code.next();
	               inventory[k].setTitle(title);
	               System.out.println("The title has been changed into "+inventory[k].getTitle());
	              }
	              if(j == 3)
	              {System.out.print("Please enter the new ISBN: ");
	               ISBN = code.nextLong();
	               inventory[k].setISBN(ISBN);
	               System.out.println("The ISBN has been changed into "+inventory[k].getISBN());
	              }
	              if(j == 4)
	              {System.out.print("Please enter the new price: ");
	               price = code.nextDouble();
	               inventory[k].setPrice(price);
	               System.out.println("The price has been changed into CAD"+inventory[k].getPrice());
	              }
	              if(j == 5)
	              System.out.println("Backing to the main menu.");
	             }
	           }
	           if(choice == 3)
	           {System.out.print("Please enter the author name: ");
	        	author = code.next();
	        	findBooksBy(author,inventory);
	           }
	           if(choice == 4)
	           {System.out.print("Please enter the price: ");
	        	price = code.nextDouble();
	        	findCheaperThan(price,inventory);
	           }
	    }
		if (!(enterTimesCounter12>0)) 
			   System.out.println("Program detected suspicous activities and will terminate immediately!");
		else
		       System.out.println("***Have a nice day!***");
		
	    
		}
		
	
}
