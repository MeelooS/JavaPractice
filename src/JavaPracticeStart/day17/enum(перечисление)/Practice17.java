package JavaPracticeStart.day17;

import java.util.ArrayList;
import java.util.List;

public class Practice17 {
    public static void main(String[] args){
        //1.Создайте Enum “Шахматная фигура” (англ. ChessPiece).
        //Всего существует 6 различных шахматных фигур: король (king), ферзь (queen), ладья (rook), слон (bishop),
        //конь (knight) и пешка (pawn).

        //В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
        //● Ценность фигуры - вещественное число
        //● Строковое обозначение фигуры

        //В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны
        //иметь следующий вид:
        //KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
        //У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.

        //Используя созданный enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных
        //ладьи. Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
        System.out.println("Задание 1");
        List<JavaPracticeStart.day17.ChesssPiece> massive = new ArrayList<>();
        massive.add(JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE);
        massive.add(JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE);
        massive.add(JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE);
        massive.add(JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE);
        massive.add(JavaPracticeStart.day17.ChesssPiece.ROOK_BLACK);
        massive.add(JavaPracticeStart.day17.ChesssPiece.ROOK_BLACK);
        massive.add(JavaPracticeStart.day17.ChesssPiece.ROOK_BLACK);
        massive.add(JavaPracticeStart.day17.ChesssPiece.ROOK_BLACK);
        for(JavaPracticeStart.day17.ChesssPiece i:massive){
            System.out.print(i.getString()+" ");
        }

        //2.Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY.
        //Эта “фигура” будет обозначать пустое пространство на шахматной доске. Ценность этой фигуры равна -1, а
        //строковое обозначение равно нижнему подчеркиванию ("_").

        //Затем создайте класс Шахматная доска (ChessBoard). Этот класс в единственном аргументе конструктора должен
        //принимать на вход двумерный массив шахматных фигур. Этот двумерный массив задает конфигурацию фигур на
        //шахматной доске. Пустое пространство на шахматной доске задается с помощью значения EMPTY. Также, у класса
        //ChessBoard должен быть реализован метод print(), который выводит шахматную доску в консоль.

        //В методе main() класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве аргумента
        //двумерный массив с расположением фигур как на картинке ниже.
        //Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения шахматных
        //фигур.
        System.out.println(" ");
        System.out.println("Задание 2");
        JavaPracticeStart.day17.ChesssPiece[][] matrix = new JavaPracticeStart.day17.ChesssPiece[8][8];
        //1-е поле
        matrix[0][0] = JavaPracticeStart.day17.ChesssPiece.ROOK_BLACK;
        matrix[0][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[0][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[0][3] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[0][4] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[0][5] = JavaPracticeStart.day17.ChesssPiece.ROOK_BLACK;
        matrix[0][6] = JavaPracticeStart.day17.ChesssPiece.KING_BLACK;
        matrix[0][7] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        //2-е поле
        matrix[1][0] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[1][1] = JavaPracticeStart.day17.ChesssPiece.ROOK_WHITE;
        matrix[1][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[1][3] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[1][4] = JavaPracticeStart.day17.ChesssPiece.PAWN_BLACK;
        matrix[1][5] = JavaPracticeStart.day17.ChesssPiece.PAWN_BLACK;
        matrix[1][6] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[1][7] = JavaPracticeStart.day17.ChesssPiece.PAWN_BLACK;
        //3-е поле
        matrix[2][0] = JavaPracticeStart.day17.ChesssPiece.PAWN_BLACK;
        matrix[2][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[2][2] = JavaPracticeStart.day17.ChesssPiece.KNIGHT_BLACK;
        matrix[2][3] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[2][4] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[2][5] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[2][6] = JavaPracticeStart.day17.ChesssPiece.PAWN_BLACK;
        matrix[2][7] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        //4-е поле
        matrix[3][0] = JavaPracticeStart.day17.ChesssPiece.QUEEN_BLACK;
        matrix[3][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[3][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[3][3] = JavaPracticeStart.day17.ChesssPiece.BISHOP_WHITE;
        matrix[3][4] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[3][5] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[3][6] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[3][7] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        //5-е поле
        matrix[4][0] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[4][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[4][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[4][3] = JavaPracticeStart.day17.ChesssPiece.BISHOP_BLACK;
        matrix[4][4] = JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE;
        matrix[4][5] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[4][6] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[4][7] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        //6-е поле
        matrix[5][0] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[5][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[5][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[5][3] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[5][4] = JavaPracticeStart.day17.ChesssPiece.BISHOP_WHITE;
        matrix[5][5] = JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE;
        matrix[5][6] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[5][7] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        //7-е поле
        matrix[6][0] = JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE;
        matrix[6][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[6][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[6][3] = JavaPracticeStart.day17.ChesssPiece.QUEEN_WHITE;
        matrix[6][4] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[6][5] = JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE;
        matrix[6][6] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[6][7] = JavaPracticeStart.day17.ChesssPiece.PAWN_WHITE;
        //8-е поле
        matrix[7][0] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[7][1] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[7][2] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[7][3] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[7][4] = JavaPracticeStart.day17.ChesssPiece.EMPTY;
        matrix[7][5] = JavaPracticeStart.day17.ChesssPiece.ROOK_WHITE;
        matrix[7][6] = JavaPracticeStart.day17.ChesssPiece.KING_WHITE;
        matrix[7][7] = JavaPracticeStart.day17.ChesssPiece.EMPTY;

        JavaPracticeStart.day17.ChessBoard chessBoard = new JavaPracticeStart.day17.ChessBoard(matrix);
        chessBoard.print();
    }
}
