import java.util.Scanner;

public class Greedy_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        String[] token = S.split("");

        int[] num = new int[S.length()];

        int output = 0;
        for (int i = 0; i < S.length(); i++)
        {
            num[i] = Integer.parseInt(token[i]);

            if (i == 0)
            {
                output = num[i];
            }
            else if ((num[i] + output) > (num[i] * output))
            {
                output += num[i];
            }
            else
            {
                output *= num[i];
            }
        }
        System.out.println(output);
    }
}