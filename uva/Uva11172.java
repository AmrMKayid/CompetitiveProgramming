package uva;

//UVA: 11172 - Relational Operator
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uva11172 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		while(t-- > 0) {
			int a = in.nextInt(), b = in.nextInt();
			System.out.println((a < b)? "<": (a > b)? ">" : "=");
		}
	}
}
