package Sort;

public class BubbleSort {
	
	public void sort(int [] data){
        int temp = 0;
        for(int i=data.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }                
            }
        }
        for(int i=0; i<data.length; i++){
  		   if(i>0){
  			   System.out.print("_");
  		   }
  		   System.out.print(data[i]);
  	   }
    }

	public static void main(String args[]){
		BubbleSort bubble = new BubbleSort();
		   int data[] = {4,6,1,3,5,2};
		   
		   bubble.sort(data);
	}
}
