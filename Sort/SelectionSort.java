package Sort;
public class SelectionSort {
	//Selection Sort는 minimum value를 저장할 수 있는 공간이 필요하다.
   public void sort(int data[]){
	   int minValue;
	   int length = data.length;
	   
	   for(int i=0; i<length-1; i++){
		   minValue = i;
		   for(int j=i+1; j<length; j++){
			   if(data[minValue]>data[j]){
				   minValue = j;
			   }
		   }
		   int temp = data[minValue];
		   data[minValue] = data[i];
		   data[i] = temp;
	   }
	   
	   for(int i=0; i<length; i++){
		   if(i>0){
			   System.out.print("_");
		   }
		   System.out.print(data[i]);
	   }
   }
	
	
	
   public static void main(String args[]){
	   SelectionSort selection = new SelectionSort();
	   int data[] = {4,6,1,3,5,2};
	   
	   selection.sort(data);
	   
   }
}