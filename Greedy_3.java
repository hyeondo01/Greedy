import java.util.Scanner;
import java.util.Arrays;

public class Greedy_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] person = new int[N];
        for (int i = 0; i < N; i++)
        {
            person[i] = sc.nextInt();
        }
        Arrays.sort(person);

        int group = 0;
        int count = 1;
        for (int i = 0; i < N; i++)
        {
            if (person[i] == count)
            {
                group++;
                count = 1;
            }
            else if (person[i] > count)
            {
                count++;
            }
        }
        System.out.print(group);
    }
}
