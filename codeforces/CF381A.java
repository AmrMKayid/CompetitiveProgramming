package codeforces;

//381A - Sereja and Dima
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF381A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt(), s = 0, d = 0;
	    int a[] = new int[n];
	    for(int i = 0; i < n; ++i)
	        a[i] = in.nextInt();
	    int i = 0, j = n-1, t = 0;

	    while(i <= j)
	    {
	        if(t++ % 2 == 0) {
	            if(a[i] >= a[j])
	                s += a[i++];
	            else
	                s += a[j--];
	        }
	        else {
	            if(a[i] >= a[j])
	                d += a[i++];
	            else
	                d += a[j--];
	        }
	    }

	    System.out.println(s + " " + d);

	}

}
