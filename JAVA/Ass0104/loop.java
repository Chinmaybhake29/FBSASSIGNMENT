package Ass0104;

public class loop {
	public static void main(String[] args) {
//		int i=0;                      //print 1 to 10
//		 while(i<=10)
//		 {
//			 System.out.printf("%d",i);
//		 i++;
//		 }
//		 System.out.println("\n");
		
//		 int i=1,n=6;     			//print table
//		 while(i<=10)
//		 {
//			 System.out.printf("%d\n",n*i);
//		 i++;
//		 }
//		 System.out.println("\n");
		
//		 int n=15756, sum=0, rem;			//Sum of digits
//		 while(n>0)
//		 {
//		 rem=n%10;
//		 sum=sum+rem;
//		 n=n/10;
//		 }
//		 System.out.printf("Sum of digit: %d",sum);

//		int n=8, status=0, i=2;				//prime no
//		
//		 while(i<n)
//		 {
//		 if(n%i==0)
//		 {
//		 status=1;
//		 break;
//		 }
//		 i++;
//		 }
//		 if(status==0)
//		 {
//			 System.out.printf("Is a Prime Number: %d");
//		 }
//		 else
//		 {
//			 System.out.printf("Is Not a Prime Number: %d");
//		 }
		
//		int n=9, temp, rem=0, sum=0;
//		 
//		 temp=n;
//		 while(n!=0)
//		 {
//		 rem=n%10;
//		 sum += rem*rem*rem;
//		 n=n/10;
//		 }
//		 if(sum==n)
//			 System.out.printf("is a Armstrong number %d");
//		 else
//			 System.out.printf("is not a Armstrong number %d");

//		 int n=5, i=1, fact=1;
//		 while(i<=n)
//		 {
//		 fact=fact*i;
//		 i++;
//		 }
//		 System.out.printf("Factorial Number is: %d", fact);
		 
		int n=121, sum=0, rem, temp;
		 temp=n;
		 while(n>0)
		 {
		 rem=n%10;
		 sum=(sum*10)+rem;
		 n=n/10;
		 }
		 if(temp==sum)
		 {
			 System.out.printf("Is a Palindrome: %d");
		 }
		 else
		 {
			 System.out.printf("Is Not a Palindrome: %d");
		 }
		 

	}
}
