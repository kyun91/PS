package Sort;

public class InsertSort {
	public void sort(int data[]){
        int length = data.length;
        int temp = 0;
        int j = 0;
        for(int i = 1; i < length; i++){
            temp = data[i];
            for(j=i-1; j>=0 && temp<data[j]; j--){
                data[j+1] = data[j];
            }
            data[j+1] = temp;
        }
        
        for(int i=0; i<length; i++){
 		   if(i>0){
 			   System.out.print("_");
 		   }
 		   System.out.print(data[i]);
 	   }
    }
	
	
	public static void main(String args[]){
		InsertSort insert = new InsertSort();
		   int data[] = {4,6,1,3,5,2};
		   
		   insert.sort(data);
	}

}
