

public class Week2 {
	public static void main(String args[]) {
		int i = 500; //Any number below 500 could not have 500+ divisors
		int divs = 0;
		long num = 1;
		while(divs<500) {
			num = 1;
			for(int j = i; j>1; j--) {
				num = num + j;
			}
			divs = divisors(num);
			
			i++;
		}
		System.out.println("Triangle number " +num+ " has " +divs+ " divisors." );


	}
	
	public static int divisors(long num){
		int numOfDivisors = 0;
		for(int i = 1; i<=num; i++) {
			if(num%i == 0) {
				numOfDivisors++;
			}
		}
		return numOfDivisors;
	}

}
