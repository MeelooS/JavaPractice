package JavaPrecticeMiddle.JavaCollections.LinkedList;

import java.util.Arrays;

public class MyLinkedList {
    //в LinkedList элементы списка содержат ссылки на следующие элементы спсика: 1-й содержит ссылку на 2-й, 2-й на 3-й и т.д. [1] -> [2] -> [3]

    private Node head;
    private int size;

    public void add(int value){
        if(head==null){
            head=new Node(value);
        } else {
            Node temp = head;           //временный узел, в которые будем записывать текущее значение узла
            //метод для прохождения по элементам массива
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            //когда дошли до последнего элемента, создаем у него ссылку на следующую новую ноду
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index){
        int currentIndex=0;  //переменная, которя указывает на текущий индекс
        Node temp = head;
        //[1] -> [2] -> [3]
        while (temp!=null){
            if(currentIndex==index){
                return temp.getValue();
            } else {
                temp=temp.getNext();
                currentIndex++;
            }
        }
        //если после окончания цикла не смогли вернуть значение, т.е. когда индекс больше размера массива
        throw new IllegalArgumentException();
    }

    //удалить элемент списка - значит  поставить предыдущему элементу другую ссылку, т.е. чтобы удалить элемент с индексом 1 нам
    //нужно будет перейти на элемент с индексом 0 и поменять у него ссылку, а когда поменяем, уменьшить размер списка на 1 и выйти
    //из метода, чтобы дальше не крутиться в цикле
    public void remove(int index){
        //т.к. у нулевого элемента index-1(==0-1), то переопределяем главный элемент на следующий
        if(index==0){
            head=head.getNext();
            size--;
            return;
        }
        int currentIndex=0;
        Node temp = head;
        //[1] -> [2] -> [3]
        //[1] -> [3]
        while(temp!=null){
            if(currentIndex==index-1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp.getNext();
                currentIndex++;
            }
        }
    }

    public String toString(){
        //создаем массив, куда будем записывать элементы списка
        int [] result = new int[size];
        int idx=0;
        Node temp=head;
        while (temp!=null){
            result[idx++]=temp.getValue();
            temp=temp.getNext();
        }
        return Arrays.toString(result);
    }
    private static class Node{
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }
    }
}
