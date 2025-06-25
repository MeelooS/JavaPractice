package JavaPracticeStart.day9.SuperИНаследование;

public class Circle extends Figure{
    int r;
    final double pi = 3.14;
    public Circle(int r, String colour){
        super(colour);
        this.r=r;
    }
    public double area(){
        double p = 2*pi*r;
        return p;
    };
    public double perimeter(){
        double s =  pi*(Math.pow(r,2));
        return s;
    };
}
