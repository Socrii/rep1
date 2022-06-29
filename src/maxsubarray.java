import java.util.Scanner;

public class maxsubarray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        for (int h = 0; h < 6; h++) {

            for (int j = h; j < 6; j++) {
int sum=0;
                for (int y = j; y < 6; y++) {
                    sum = sum + arr[y];
                }
                System.out.println(sum);
            }
        }
    }
}
