package JavaPracticeStart.day9.SuperИНаследование;

public class Rectangle extends Figure{
    int a;
    int b;
    public Rectangle(int a, int b, String colour){
        super(colour);
        this.a=a;
        this.b=b;
    }
    public double area(){
        int s= a*b;
        return s;
    }
    public double perimeter(){
        int p = a*2 + b*2;
        return p;
    };
}
