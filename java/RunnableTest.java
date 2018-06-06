public class RunnableTest {
    public static void main (String[] args) {
        System.out.println ("lambda test");

        Runnable r1 = new Runnable () {

            @Override
            public void run () {
                System.out.println("Hello World 1");
            }
        };

        Runnable r2 = () -> System.out.println("Hello world 2");

        r1.run();
        r2.run();
    }
}