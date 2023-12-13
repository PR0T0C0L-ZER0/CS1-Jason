import java.lang.Math;
class prob5
{
    public static void main(String args[])
    {
        //discount
        float discount=0.00f;

        //price
        float price=0.00f;

        //discounted price
        float discountPrice=(price-(price*discount));

        System.out.format("%.2f", discountPrice);
        
        //final price
        System.out.println("The final discounted price is " + (Math.round(discountPrice)));
    }
}