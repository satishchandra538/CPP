package random;

//package lapindrome;
import java.util.Scanner;

public class lapindrome {
	static String isLapindrome(String str) {
		int max = 26;
		int fhalf[] = new int[max], shalf[] = new int[max];
		int len = str.length();
		for (int i = 0, j = len - 1; i < j; j--, i++) {
			// optimise space by using only one array
			fhalf[str.charAt(i) - 'a']++;
			// optimised
			fhalf[str.charAt(j) - 'a']--;
		}
		for (int i = 0; i < max; i++)
			if (fhalf[i] != shalf[i])
				return "NO";
			else
				System.out.print(fhalf[i] + " " + fhalf[max - 1 - i] + " => ");
		return "YES";
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			String str = s.next();
			System.out.println(isLapindrome(str));
			t--;
		}
		s.close();
	}
}
