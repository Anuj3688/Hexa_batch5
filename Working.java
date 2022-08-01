import java.util.Scanner;
class Work
{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String ques = sc.nextLine();
		String answer = "";
		char consider = ques.charAt(0);
		int k=1;
		for(int i=1;  i<ques.length() ; i++) {
			if(ques.charAt(i)==consider)
				k++;
			else {
				solution =solution+ (consider +String.valueOf(k));
				k=1;
				consider = ques.charAt(i);
			}
		}
		solution =solution+ (consider +String.valueOf(k));

		for(int i=1 ; i<solution.length() ;i+=2){
			if(solution.charAt(i)>String.valueof(1))
				System.out.println(solution.charAt(i-1));
		}
	}
}