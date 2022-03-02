

public class Week1 {
	public static void main(String[] args) {
		String ans = "192384576";
		int answer = 192;
		String tempAns = "";
		
		for(int i = 1; i<100000; i++) {
			int j = 1;
			do {
				
				tempAns = tempAns + Integer.toString(i*j);
				j++;
			}while(tempAns.length()<9);
			
			if(tempAns.length() == 9 && (tempAns.contains("1")&&(tempAns.contains("2")&&(tempAns.contains("3")&&(tempAns.contains("4")&&(tempAns.contains("5")&&(tempAns.contains("6")&&(tempAns.contains("7")&&(tempAns.contains("8")&&tempAns.contains("9")))))))))){

				if(Integer.parseInt(tempAns)>Integer.parseInt(ans)) {
					ans = tempAns;
					answer = i;
				}
			}
			tempAns = "";
				
			
		}
		System.out.println("Answer is "+ answer);
		System.out.println("Pandigital 9-digit number is "+ ans);
	}
}
