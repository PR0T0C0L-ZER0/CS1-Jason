import java.lang.Math;

class probThree 
{
    public static void main(String args[])
    {
        //base values
        double radius=5;
        double height=8;

        //volume
        double circsurf=((Math.PI)*(radius*radius));
        double volume=(circsurf*height);

        //surface area
        double circumfrence=((Math.PI)*(radius*2));
        double edgeArea=(circumfrence*height);
        double totalArea=((circsurf*2)+edgeArea);

        System.out.print("for a cylinder with a height of "+height+" inches and a radius of "+radius+" inches, the total surface area is "+totalArea+" square inches, and the volume is a total of "+volume+" cubic inches.");
    }
}
