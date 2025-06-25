package JavaPracticeStart.day9.SuperИНаследование;

public class TestFigures {
    public static void main(String[] args){
        Figure figures[] = {new Triangle(10, 10, 10, "Red"),
                            new Triangle(10, 20, 30, "Green"),
                            new Triangle(10, 20, 15, "Red"),
                            new Rectangle(5, 10, "Red"),
                            new Rectangle(40, 15, "Orange"),
                            new Circle(4, "Red"),
                            new Circle(10, "Red"),
                            new Circle(5, "Blue")};
        System.out.println("Сумма периметров всех красных фигур");
        System.out.println(calculateRedPerimeter(figures));
        System.out.println("Сумма площадей всех красных фигур");
        System.out.println(calculateRedArea(figures));
    }


    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (Figure figure:figures){
            if(figure.getColour().equals("Red")){
                sum = sum+figure.perimeter();
//                System.out.println(sum);
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures){
        double multi = 0;
        for(Figure figure:figures){
            if(figure.getColour().equals("Red")){
                multi = multi+figure.area();
//                System.out.println(multi);
            }
        }
        return multi;
    }
}