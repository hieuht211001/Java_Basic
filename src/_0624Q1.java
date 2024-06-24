import java.util.Scanner;

public class _0624Q1
{
    public static void main(String[] args)
    {
        Q6();
    }
    
    public static void Q1()
    {
        Scanner sc = new Scanner(System.in);
        int iInputNum = sc.nextInt();
        if (iInputNum >= 0) {System.out.println("positive");}
        else {System.out.println("negative");}
    }

    public static void Q2()
    {
        Scanner sc = new Scanner(System.in);
        int iInputNum = sc.nextInt();
        int iInputNum2 = sc.nextInt();
        if (iInputNum == 0)
        {
            System.out.println(String.format("%.2f", iInputNum2/2.54));
        }
        else
        {
            System.out.println(String.format("%.2f", iInputNum2*2.54));
        }
    }

    public static void Q3()
    {
        Scanner sc = new Scanner(System.in);
        int iInputNum = sc.nextInt();
        sc.nextLine();
        if (iInputNum <= 37)
        {
            System.out.println(iInputNum);
        }
        else
        {
            String sInputText = sc.nextLine();
            System.out.println(String.format("%d , %s", iInputNum,sInputText));
        }
    }

    public static void Q4()
    {
        Scanner sc = new Scanner(System.in);
        int iInputNum1 = sc.nextInt();
        int iInputNum2 = sc.nextInt();
        int iInputNum3 = sc.nextInt();

        int iRemainPoint = iInputNum3 - iInputNum2;

        if (iRemainPoint <= iInputNum1*3)
        {
            System.out.println(iRemainPoint/3);
        }
        else
        {
            System.out.println(iInputNum1*3 + iInputNum2 );
        }
    }

    public static void Q5()
    {
        Scanner sc = new Scanner(System.in);
        int[] iInputNum = new int[5];
        int iMax = Integer.MIN_VALUE ;
        for (int i=0; i< 5; i++)
        {
            iInputNum[i] = sc.nextInt();
            if (iInputNum[i] >= iMax) {iMax = iInputNum[i];}
        }
        System.out.println(iMax);
    }

    public static void Q7()
    {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int iTotal = 0;
        for (int i= 0; i < iNum; i++)
        {
            int iTemp = sc.nextInt();
            iTotal+=iTemp;
        }
        System.out.println(iTotal);

    }

    public static void Q6()
    {
        Scanner sc = new Scanner(System.in);
        int[] iInputNum = new int[5];
        int iMax = Integer.MIN_VALUE ;
        int iIndex = 0;
        for (int i=0; i< 5; i++)
        {
            iInputNum[i] = sc.nextInt();
            if (iInputNum[i] >= iMax) {iMax = iInputNum[i];iIndex = i;}
        }
        System.out.println(iIndex);
    }
}
