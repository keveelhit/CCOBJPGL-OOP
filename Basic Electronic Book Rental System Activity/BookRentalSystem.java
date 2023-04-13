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

		System.out.println("1 " + bookTitle[0] + ", " + yearPublished[0] + ", " + authorName[0] + ", " + copiesAmount[0] + "copies");
		System.out.println("2 " + bookTitle[1] + ", " + yearPublished[1] + ", " + authorName[1] + ", " + copiesAmount[1] + "copies");
		System.out.println("3 " + bookTitle[2] + ", " + yearPublished[2] + ", " + authorName[2] + ", " + copiesAmount[2] + "copies");
		System.out.println("4 " + bookTitle[3] + ", " + yearPublished[3] + ", " + authorName[3] + ", " + copiesAmount[3] + "copies");
		
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Input an Index to Rent: ");
		int rentalChoice = input.nextInt();
		System.out.println();
		
			
			switch(rentalChoice) {
				case 1: 
						System.out.println("Rented Book: " + bookTitle[0] + ", " + yearPublished[0]);
						copiesAmount[rentalChoice] -=1;
						System.out.println();
						System.out.print("Would you like to rent another book? [Y/N]: ");
						String rentAgain = input.next();
						
							if(rentAgain.equalsIgnoreCase("N")){
								System.out.println();
								System.out.println("End of System Transaction.");
							}else if (rentAgain.equalsIgnoreCase("Y")){
								System.out.println();
								System.out.println("Reset the System.");
							}
						break;
			
				case 2:
						System.out.println("Rented Book: " + bookTitle[1] + ", " + yearPublished[1]);
						copiesAmount[rentalChoice] -=1;
						System.out.println();
						System.out.print("Would you like to rent another book? [Y/N]: ");
						String rentAgain1 = input.next();
							if(rentAgain1.equalsIgnoreCase("N")){
								System.out.println();
								System.out.println("End of System Transaction.");
							}else if (rentAgain1.equalsIgnoreCase("Y")){
								System.out.println();
								System.out.println("Reset the System.");
							}
						break;
					
				case 3:
						System.out.println("Rented Book: " + bookTitle[2] + ", " + yearPublished[2]);
						copiesAmount[rentalChoice] -=1;
						System.out.println();
						System.out.print("Would you like to rent another book? [Yes/No]: ");
						String rentAgain2 = input.next();
							if(rentAgain2.equalsIgnoreCase("N")){
								System.out.println();
								System.out.println("End of System Transaction.");
							}else if (rentAgain2.equalsIgnoreCase("Y")){
								System.out.println();
								System.out.println("Reset the System.");
							}
						break;
				case 4:
						System.out.println("Rented Book: " + bookTitle[3] + ", " + yearPublished[3]);
						copiesAmount[rentalChoice] -=1;
						System.out.println();
						System.out.print("Would you like to rent another book? [Yes/No]: ");
						String rentAgain3 = input.next();
							if(rentAgain3.equalsIgnoreCase("N")){
								System.out.println();
								System.out.println("End of System Transaction.");
							}else if (rentAgain3.equalsIgnoreCase("Y")){
								System.out.println();
								System.out.println("Reset the System.");
							}
						break;
				default:
					System.out.println("No Copies Left for Rent.");
			
		}

	}

}
