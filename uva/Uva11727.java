package uva;

//UVa: 11727 - Cost Cutting
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Uva11727 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(), i = 1;
		while(t-- > 0) {
			int a[] = new int[3];
			a[0] = in.nextInt(); a[1] = in.nextInt(); a[2] = in.nextInt();
			Arrays.sort(a);
			System.out.printf("Case %i: %i\n", i++, a[1]);
		}
	}
}
