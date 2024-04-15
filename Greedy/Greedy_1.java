import java.util.Scanner;

public class Greedy_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        while (true)
        {
            if (N % K == 0)
            {
                N /= K;
                count++;
            }
            else if (N == 1)
            {
                break;
            }
            else
            {
                N -= 1;
                count++;
            }
        }
        System.out.print(count);
    }
}