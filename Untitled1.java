
import java.util.Scanner;
class demo{
	public static int cost(int num){
		if(num<=100)
			return 0;
		if(num<=200)
			return (num-100)*4;
		if(num<=300)
			return (400+((num-200)*3));
		if(num<=400)
			return 300+(400+((num-300)*2));
		

		return 200+(300+(400+((num-400)*1)));
		
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int amount = 0;
		System.out.println(cost(num));
	}
}