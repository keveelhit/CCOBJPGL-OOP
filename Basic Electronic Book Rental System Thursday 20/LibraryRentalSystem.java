package BasicElectronicBookRentalSystem;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;	

public class LibraryRentalSystem {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		
		Book book1 = new Book();
		book1.name = "The Song of Achilles";
		book1.author = "Madeline Miller";
		book1.copy = 2;
		
		Book book2 = new Book();
		book2.name = "The Book Thief";
		book2.author = "Markus Zusak";
		book2.copy = 3;
		
		Book book3 = new Book();
		book3.name = "Pride and Prejudice";
		book3.author = "Jane Austen";
		book3.copy = 4;
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		System.out.println("Electronic Rental Book System");
		System.out.println("*****************************");
		
		for (int x = 0; x < books.size(); x++) {
			System.out.print(x);
			System.out.print(" " + books.get(x).getName() + ", "  + books.get(x).getAuthor());
			System.out.println();
		}
		
		boolean end = false;
		
		while (end == false) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Choose a Number to Rent a Book: ");
				int choice = input.nextInt();
				
				Book book = books.get(choice);
				int copy = book.getCopy();
				if (copy > 0) {
					System.out.println("You Rented: " + books.get(choice).getName());
					book.setCopy(copy-=1);
				} else {
					System.out.println("No Copies Available.");
				}
				System.out.println("Rent Again? Y/N: ");
				String ask = input.next();
				if (ask.equals("N")) {
					end = true;
				}
				
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Invalid Choice.");
			}
			catch (InputMismatchException ex) {
				System.out.println("Invalid Input.");
			}
		}
		
		System.out.println("PROGRAM END.");
	}

}
