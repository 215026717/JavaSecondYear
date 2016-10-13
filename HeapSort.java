//sort an array of doubles using heapsort
public class HeapSort{
   public static void main(String[] args){
		double[] arr = {8,3,2,1,7,15,25,32,0,4};
		heapSort(arr);
		printArray(arr);
   }
   public static void printArray(double[] array){
      for(double i:array) System.out.print((int) i+" "); System.out.println();
   }
   public static void heapSort(double[] list){
		for(int i = list.length; i != 0; i--){
			heapify(list,i);
			swap(list,0,i-1);
			//printArray(list);
		}
   }

   public static void heapify(double[] array, int limit){
      int i=0;
      while(i<limit){
         int left=2*i+1;
         int right=2*i+2;
         if(left<limit)
            if((right)<limit){
               int bigger=(array[left]<array[right])?right:left;
               if(array[i]<array[bigger])swap(array,i,bigger);
            }
            else{
               if(array[i]<array[left])swap(array,i,left);
            }
         int parent=(i-1)/2;
         if(i==0)parent=-1;
         if(parent>=0){
            if(array[parent]<array[i]) siftUp(array,i);
         }
         i++;
      }
   }
   public static void siftUp(double[] array, int child){
      int parent=(child-1)/2;
      while(parent>=0){
         if(array[parent]<array[child]) swap(array,child,parent);
         child=parent;
         parent=(child-1)/2;
         if(child==0)parent=-1;
      }
   }
   public static void swap(double[] array,int l,int h){
      if((l>=array.length)||(h>=array.length))
         return;
      double temp=array[l];
      array[l]=array[h];
      array[h]=temp;
   }   
}
