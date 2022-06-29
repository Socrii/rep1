import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class f1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String a=sc.next();
        int num1=sc.nextInt();
        String b = sc.next();
        String g = a + b;
        String f = "";
        int min = 0;
        int[] arr = new int[g.length()];
        for (int i = 0; i < g.length(); i++) {
            arr[i] = (int) (g.charAt((i)));
        }
        for (int p = 0; p < arr.length - 1; p++) {
            min = p;
            for (int h = p + 1; h < arr.length; h++) {
                if (arr[min] > arr[h]) {
                    min = h;
                }
            }

                    int t = arr[min];
                    arr[min] = arr[p];
                    arr[p] = t;
                }


                for (int y = 0; y < arr.length; y++)
                {
                    f+=(char)arr[y];
                }
        System.out.println(f);


            }

        }

