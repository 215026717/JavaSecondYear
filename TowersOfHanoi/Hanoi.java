//outputting the solution to towers of hanoi with n disks using array
import java.util.*;
public class Hanoi{
	public static void main(String[] args){
		int n;
		try{
			n = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			n = 3;
		}		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = n-i;
			//System.out.println(new String(new char[n-i-1]).replace('\0', ' ')+new String(new char[(i+1)*2-1]).replace('\0', '-'));	
		}
		for(int i = 0; i < n; i++){
			Disk(A,n,i);
			Disk(B,n,i);
			Disk(C,n,i);			
			System.out.print("\n");
		}
		System.out.println(new String(new char[n-1]).replace('\0', ' ')+"A"+new String(new char[2*(n-1)]).replace('\0', ' ')+"B"+new String(new char[2*(n-1)]).replace('\0', ' ')+"C");
		Sol(n,A,B,C,n,A,B,C);
	
	}
	public static void Sol(int n, int[] A, int[] B, int[] C, int in, int[] D, int[] E, int[] F){
		int i,j;
		if (n == 1){
			for(i = 0;i<in;i++){
				if (A[i] == 0){
					break;
				}
			}
			for(j = 0;j<in;j++){
				if (B[j] == 0){
					break;
				}
			}
			i -= 1;
			B[j] = A[i];
			A[i] = 0;
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
			for(i = 0;i<in;i++){
				if (A[i] == 0){
					break;
				}
			}
			for(j = 0;j<in;j++){
				if (B[j] == 0){
					break;
				}
			}
			i -= 1;
			B[j] = A[i];
			A[i] = 0;
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
	public static void Disk(int[] D, int n, int i){
		if (D[n-i-1] == 0)
			System.out.print(new String(new char[n*2-1]).replace('\0', ' '));
		else{
			System.out.print(new String(new char[n-D[n-i-1]]).replace('\0', ' ')+new String(new char[(D[n-i-1])*2-1]).replace('\0', '-')+new String(new char[n-D[n-i-1]]).replace('\0', ' '));
		}
	}
}
