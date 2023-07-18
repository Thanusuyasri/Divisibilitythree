import java.util.Scanner;

public class threeDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for(int i = 0;i < size;i++)
        {
            a[i] = scanner.nextInt();
        }
        int result = 0;
        for(int i=0;i<size;i++)
        {
            result = result+(a[i]%3);
        }
        int check = result%3==0?1:0;
        System.out.println(check);
    }
}
