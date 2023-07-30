package week4;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1a.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println("1a - " + (ages[ages.length - 1] - ages[0]));
		
		//1b
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 96};
		
		System.out.println("1b - " + (ages2[ages2.length - 1] - ages2[0]));
		
		//1c
		int sumAges = 0;
		for (int i = 0; i < ages.length; i++) {
			sumAges += ages[i];
		}
		System.out.println("1c - " + sumAges / ages.length);
		
		//2a
		String[] namesArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2b
		int letters = 0;
		for (int i = 0; i < namesArray.length; i++) {
			letters += namesArray[i].length();
		}
		
		double avg = (double) letters / namesArray.length;
		System.out.println("2b - " + avg);
		
		//3 array[array.length - 1];
		//4 array[0];
		
		//5
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < namesArray.length; i++) {
			nameLengths[i] = namesArray[i].length();
			//System.out.println(namesArray[i].length());
		}
		
		//6
		int sumLengths = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			sumLengths += nameLengths[i];
		}
		System.out.println("6 - " + sumLengths);
		
		//7
		System.out.println(addString("Hello", 3));
		
		//8
		System.out.println(fullName("Let's", "See"));
		
		//9
		System.out.println(greaterThanHundred(nameLengths));
		
		//10
		
		double[] doubleArr = {1.0, 8.0, 9.4, 8.9, 0.09};
		
		System.out.println(averageArray(doubleArr));
		
		//11
		
		double[] doubleArr1 = {1.0, 8.0, 10.4, 9.9, 0.09};
		double[] doubleArr2 = {1.1, 8.1, 9.4, 0.9, 0.09};
		System.out.println(averageGreaterThan(doubleArr1, doubleArr2));
		
		//12
		System.out.println(willBuyDrink(false, 10.50));
	}
	
	//7
	public static String addString(String word, int num) {
		String result = "";
		
		for (int i = 0; i < num; i++) {
			result += word;
		}
				
		return result;
	}
	
	//8
	public static String fullName(String firstName, String lastName) {
				
		return firstName + " " + lastName;
	}
	
	//9
	public static boolean greaterThanHundred(int[] numArr) {
		int sumedArr = 0;
		for(int i = 0; i < numArr.length; i++) {
			sumedArr += numArr[i];
		}
		if (sumedArr > 100) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//10
	public static double averageArray(double[] doubleArr) {
		double numbers = 0.0;
		for (int i = 0; i < doubleArr.length; i++) {
			numbers += doubleArr[i];
		}
		
		double avg = numbers / doubleArr.length;
		return avg;
	}
	
	//11
	public static boolean averageGreaterThan(double[] doubleArr, double[] doubleArrTwo) {
		double numbers = 0.0;
		for (int i = 0; i < doubleArr.length; i++) {
			numbers += doubleArr[i];
		}
		
		double numbers2 = 0.0;
		for (int i = 0; i < doubleArrTwo.length; i++) {
			numbers2 += doubleArrTwo[i];
		}
		
		double avg = numbers / doubleArr.length;
		double avg2 = numbers2 / doubleArrTwo.length;
		
		if (avg > avg2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
		
	}

}
