public class Palindrome{
	public boolean isPalindrome(int x) {
		if(x<0||(x%10==0&&x!=0)){
						return false;
		}
		int reversedNum=0;
		while(x>reversedNum){
						int pop=x%10;
						reversedNum=reversedNum*10+pop;
						x=x/10;
		}
		return x==reversedNum||x==reversedNum/10;
}

public static void main(String [] args){
	Palindrome palindromeChecker=new Palindrome();
	int check=121;
	int check2=-121;
	int check3=120;
	int check4=1221;
	System.out.println(palindromeChecker.isPalindrome(check));
	System.out.println(palindromeChecker.isPalindrome(check2));
	System.out.println(palindromeChecker.isPalindrome(check3));
	System.out.println(palindromeChecker.isPalindrome(check4));
}
}
