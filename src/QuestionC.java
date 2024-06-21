import java.util.Scanner;

public class QuestionC
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int[] iInputNum = new int[2];
        int iTotalMulti = 1;
        for (int i = 0; i < iInputNum.length; i++)
        {
            System.out.print("Enter an integer: ");
            iInputNum[i] = sc.nextInt();
            iTotalMulti *= iInputNum[i];
        }
        System.out.println(String.format("Multi of input num: %d", iTotalMulti));
    }
}
