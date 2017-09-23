package uva;

//UVa: 11498 - Division of Nlogonia
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uva11498 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t, n, m, x, y;
		while((t = in.nextInt()) != 0) {
			n = in.nextInt(); m = in.nextInt();
			while(t-- > 0) {
				x = in.nextInt(); y = in.nextInt();
				if(x == n || y == m)
	                System.out.print("divisa");
	            else if(x > n && y > m)
	                System.out.println("NE");
	            else if(x < n && y > m)
	                System.out.println("NO");
	            else if(x > n && y < m)
	                System.out.println("SE");
	            else
	                System.out.println("SO");
			}
		}
	}
}
