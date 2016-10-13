//checks if user input is a valid card number
import java.util.Scanner;
import java.lang.Math;
public class CardValidationNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        long number = in.nextLong();
        if (isValid(number)){
            System.out.println("Valid Card Number");
        }
        else{
            System.out.println("Invalid Card Number");
        }
    }
    public static boolean isValid(long number){

        if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number)) % 10 == 0){//Checks if sum of double even placed and odd placed digits is divisible by 10
				if (prefixMatched(number,4)||prefixMatched(number,5)||prefixMatched(number,37)||prefixMatched(number,6)){//Checks if prefix matches 4 or 5 or 37 or 6
					 if (getSize(number) > 12 && getSize(number) <= 16){//checks if digits in number are between 13 and 16
					     return true;
					 }
					 else{//returns false if there are less than 13 digits or more than 16
					     return false;
					 }
				}
				else{//Returns false if prefix is not a valid one
				    return false;
			   }
		  }
        else{//Returns false if sum of double even placed and odd placed digits is not divisible by 10
            return false;
        }
    }
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        while (number > 0){//loops through the whole number until there is no more (long) number left
            sum += getDigit((int)((number % 100) / 10) * 2);//doubles the even placed digits and adds them together if they are double digits
            number /= 100;//removes the last two numbers from the long number
        }
        return sum;
    }
    public static int getDigit(int number){
        short temp = 0;
        if (number > 9){//checks if number has two digits
            temp = (short)(number % 10);//assign number to a temp variable so that number is the second digit of number
            number = (number / 10) + temp;//then gets the first digit from temp and adds them together
        }
        return number;
    }
    public static int sumOfOddPlace(long number){
        int sum = 0;
        while (number > 0){//see line 31
            sum += (int)(number % 10);//adds all the odd placed digits
            number /= 100;//see line 33
        }
        return sum;        
    }
    public static boolean prefixMatched(long number,int d){
	     if (getPrefix(number,1)==d){// returns true if the prefix is 4,5 or 6
				return true;
		  }
    	  else if (getPrefix(number,2) == d){//returns true if prefix is 37
		  		return true;
		  }
		  else{//returns false if prefix isn't recognised
		  		return false;
		  }
    }
    public static int getSize(long d){
        int size = 0;
        while (d > 0){//see line 31
            d /= 10;//removes a digit from number each iteration
            size += 1;//adds one to variable size each iteration
        }
        return size;
    }
    public static long getPrefix(long number,int k){
        int size = getSize(number);
        if (size > k){//checks if size is greater than k
            return ((int)(number/Math.pow(10.0,(size-k))));//finds the value of 10 to the power size-k then divides number by that power to find the first k digits of number 
        }
        else{//returns the whole number if k is greater than size
            return number;
        }
    }
}
