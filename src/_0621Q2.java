import java.util.Scanner;

public class _0621Q2
{
    public static void main(String[] arg)
    {
        int[] iInputNum = new int[2];
        Scanner sc = new Scanner(System.in);
        iInputNum[0] = sc.nextInt();
        iInputNum[1] = sc.nextInt();
        System.out.println(String.format("A = %d * B + %d",iInputNum[0] / iInputNum[1],iInputNum[0] % iInputNum[1] ));
    }
}
