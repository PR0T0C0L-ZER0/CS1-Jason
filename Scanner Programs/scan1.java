import java.util.Scanner;

class scan1
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.print("The number to work with will be ");
        String first = num.nextLine();
        System.out.println("I am going to square it, divide it by two, then add ten.");
        float ans=((((num*num))/2)+10);
        System.out.println("The final answer is "+ans+".");

        num.close();
    }
}