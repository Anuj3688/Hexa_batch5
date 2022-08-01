import java.util.*;
class SetTask
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String solution = "";
		Set<Character> setSol = new HashSet<>();
		for(int i=0 ; i<a.length() ; i++){
			if(setSol.add(a.charAt(i)))
				solution += a.charAt(i);
		}
		System.out.println(solution);
		
	}
}