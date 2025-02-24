package JavaPrecticeMiddle.JavaMultithreading.MUltithreading;

public class MUltithreading2 {
    public static void main(String[] args){
        //2-й способ: через реализацию интерфейса Runnable
        //сначала создаем новый класс и реализуем его от Runnable, потом переопределяем метод run
        //затем создаем новый объект класса Thread из JavaLang и в качестве аргумента передаем оъект нашего нового класса
        //т.е. мы передаем логику из класса Runner классу Thread при создании объекта класса Thread
        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from mainThread");
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for(int i =0; i<1000; i++){
            System.out.println("Hello from MyThread" + i);
        }
    }
}
