import java.util.Scanner;
class work4
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sen=sc.nextLine();
		System.out.println(sen.charAt(0));
		for(int i=0 ; i<sen.length();  i++){
			if(sen.charAt(i)==' '){
				System.out.println(sen.charAt(i-1)+" "+sen.charAt(i+1));
			}
		}
		int size = sen.length();
		System.out.println(sen.charAt(size-1));
	}
}