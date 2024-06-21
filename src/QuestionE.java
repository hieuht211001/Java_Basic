import java.util.Scanner;

public class QuestionE
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String sInput = sc.nextLine();
        int iInput = sc.nextInt();
        while (true)
        {
            if (!sInput.equals("오전") && !sInput.equals("오후"))
            {
                System.out.print("Invalid input, Please try again: ");
                sInput = sc.nextLine();
            }
            else {break;}
        }
        while (true)
        {
            if (iInput < 0 || iInput > 11)
            {
                System.out.print("Invalid input, Please try again: ");
                iInput = sc.nextInt();
            }
            else {break;}
        }
        System.out.println(String.format("%s %d",sInput,iInput));
    }
}
