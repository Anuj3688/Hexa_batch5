import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<Character> sk = new Stack <Character>();
	    String str="we all are going to rajahmundry ";
	    char[] ch = str.toCharArray();
	    for(int i=0;i<str.length();i++)
	    {
	        sk.push(str.charAt(i));
	        if (ch[i]==' ')
	        {
	            while(sk.size()>0)
	       {
	          	      System.out.print(sk.pop());
	       }
	        }
	    }
	}
}