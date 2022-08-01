import java.util.*;
class SetTask1
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		Set<Character> setSol = new HashSet<>();
		Set<Character> solution = new HashSet<>();
		for(int i=0 ; i<a.length() ; i++){
			if(!setSol.add(a.charAt(i)))
				solution.add(a.charAt(i));
		}
		System.out.println(solution);
		
		
	}
}