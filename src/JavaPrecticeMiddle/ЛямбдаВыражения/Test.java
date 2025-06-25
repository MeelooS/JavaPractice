package JavaPrecticeMiddle.ЛямбдаВыражения;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Executable {
    int execute(int x, int y);
}
class Runner{
    public void run(Executable e){
        System.out.println(e.execute(10, 15));
    };
}

//class ExecutableImplements implements Executable{
//
//    @Override
//    public void execute() {
//        System.out.println("Hello");
//    }
//}
public class Test {
    public static void main(String[] args){
        //попросту говоря, лямбда выражения - способ передать кусок кода в метод
        //лябда выражение - это анонимный метод, т.е. метод без названия
        //в лямбде не указывается тип возвращаемого значения
        //любые интерфейсы с одним методом могут быть преобразованы в лямбда выражения
        //у лямбда выражений область видимости распространяется на всю область, где это выражение было создано, т.е. если мы внутри какого-либо класса (где создано лямбда выражение) проинициализировали переменную, и попытаемся ту же переменную проинициализировали в лямбде, то будет ошибка
        //также можно лямбда выражения записывать внуть переменной

        //методы в интерфейсах не могут иметь тела, поэтому приходится создавать отдельный класс, реализующий данный интерфейс и прописывать там исполнение метода (см. пример 2.4.1)

        /*
        Пример1: у нас есть выражение
         Thread thread = new Thread(new Runnable()) {
            @Override
            public void run() {

            }
        });
        так оно может быть преобразовано в лямбда выражение:
        Thread thread = new Thread(() -> {
             *здесь пишутся различные команды
        });

        Пример2: простейшое лямбда выражение без аргументов(расскомментить класс ExecutableImplements и у интерфейса Executable поменять int на void, убрать метод execute2, а также оставить пустой аргумент execute)
        2.1)Создадим новый интерфейс Executable;
        2.2)Создадим класс Runner, у которого в методе run в качестве аргумента будет реализация интерфейса Executable;
        2.3)Создадим новый объект класса Runner и запустим команду run, где в качестве  аргумента захотим передать реализацию интерфейса Executable;
        2.4)Сделать это можно 3 способами:
           2.4.1)Создать новый класс ExecutableImplements, который реализует интерфейс Executable и прописать в нем реализацию метода execute и передать этот класс в качестве аргумента методу run;
           2.4.2)Реализовать с помощью анонимного класса
           2.4.3)Использование лямбда выражения
           Runner runner = new Runner();
        runner.run(new ExecutableImplements());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        runner.run(() -> System.out.println("Hello"));

        Пример3:(закомментить класс ExecutableImplements и у интерфейса Executable поменять void на int, убрать метод execute2, а также оставить пустой аргумент execute)
        //в лямбде не указывается тип возвращаемого значения
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello");
                System.out.println("Goodbye");
                return 1;
            }
        });
        runner.run(() -> 5);  //если команда только одна, то можно опустить return и фигурные скобки
        }

        Пример 4: лямбда выражения с одним аргументом (закомментить класс ExecutableImplements и у интерфейса Executable поменять void на int, убрать метод execute2, а также в качестве аргумента execute указать int x)
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x) {
                return x+5;
            }
        });
        runner.run(x -> x+5);  //можно в аргументах опустить тип переменной int, т.к. в реализации тип уже указан, а также убрать у аргумента круглые скобки, т.к. аргумент всего один (если много, то оставить)

        Пример 4: лямбда выражения с несколькими аргументами (закомментить класс ExecutableImplements и у интерфейса Executable поменять void на int, убрать метод execute2, а также в качестве аргумента execute указать int x и int y)
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x+y;
            }
        });
        runner.run((int x, int y) -> x+y);  //можно в аргументах опустить тип переменной int, т.к. в реализации тип уже указан, а также убрать у аргумента круглые скобки, т.к. аргумент всего один (если много, то оставить)

        Пример 5: лямбда выражения реализующие интерфейс с двумя методами (закомментить класс ExecutableImplements и у интерфейса Executable поменять void на int, добавить метод execute2, а также в качестве аргумента execute указать int x и int y)
                  Добавляяем в интерфейс Executable метод execute2
                  В случае с использованием анониного класса, добавить новый метод легко:
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x+y;
            }

            @Override
            public void execute2() {

            }
        });
        В лямбда выражении этого сделать нельзя, реализовать можно только один метод

        Пример 6: В лямбда выражении легко получить доступ к какой-либо переменной:
        int a =0;
        runner.run((int x, int y) -> x+y+a);
        Главное, чтобы эта переменная не менялась вообще, т.е. либо должна быть final, либо не менялась вообще
         */
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x+y;
            }
        });
        int a =0;
        runner.run((int x, int y) -> x+y+a);  //можно в аргументах опустить тип переменной int, т.к. в реализации тип уже указан, а также убрать у аргумента круглые скобки, т.к. аргумент всего один (если много, то оставить)

        //Теперь еще один пример исполязования лямбда-выражения на методе compare:
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Bob");
        list.add("KATY");

        //реализация с помощью анонимного класса
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                } else if (o1.length()<o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list);

        //реализация с помощью лямбда выражения
        list.sort((s1,s2)->{
            if(s1.length()>s2.length()){
                return 1;
            } else if (s1.length()<s2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(list);

        //также можно засунуть лямбда выражение в переменную:
        Comparator<String> comparator = (s1,s2)->{
            if(s1.length()>s2.length()){
                return 1;
            } else if (s1.length()<s2.length()) {
                return -1;
            } else {
                return 0;
            }
        };

        list.sort(comparator);
        System.out.println(list);
    }
}
