import java.util.Scanner;

public class QuestionB
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int[] iInput = new int[3];
        for(int i = 0; i < 3; i++)
        {
            iInput[i] = sc.nextInt();
        }

        for (int i = 2; i >= 0; i--)
        {
            System.out.println(iInput[i]);
        }
    }
}
