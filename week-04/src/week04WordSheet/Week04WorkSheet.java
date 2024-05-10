package week04WordSheet;
import java.util.*;
public class Week04WorkSheet {
	
	
	
	public static void main(String[] args) {
		
		
		// int arrays used in later code
			int[] notAges = {1, 2, 3, 4, 5, 6, 7, 8};
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
			
			
			
		//its the first index value and subtracts it from the last. can be used with "ages" "ages2" "notAges"
			System.out.println("-----------------------Ages Minus Last Ages Value------------------------------");  

			ages[ages.length - 1] = ages[ages.length - 1] - ages[0];
			System.out.println(ages[7]);
			
		// ages2 int array. used in later code
			
			int[] ages2 = new int[9];
			ages2[0] = 90;
			ages2[1] = 20;
			ages2[2] = 30;
			ages2[3] = 40;
			ages2[4] = 50;
			ages2[5] = 60;
			ages2[6] = 70;
			ages2[7] = 80;
			ages2[8] = 90;
			
		//just a copy of the first subtraction with ages2

			ages2[ages2.length - 1] = ages2[ages2.length - 1] - ages2[0];
			


			
			
		// this code represents how it can be sued with different arrays and it will still function
			System.out.println("-----------------------Dynamic Int Array If Statment------------------------------");
		
			
			
				// put a "2" on the end of ages in the if statement to see if it works with different arrays
			if (ages2[0] < ages2[ages2.length - 1]) {
				System.out.println("Your first number is higher");
			} else  {
				System.out.println("Your first number is lower");
			}
			
			
			
		// finds average are from an int array with a for loop
			System.out.println("-----------------------Loop For Avarage Age------------------------------");
			
			//loop works with both ages & ages2 & notAges
			
			int sum = 0;
			for (int avarage : ages) {
				sum += avarage;
			}
			System.out.println(sum);
			
			
			
			
			System.out.println("-----------------------Avarage Name Legnths------------------------------");
			
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		// finds the average amount of letters in the string array.
			int totalNameLength = 0;
			for (String people : names) {
				totalNameLength += people.length();
			}
				int avarageNameLength = totalNameLength / names.length;
			System.out.println(avarageNameLength);
			
			
			
		// prints out your nameList array with a space between each index
			System.out.println("-----------------------Combined Names String------------------------------");
		
			String nameList = "";
			for (String people : names) {
				nameList += people + " ";
			}
			System.out.println(nameList);
			
			
			
			
			
		// accessing the last element of an array
			System.out.println("-----------------------Last Element in Array Access------------------------------");
		
				
			System.out.println(names[names.length - 1]);
			
			
			
			
			
		// accessing the first element of an array
			System.out.println("-----------------------First Element in Array Access------------------------------");
			

			System.out.println(names[0]);
			
			
			
			
			
			
		//changes the string array into an int array swapping the words for their index text length in a number value.
			System.out.println("-----------------------Names Array to Int Array------------------------------");	
		
			
			int[] nameLengths = new int[names.length];
			
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			System.out.println(Arrays.toString(nameLengths));
			
			
			
			
			
		// takes the int array we just made from a string array and finds the average length for the words.	
			System.out.println("-----------------------Name Number Sum------------------------------");
		
			int nameNumSum = 0;
			for (int nameNums : nameLengths) {
				nameNumSum += nameNums;
			}
			System.out.println(nameNumSum);
			
			
			
		// |||FIRST METHOD||| repeats and prints your word as many times as your value tells it to. example "home" 3. would say home home home 
			System.out.println("-----------------------Name Number Sum Avarage------------------------------");
		
				System.out.println(concatenatedName("Hi", 5));
				
				
				
		// |||SECOND METHOD||| makes a full names based off string input values. "Terry" "Jones" = "Terry Jones"
			System.out.println("-----------------------Full Name Method------------------------------");
		
				System.out.println(fullName("John", "Smith"));
				
				
		// |||THIRD METHOD||| adds together an in array and tells you if the sum is over 100
			System.out.println("-----------------------Greater than One Hundred Check------------------------------");
			
				System.out.println(sumLagerThanOneHundred(notAges));
				
				
				
		// |||FOURTH METHOD||| Adds up a double Array and divides it by the number of items in the Array to get the average
			System.out.println("-----------------------Double Array Sum Avarage------------------------------");
		
				double[] doubleArray = {10.4, 27.4, 756.4, 83.75};
				double[] doubleArray2 = {176.7, 5.9, 64.2, 107.46};
				System.out.println(doubleArrayAvarage(doubleArray));
				
				
				
		// |||FIFTH METHOD||| takes two double arrays and finds their respective sums then tells you if the first one if higher		
			System.out.println("-----------------------First Double Array Avarage is Greater------------------------------");
		
				System.out.println(firstArrayAvarageIsGreater(doubleArray, doubleArray2));
				
				
				
				
				
		// |||SIXTH METHOD||| Decides on if you will buy a drink based of if its hot and if you and afford it
			System.out.println("-----------------------Do I Buy a Drink------------------------------");	
		
			System.out.println(willBuyDrink(true, 10.51));
			
			
			
		// |||SEVENTH METHOD (My own custom one) takes in hours worked, hourly wage, state tax, and federal tax then returns your taxed income based off the default values for SS and medical and asks.
			System.out.println("-----------------------Total Taxed Income------------------------------");
		
			// i created my method to quickly find out what my months check will be form my work.
			Scanner scanner = new Scanner(System.in);
			
			
			
			
			System.out.println("Enter Your Hours: ");
			double hours = scanner.nextDouble();
			
			System.out.println("Enter Your Hourly Pay: ");
			double DPH = scanner.nextDouble();
			
			System.out.println("Enter Your State Tax: ");
			double state = scanner.nextDouble();
			
			System.out.println("Enter Your Federal Tax: ");
			double federal = scanner.nextDouble();
			
			
			
			System.out.println(taxedIncome(hours, DPH, state, federal));
	}
	
	// |||SEVENTH METHOD (My own custom one) takes in hours worked, hourly wage, state tax, and federal tax then returns your taxed income based off the default values for SS and medical and asks.
	public static double taxedIncome(double hours, double DPH, double state, double federal) {
			double gross = hours * DPH, sS = .062, medical = .0145, sSTax = 0, medicalTax = 0, taxedIncome = 0, federalTax = 0, stateTax = 0;
			if (state >= 1.00) {
				state = state / 100;
				System.out.println(state);
			}
			if (federal >= 1.00) {
				federal = federal / 100;
				System.out.println(federal);
			}
			
			
			sSTax = gross * sS;
			
			medicalTax = gross * medical;
			
			federalTax = gross * federal;
			
			stateTax = gross * state;
			taxedIncome = gross - medicalTax - federalTax - sSTax - stateTax;
			
			
		return taxedIncome;
	}


	// |||SIXTH METHOD||| takes two variables (boolean) isHotOutside and (double) moneyInPocket. depending on their values it will return true or false
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}



	// |||FIFTH METHOD||| gets average of two double arrays and check to see if the first one is larger
	public static boolean firstArrayAvarageIsGreater(double[] a, double[] b) {
			double totalSum = 0;
			double totalSum2 = 0;
			
			for (double numbers : a) {
				totalSum += numbers;
			}
			for (double numbers : b) {
				totalSum2 += numbers;
			}
			if (totalSum > totalSum2) {
				return true;
			}
		return false;
	}




	// |||FOURTH METHOD||| Adds up a double Array and divides it by the number of items in the Array to get the average
	public static double doubleArrayAvarage(double[] numArr) {
			double totalSum = 0;
			for (double numbers : numArr) {
				totalSum += numbers;
			}
			double avarageSum = totalSum / numArr.length;
		return avarageSum;
	}





	// |||THIRD METHOD||| used to test if number is over 100.
	// possible arrays to put in are "ages" "ages2" and "notAges"
	
		public static boolean sumLagerThanOneHundred(int[] n) {
			int sum = 0;
			for (int numbers : n) {
				sum += numbers;
				}
				if (sum > 100) {
					return true;
				}
				return false;
			
		
	}

		
		// |||SECOND METHOD||| used to combine last and first name to create full name
		public static String fullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
		return fullName;
	}

		
	//// |||FIRST METHOD|| used to repeat a word a set number of times based on your inputs "string" "int" respectively
		public static String concatenatedName (String word, int n) {
			String result = "";
			for (int i = 0; i < n; i++) {
				result += word + " ";
			}
			return result;
		}
	
	
	
	
	
}