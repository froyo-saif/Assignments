
@FunctionalInterface
interface CheckNumber{
	public boolean isOdd(int num);
}

@FunctionalInterface
interface PrimeChecker{
	public boolean isPrime(int num);
}

 @FunctionalInterface
 interface PalindromeChecker{
	 public boolean isPalindrome(int num);
 }
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumber ref=(num)->{
			return num%2==0?false:true;
		};
//		System.out.println(ref.isOdd(13));
		
		PrimeChecker obj1=(num)->{
			if(num<=1) {
				return false;
			}
			if(num==2) {
				return true;
			}
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		};
//		System.out.println("isPrime(): "+obj1.isPrime(3));
		
		PalindromeChecker obj2=(num)->{
			int copyNum=num;
			int result=0;
			while(copyNum!=0) {
				int re=copyNum%10;
				result=result*10+re;
				copyNum/=10;		
			}
			if(result==num) {
				return true;
			}
			return false;
		};
		System.out.println("isPalindrome(): "+obj2.isPalindrome(222));
	}

}
