/** description: program that simulates an ATM machine
 * @author Nene
 */
import java.util.Scanner;
public class ATMSimpulator {
    public static void main(String[] args){
        Account[] acc;
		  acc = new Account[10];
		  for (int i = 0; i < 10; i++){
		  		acc[i] = new Account();
            acc[i].setBalance(100);
        }
		  Scanner in = new Scanner(System.in);
        int identi = 1,choice;
        System.out.print("Enter an id: ");
        identi = in.nextInt();
        while (identi != 0 && identi != 1 && identi != 9){
            System.out.println("Incorrect id");
            System.out.print("Enter an id: ");
            identi = in.nextInt();				
		  }
        System.out.println("Main Menu\n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit");
        choice = in.nextInt();
    }
}
