package JavaPrecticeMiddle.ТестированиеJUnit;

public class Test {
    public static void main(String[] args){
        //JUnit - библиотека для модульного тестирования
        /*Основные правила:
        1.Каждый тестовый сценарий(test case) - отдельный метод. Методы необходимо помечать аннотацией Test;
        2.Существуют вспомогательные методы с аннотациями @Before, @BeforeClass, @After, @AfterClass;
        3.Тестовый класс необходимо называть суффиксом Test (напр., Vector2DTest);
        4.Тестовые методы желательно должны содержать "should" в названии (напр., sumShouldBePositive)
         */

        //Аннотация @Test объявляет метод тестовым (метод должен быть обязательно public void)
        //У аннотации @Test может быть 2 параметра: expected - когда что-то ожидаем и timeout - время, за которое должен выполниться тест
        /*
        Проверки на сопоставление ожидания с реальностью (Assert'ы) имеют следующие методы:
        1.assertTrue() - проверяет, что метод вернул значение true;
        2.assertFalse() - проверяет, что метод вернул значение false;
        3.assertEquals() - проверяет, что фактический результ метода равен ожидаемому;
        4.assertArrayEquals() - провряет то же самое для массивов;
        5.assertNotEquals() - проверяет, что фактический результ метода не равен ожидаемому;
        6.assertSame();
        7.assertNotSame();
        У ассертов несколько аргументов в (). В первом аргументе указываем ожидаемый рез-тат, во втором фактический, в 3-м указывается точность, т.е. с какой точностью совпадают ожидаемый и фактический результат

        Вместо Assert можно использовать Assume ( с методами assumeFalse, assumeEquals и т.д.). Отличие от Assert в том, что если проверка верна - тест пройдет, если не верна - тест игнорируется (в случае с Assert тест валится)
         */

                                                          //Примеры:
        /*
        Пример 1:
        1.Создадим класс Vector2D
        2.Создадим тестовый класс в папке java(т.к. это не maven проект, то содержимое тестового класса будет реализовано здесь)
        @Test
        public void newVectorShouldBeZeroLength(){
            Vector2D v1 = new Vector2D();  //action
            // assertion
        Assert.assertEquals(0, v1.length(), 1e-9);
        }

        Пример 2:
        1.Создадим класс MyMath, в котором будет реализовано деление одного числа на другое, а также выброс Exception'а в случае деления на 0
        2.Создадим тестовый класс в папке java(т.к. это не maven проект, то содержимое тестового класса будет реализовано здесь)
        @Test(expected = ArithmeticException.class)
        public void zeroDenominatorShouldThrowException(){
            MyMath.divide(1,0);  //action
        }
        В аннотации @Test указываем параметр expected, т.е. ожидаем, что в этом тестовом сценарии будет выброшено исключение
         */

                                                        //Аннотации
        /*
        @Ignore - тест, помеченный им не выполняется;
        //Вспомогательные методы:
        @BeforeClass - запускается только один раз при запуске теста (static)
        @Before - запускается перед каждым тестовым методом
        @After - запускается после каждого метода
        @AfterClass - запускается после того, как отработали все тестовые методы (static)

                                                          //Пример
        У нас есть 3 тестовых метода:

        @Test
        public void newVectorShouldBeZeroLength(){
            Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.length(), 1e-9);
        }
        @Test
        public void newVectorShouldHaveZeroX(){
            Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), 1e-9);
        }
        @Test
        public void newVectorShouldHaveZeroY(){
            Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), 1e-9);
        }

        Т.к. у всех них сначала создается объект v1, то его создание можно перенести в аннотацию @Before:

        @Before
        public void createNewVector(){
        Vector2D v1 = new Vector2D();
        }
        @Test
        public void newVectorShouldBeZeroLength(){
        Assert.assertEquals(0, v1.length(), 1e-9);
        }
        @Test
        public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(), 1e-9);
        }
        @Test
        public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(), 1e-9);
        }

        И т.к. для всех тестовых методов объект не различается, то можно вынести создание этого объекта в @BeforeClass.
        Если в пред. примере мы создавали каждый раз новый объект перед каждым тестом, то теперь создастся один объект для всех тестов сразу (метод обязан быть static т.к. метод принадлежит классу!)
        @BeforeClass
        public static void createNewVector(){
        Vector2D v1 = new Vector2D();
        }
        @Test
        public void newVectorShouldBeZeroLength(){
        Assert.assertEquals(0, v1.length(), 1e-9);
        }
        @Test
        public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(), 1e-9);
        }
        @Test
        public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(), 1e-9);
        }
         */
    }
}
