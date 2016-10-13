//a method that sorts an array of doubles using bubblesort
public class BubbleSort{
	public static void main(String[] args){
		double[] lis;
		int i;
		lis = new double[7];
		lis[0]=6.0;
		lis[1]=4.4;
		lis[2]=1.9;
		lis[3]=2.9;
		lis[4]=3.4;
		lis[5]=2.9;
		lis[6]=3.5;		
		Sort(lis);

		for(i=0;i<lis.length;i++){
			System.out.printf("%.1f ",lis[i]);
			}
	
	}
static void Sort(double[] arr){
	int i;
	int j;
	double a;
	for(i = 0;i<arr.length; i++){
		for(j = 0;j<arr.length-1;j++){
			if (arr[j] < arr[j+1]){
				a = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = a;
				}
			}
		}
	}
}
