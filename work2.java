import java.util.Scanner;
class work2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		for(int i=1 ; i<=10 ; i++){
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		int i=1;
		while(i<=10){
			System.out.println(a+" * "+i+" = "+(a*i));
			i++;
		}
		i =1;
		do{
			System.out.println(a+" * "+i+" = "+(a*i));
			i++;
		}while(i<=10);
	}
}