import java.util.Scanner;

public class _0621Q1
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int[] iInputNum = new int[3];
        double dInputNum = 0;
        for (int i = 0; i < iInputNum.length; i++)
        {
            iInputNum[i] = sc.nextInt();
            dInputNum += (double)iInputNum[i];
        }
        System.out.println(dInputNum/3);

    }

}
