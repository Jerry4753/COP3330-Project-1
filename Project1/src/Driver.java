import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static ArrayList<String> stdName = new ArrayList<> (2);
	public static ArrayList<String> stdID = new ArrayList<> (2);
	public static ArrayList<Double> stdGPA = new ArrayList<> (2);
	public static ArrayList<Integer> stdHours = new ArrayList<> (2);

	public static ArrayList<String> faculty = new ArrayList<> (4);

	public static ArrayList<String> staff = new ArrayList<> (4);

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String choice;
		String update;
		
		System.out.println("\t\t\t\t\t\tWelcome to my Personal Management Program\n");
		System.out.println("Choose one of the options:");
		
		do {
			choice = printMenu();
			switch (choice) {
			case "1":
				enterFal();
				break;
			case "2":
				if(stdName.size() <2)
					enterStd();
				else {
					System.out.println("You already have two students filled in. Do you want to update their information?");
					System.out.println("Yes or No: ");
					
					update = scnr.nextLine();
					if(update.toLowerCase().equals("yes")) {
						enterStd();
						break;
					}
					if(update.toLowerCase().equals("no"))
						break;
				}
				break;
			case "3":
				if(stdName.size() == 0) {
					System.out.println("Sorry no students added yet!");
					break;
				}
				printTuition();
				break;
			case "4":
				if(faculty.size() == 0) {
					System.out.println("Sorry no faculty added yet!");
					break;
				}
				printFal();
				break;
			case "5":
				enterStaff();
				break;
			case "6":
				printStaff();
				break;
			case "7":
				break;
			default:
				System.out.println("Invalid entry - Please try again");
				break;
			}
		} while (choice.equals("7") == false);
		
		System.out.println("Goodbye!");
	}// end of main
	
	
	public static String printMenu() {
		String option = "";
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("1- Enter the information of the faculty");
		System.out.println("2- Enter the information of the two students");
		System.out.println("3- Print tuition invoice");
		System.out.println("4- Print faculty information");
		System.out.println("5- Enter the information of the staff member");
		System.out.println("6- Print the information of the staff member");
		System.out.println("7- Exit Program ");
		System.out.print("\t Enter your selection: ");
		
		option = scnr.nextLine();				
		
		return option;
	}// end of menu
	
	//_________________________
	
	public static void enterFal () {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter faculty info:");
		
		System.out.print("\t\tName of the faculty: ");
		String name = scnr.nextLine();
		faculty.add(0, name);
		
		System.out.print("\t\tID: ");
		String ID = scnr.nextLine();
		faculty.add(1, ID);
		
		System.out.print("\t\tRank: ");
		String rank = scnr.nextLine();
		
		while (1 != 0) {
			if (rank.toLowerCase().equals("professor") || rank.toLowerCase().equals("adjunct") ) {
				break;
			}
			else {
				System.out.println("\t\t     \"" + rank + "\" is invalid");
				System.out.print("\t\tRank: ");
				rank = scnr.nextLine();
			}
		}
		faculty.add(2, rank);
		
		System.out.print("\t\tDepartment: ");
		String dept = scnr.nextLine();
		
		while (1 != 0) {
			if(dept.toLowerCase().equals("mathematics") || 
					dept.toLowerCase().equals("engineering") || 
					dept.toLowerCase().equals("english")) {
				break;
			}
			else {
				System.out.println("\t\t     \"" + dept + "\" is invalid");
				System.out.print("\t\tDepartment: ");
				dept = scnr.nextLine();
			}
			
		}
		faculty.add(3, dept);
		
		System.out.println("");
		System.out.println("\t\tFalculty successfully added");
	}

	//_________________________
	
	public static void printFal() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(faculty.get(0) + "\t\t" + faculty.get(1));
		System.out.println(faculty.get(3) + " Deparment, " + faculty.get(2));
		System.out.println("-----------------------------------------------------------------------");
	}
	
	//_________________________
	
	public static void enterStd () {
		Scanner scnr = new Scanner(System.in);
		
		for(int i = 0; i <= 1; i++) {
			System.out.println("Enter student " + (i + 1) + " info:");
			
			scnr = new Scanner(System.in);
			System.out.print("\t\tName of Student: ");
			String name = scnr.nextLine();
			stdName.add(i, name);
			
			scnr = new Scanner(System.in);
			System.out.print("\t\tID: ");
			String ID = scnr.nextLine();
			stdID.add(i, ID);
			
			scnr = new Scanner(System.in);
			System.out.print("\t\tGPA: ");
			double GPA = scnr.nextDouble();
			
			
			while (1 != 0) {
				if(GPA >= 0 && GPA <= 4.0) {
					break;
				}
				else {
					System.out.println("\t\t     \"" + GPA + "\" is invalid");
					System.out.print("\t\tGPA: ");
					GPA = scnr.nextDouble();
				}
			}
			stdGPA.add(i, GPA);
			
			scnr = new Scanner(System.in);
			System.out.print("\t\tCredit Hours: ");
			int Hours = scnr.nextInt();
			
			while (1 != 0) {
				if(Hours >= 0 && Hours < 16) {
					break;
				}
				else {
					System.out.println("\t\t     \"" + Hours + "\" is invalid");
					System.out.print("\t\tCredit hours: ");
					Hours = scnr.nextInt();
				}
			}
			stdHours.add(i, Hours);
			System.out.println("Thanks!\n\n");
		}
		
	}
	//_________________________
	
	public static void printTuition () {
		Scanner scnr = new Scanner(System.in);
		
		int student;
		double tuitionRate = 236.45;
		double tuition = 0.0;
		double fees = 52;
		double discount = 0;
		
		System.out.print("Which student? Enter 1 for " + stdName.get(0));
		System.out.print(" or Enter 2 for " + stdName.get(1) + " ? ");
		
		student = scnr.nextInt();
		
		int index = student - 1;
		
		System.out.println("Here is the tuition invoice for " + stdName.get(index) + " :\n");
		System.out.println("-----------------------------------------------------------------------");
			
		System.out.println(stdName.get(index) + "\t\t" + stdID.get(index));
		System.out.print("Credit Hours: " + stdHours.get(index));
		if(stdGPA.get(index) < 3.85) 
			{
			System.out.printf(" ($%.2f/credit hour", tuitionRate);
			}
		else {
				tuitionRate = tuitionRate * 0.85;
				discount = ((tuitionRate / 0.85) - tuitionRate) * stdHours.get(index);
				System.out.printf(" ($%.2f/credit hour)\n", tuitionRate);
			}
		System.out.println("Fees: $" + fees);
		System.out.println();
		tuition = stdHours.get(index) * tuitionRate + fees;
			
		System.out.printf("Total payment (after discount): $%.2f", tuition);
		System.out.printf("\t($%.2f discount applied)\n", discount);
		System.out.println("-----------------------------------------------------------------------");
	}
		
	//_________________________
	
	public static void enterStaff() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("\t\tName of the staff member: ");
		String name = scnr.nextLine();
		staff.add(0, name);
		
		System.out.print("\t\tEnter the ID: ");
		String ID = scnr.nextLine();
		staff.add(1, ID);
		
		System.out.print("\t\tDepartment: ");
		String dept = scnr.nextLine();
		
		while (1 != 0) {
			if(dept.toLowerCase().equals("mathematics") || 
					dept.toLowerCase().equals("engineering") || 
					dept.toLowerCase().equals("english")) {
				break;
			}
			else {
				System.out.println("\t\t     \"" + dept + "\" is invalid");
				System.out.print("\t\tDepartment: ");
				dept = scnr.nextLine();
			}
			
		}
		staff.add(2, dept);
		
		System.out.print("\t\tStatus, Enter P for Part Time or Enter F for Full Time: ");
		String status = scnr.nextLine();
		staff.add(3, status);
		
	}// end of enterStaff
	
	//_________________________
	
	public static void printStaff() {
		
		if (staff.size() == 0) {
			System.out.println("Sorry! No Staff memeber entered yet");
			System.out.println();
		}
		else {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println(staff.get(0) + "\t\t" + staff.get(1));
			System.out.print(staff.get(2) + " Department, ");
			if(staff.get(3).toLowerCase().equals("f")) System.out.println("Full time");
			if(staff.get(3).toLowerCase().equals("p")) System.out.println("Part time");
			System.out.println("-----------------------------------------------------------------------");
			
		}
	}// end of printStaff
	
}// end of program
