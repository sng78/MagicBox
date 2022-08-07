public class Main {
    public static void main(String[] args) {
        //магическая коробка для строк
        MagicBox<String> box1 = new MagicBox<>(3);
        System.out.println("\n   Коробка №1 (String)");
        box1.add("Кукла");
        box1.add("Часы");
        box1.add("Очки");
        box1.add("Ручка");
        box1.pick();
        box1.pick();
        box1.pick();

        System.out.println();

        //магическая коробка для чисел
        MagicBox<Integer> box2 = new MagicBox<>(4);
        System.out.println("\n   Коробка №2 (числа)");
        box2.add(1);
        box2.add(652);
        box2.add(95);
        box2.add(78698);
        box2.add(0);
        box2.add(5452);
        box2.pick();
        box2.pick();
        box2.pick();

        //проверка на обработку RuntimeException
        System.out.println();
        MagicBox<Integer> box3 = new MagicBox<>(3);
        System.out.println("\n   Коробка №3 (числа)");
        box3.add(1);
        box3.pick();
    }
}