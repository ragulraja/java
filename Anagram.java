import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			String a = scan.nextLine();
			String b = scan.nextLine();
			char ch[] = a.toCharArray();
			char ch1[] = b.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			a=new String(ch);
			b=new String(ch1);
			if(a.equals(b)){
				System.out.println("Anagram");
				
			}
			else{
				System.out.println("not Anagram");
			}
	}

}
