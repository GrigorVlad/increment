public class Main {

    public static void main(String[] args) {
        Counter counter = new MagicCounter();
        counter.increment();
        System.out.println(counter.getValue());
    }
}
