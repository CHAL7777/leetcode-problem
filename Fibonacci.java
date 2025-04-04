public class Fibonacci{
  public static void main(String[] args){
    int prev1=-1;
    int prev2=1;
    for(int i=0;i<=10;i++){
      int newFibo=prev1+prev2;
      prev1=prev2;
      prev2=newFibo;
      System.out.println(newFibo);
    }
    
  }

}