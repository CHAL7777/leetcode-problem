public class ArraySort {
	public static void main(String[] args) {
					int[] myArray = {64, 34, 25, 12, 23, 55, 5, 11};
					int lenArray = myArray.length;
					for(int i=0;i<lenArray-1;i++){
						for(int j=0;j<lenArray-i-1;j++){
							if(myArray[j]>myArray[j+1]){
								int temp;
								temp=myArray[j];
								myArray[j]=myArray[j+1];
								myArray[j+1]=temp;

							}
						}
					}
					System.out.print("[");
					for(int i=0;i<lenArray;i++){
         System.out.print(myArray[i]);
									System.out.print(" ");
					}
			
					System.out.print("]");
	}
}