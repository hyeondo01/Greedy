import java.util.Scanner;
import java.util.Arrays;
public class Greedy_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt(); //3

        int[] input = new int[N];
        for (int i = 0; i < N; i++)
        {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < M; i++)
        {
            if (count == K)
            {
                sum += input[N-2];
                count = 0;
            }
            else
            {
                sum += input[N-1];
                count++;
            }
        }
        System.out.println(sum);

    }
}