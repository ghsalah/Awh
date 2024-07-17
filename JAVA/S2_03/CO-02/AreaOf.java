
interface AreaOfCircle{
 double r=10;
 double area=Math.PI*r*r;
 String name="Circle";
}
interface AreaOfRectangel{
    double l=2;
    double b=3;
    double area=l*b;
    String name="Circle";
   }


 class Area implements AreaOfCircle,AreaOfRectangel {
    public void displayCircle(){
        System.out.println("the area of "+AreaOfCircle.r+" radios "+AreaOfCircle.name+" is "+AreaOfCircle.area);

    }
    public void displayRectangel(){
        System.out.println("the area of "+AreaOfRectangel.l+" legtha and "+AreaOfRectangel.b+" bredth "+AreaOfRectangel.name+" is "+AreaOfRectangel.area);
    }

    
}

public class AreaOf {
    public static void main(String[] args) {
        Area a=new Area();
        a.displayCircle();
        a.displayRectangel();
    }
}
