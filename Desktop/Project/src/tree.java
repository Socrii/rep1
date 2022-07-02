import java.util.*;
public class tree{
    public static void main(String[] args) {
                Scanner sc=new Scanner (System.in);
                System.out.println("Enter the value of n");
                int n= sc.nextInt();
                int a=0;
                int b=1;
                System.out.print(a+" " );
                System.out.print(b+" ");
                for(int i=3;i<n;i++){
                    int k=a+b;
                    a=b;
                    b=k;
                    System.out.print(k+" ");
                }
            }
        }


