import java.lang.Math;
class prob5
{
    public static void main(String args[])
    {
        //discount
        double discount=0.00;

        //price
        double price=0.00;

        //discounted price
        double discountPrice=(price-(price*discount));

        //final price
        System.out.println("The final discounted price is " + discountPrice);
    }
}