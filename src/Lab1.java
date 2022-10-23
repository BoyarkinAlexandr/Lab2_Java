import java.util.Scanner;

public class Lab1 extends Point3d {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Point3d coord1 = new Point3d();
        Point3d coord2 = new Point3d();
        Point3d coord3 = new Point3d();
        System.out.println("Введите координаты Х для 1 точки:");
        coord1.setX(scn.nextDouble());
        System.out.println("Введите координаты Y для 1 точки:");
        coord1.setY(scn.nextDouble());
        System.out.println("Введите координаты Z для 1 точки:");
        coord1.setZ2(scn.nextDouble());

        System.out.println("Введите координаты Х для 2 точки:");
        coord2.setX(scn.nextDouble());
        System.out.println("Введите координаты Y для 2 точки:");
        coord2.setY(scn.nextDouble());
        System.out.println("Введите координаты Z для 2 точки:");
        coord2.setZ2(scn.nextDouble());

        System.out.println("Введите координаты Х для 3 точки:");
        coord3.setX(scn.nextDouble());
        System.out.println("Введите координаты Y для 3 точки:");
        coord3.setY(scn.nextDouble());
        System.out.println("Введите координаты Z для 3 точки:");
        coord3.setZ2(scn.nextDouble());
        scn.close();
        System.out.println(String.format("%.2f", coord1.distanceTo(coord1, coord2)));
        if (ComparingCoord(coord1,coord2) == false)
            System.out.println(computeArea(coord1,coord2,coord3));
        else
            System.out.println("Координаты одинаковы");

    }

    public static double computeArea(Point3d a,Point3d b,Point3d c)
    {
        double ABx = b.getX() - a.getX();
        double ABy = b.getY() - a.getY();
        double ABz = b.getZ2() - a.getZ2();
        double ACx = c.getX() - a.getX();
        double ACy = c.getY() - a.getY();
        double ACz = c.getZ2() - a.getZ2();
        double forDeti = ABy * ACz - ABz * ACy;
        double forDetj = ABz * ACx - ABx * ACz;
        double forDetk = ABx * ACy - ACx * ABy;
        double modulC = Math.sqrt(Math.pow(forDeti,2) + Math.pow(forDetj,2) + Math.pow(forDetk,2));
        double answer = 1.0/2 * modulC;
        return answer;
    }

    /*public static double computeArea(Point3d obj1,Point3d obj2,Point3d obj3)
    {
        double a = obj2.getX() - obj1.getX();
        double b = obj2.distanceTo(obj3);
        double c = obj3.distanceTo(obj1);
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }*/
}