package codeforces;

//294A - Shaass and Oskols
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF294A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = in.nextInt();
		
		int m = in.nextInt();
		for(int i = 1; i <= m; ++i) {
			int x = in.nextInt(), y = in.nextInt();
			
			a[x-1] += y - 1;
	        a[x+1] += a[x] - y;
	        a[x] = 0;
		}
		
		for(int i = 1; i <= n; ++i)
			System.out.println(a[i]);

	}

}
