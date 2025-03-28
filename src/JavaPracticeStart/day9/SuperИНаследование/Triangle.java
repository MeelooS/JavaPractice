package JavaPracticeStart.day9.SuperИНаследование;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, String colour){
        super(colour);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area(){
        double halfs = perimeter()/2;
        double s = Math.sqrt(halfs*(halfs-a)*(halfs-b)*(halfs-c));
        return s;
    }
    public double perimeter(){
        int p = a+b+c;
        return p;
    }
}
