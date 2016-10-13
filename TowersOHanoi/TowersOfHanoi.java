//outputting the solution to towers of hanoi with n disks using LinkedLists
import java.util.*;
public class TowersOfHanoi{
	public static void main(String[] args){
		int n;
		try{
			n = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			n = 3;
		}	
		LinkedList<Integer> A = new LinkedList<Integer>();
		LinkedList<Integer> B = new LinkedList<Integer>();		
		LinkedList<Integer> C = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			A.add(n-i);
			System.out.println(new String(new char[n-i-1]).replace('\0', ' ')+new String(new char[(i+1)*2-1]).replace('\0', '-'));	
		}
		System.out.println(new String(new char[n-1]).replace('\0', ' ')+"A"+new String(new char[2*(n-1)]).replace('\0', ' ')+"B"+new String(new char[2*(n-1)]).replace('\0', ' ')+"C");
		Sol(n,A,B,C,n,A,B,C);
	
	}
	public static void Sol(int n, LinkedList<Integer> A, LinkedList<Integer> B, LinkedList<Integer> C, int in, LinkedList<Integer> D, LinkedList<Integer> E, LinkedList<Integer> F){
		if (n == 1){
			B.addLast(A.removeLast());
			try{
				Thread.sleep(1000);
      	} 
			catch(InterruptedException ie){}
			
			for(int c = 0; c < in; c++){
				Disk(D,in,c);
				Disk(E,in,c);
				Disk(F,in,c);			
				System.out.print("\n");
			}
			System.out.println(new String(new char[in-1]).replace('\0', ' ')+"A"+new String(new char[2*(in-1)]).replace('\0', ' ')+"B"+new String(new char[2*(in-1)]).replace('\0', ' ')+"C");
		}
			
		else{
			Sol(n-1,A,C,B,in,D,E,F);
			B.addLast(A.removeLast());
			try{
				Thread.sleep(1000);
      	} 
			catch(InterruptedException ie){}
			
			for(int c = 0; c < in; c++){
				Disk(D,in,c);
				Disk(E,in,c);
				Disk(F,in,c);			
				System.out.print("\n");
			}
			System.out.println(new String(new char[in-1]).replace('\0', ' ')+"A"+new String(new char[2*(in-1)]).replace('\0', ' ')+"B"+new String(new char[2*(in-1)]).replace('\0', ' ')+"C");
			Sol(n-1,C,B,A,in,D,E,F);
		}
		/*try{
			Thread.sleep(1000);
      } 
		catch(InterruptedException ie){}*/
}
	public static void Disk(LinkedList<Integer> D, int n, int i){
		if (D.size() < n-i)
			System.out.print(new String(new char[n*2-1]).replace('\0', ' '));
		else{
			System.out.print(new String(new char[n-D.get(n-i-1)]).replace('\0', ' ')+new String(new char[(D.get(n-i-1))*2-1]).replace('\0', '-')+new String(new char[n-D.get(n-i-1)]).replace('\0', ' '));
		}
	}
}
