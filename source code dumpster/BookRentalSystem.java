package BasicElectronicBookRentalSystem;
import java.util.Scanner;

public class BookRentalSystem {

	public static void main(String[] args) {
		String[] bookTitle = {"The Song of Achilles", "The Book Thief", "The Alchemist", "Pride and Prejudice"};
		int[] yearPublished = {2011, 2005, 1988, 1813};
		String[] authorName = {"Madeline Miller", "Markus Zusak", "Paulo Coelho", "Jane Austen"};
		int[] copiesAmount = {10, 15, 5, 12};

		System.out.println("-----------------------------");
		System.out.println("Limited Classic Book Rental System");
		System.out.println("-----------------------------");
		
		System.out.println();

		System.out.println("0 " + bookTitle[0] + ", " + yearPublished[0] + ", " + authorName[0] + ", " + copiesAmount[0]);
		System.out.println("1 " + bookTitle[1] + ", " + yearPublished[1] + ", " + authorName[1] + ", " + copiesAmount[1]);
		System.out.println("2 " + bookTitle[2] + ", " + yearPublished[2] + ", " + authorName[2] + ", " + copiesAmount[2]);
		System.out.println("3 " + bookTitle[3] + ", " + yearPublished[3] + ", " + authorName[3] + ", " + copiesAmount[3]);
		
		System.out.println();

		Scanner input = new Scanner(System.in);

		boolean end = false;
		
		while (end == false) {
			System.out.print("Input an Index to Rent: ");
			int rentalChoice = input.nextInt();
			System.out.println();
			
			if(rentalChoice == 0 && copiesAmount[rentalChoice] > 0) {
				System.out.println("Rented Book: " + bookTitle[0] + ", " + yearPublished[0]);
				copiesAmount[rentalChoice] -=1;
				System.out.println();
				System.out.println("Would you like to rent another book? Yes/No]: ");
				String rentAgain = input.nextLine();
				
				if(rentAgain.equals("No") && rentAgain.equals("no")){
					end = true;
				}
					
			} else if (rentalChoice == 1 && copiesAmount[rentalChoice] > 0) {
				System.out.println("Rented Book: " + bookTitle[1] + ", " + yearPublished[1]);
				copiesAmount[rentalChoice] -=1;
				System.out.println();
				System.out.println("Would you like to rent another book? Yes/No]: ");
				String rentAgain1 = input.nextLine();
				
				if(rentAgain1.equals("No") && rentAgain1.equals("no")){
					end = true;
				}
					
			} else if (rentalChoice == 2 && copiesAmount[rentalChoice] > 0){
				System.out.println("Rented Book: " + bookTitle[2] + ", " + yearPublished[2]);
				copiesAmount[rentalChoice] -=1;
				System.out.println();
				System.out.println("Would you like to rent another book? Yes/No]: ");
				String rentAgain2 = input.nextLine();
				
				if(rentAgain2.equals("No") && rentAgain2.equals("no")){
					end = true;
				}
					
			} else if (rentalChoice == 3 && copiesAmount[rentalChoice] > 0){
				System.out.println("Rented Book: " + bookTitle[3] + ", " + yearPublished[3]);
				copiesAmount[rentalChoice] -=1;
				System.out.println();
				System.out.println("Would you like to rent another book? Yes/No]: ");
				String rentAgain3 = input.nextLine();
				
				if(rentAgain3.equals("No") && rentAgain3.equals("no")){
					end = true;
				}
					
			} else {
				System.out.println("No Copies Left for Rent.");	
				end = true;
				
			}
		}

	}

}
