import java.util.Scanner;
class work3
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String userID, userPass;
		
		for(int i=0 ; i<3 ; i++){
			userID = sc.nextLine();
		userPass = sc.nextLine();
			if(userID.compareTo("MOM")==0 && userPass.compareTo("djss")==0){
				System.out.println("Login Success");
				break;
			}else{
				System.out.println("Login failure");
			}
		}
	}
}