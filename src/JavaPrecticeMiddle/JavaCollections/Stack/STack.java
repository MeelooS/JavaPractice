package JavaPrecticeMiddle.JavaCollections.Stack;

import java.util.Stack;

public class STack {
    public static void main(String[] args){
        //Stack противоположен классу Queue, т.е. кто зашел последним, тот выходит первым
        Stack<Integer> stack = new Stack<>();

        //метод push - добавляет элемент в Stack
        stack.push(5);
        stack.push(3);
        stack.push(1);
        System.out.println(stack);

        //метод peek - позволяет посмотреть на последний элемент в Stack, при этом не удаляя его
        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack);

        //метод pop - достает последний элемент из Stack(сам элемент из Stack удаляется)
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println();

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
