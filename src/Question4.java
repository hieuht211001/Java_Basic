import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc3 = new Scanner(System.in);
        String[] sInputText = new String[3];
        double[] dInputNum = new double[3];
        for (int i = 0; i < 3; i++)
        {
            sInputText[i] = sc3.nextLine();
        }
        for (int i = 0; i < 3; i++)
        {
            dInputNum[i] = sc3.nextDouble();
        }
        for (int i=0; i<3; i++)
        {
            System.out.println(String.format("name - %s, grade - %.1f",sInputText[i],dInputNum[i]));
        }
    }
}