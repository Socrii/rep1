import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        String g=sc.nextLine();
        StringTokenizer st = new StringTokenizer (g);
        String [] arr=new String [st.countTokens()];
        System.out.println(st.countTokens());
        for(int i=0;i<=st.countTokens()+1;i++)
        {
            arr[i]=st.nextToken();

        }
        for(int h=0;h<=st.countTokens()+1;h++)
        {
            System.out.println(arr[h]);
        }
    }
}