package codeforces;

//807A - Is it rated?
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF807A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
	    int arr[] = new int[n];
	    int i = 0, size = n;
	    boolean rated = false;
	    while(n-- > 0)
	    {
	        int a = in.nextInt(), b = in.nextInt();
	        arr[i] = b;
	        i++;
	        if(a == b)
	            continue;
	        else
	            rated = true;
	    }
	    
	    if(rated)
	        System.out.println("rated");
	    else{
	        
	        for(int j = 0; j < size - 1; ++j)
	            if(arr[j] < arr[j+1])
	            {
	                System.out.println("unrated"); 
	                return;
	            }
	        
	        System.out.println("maybe");
	            
	    }
	}

}
