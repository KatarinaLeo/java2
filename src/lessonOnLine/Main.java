package lessonOnLine;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

//    public static void main(String[] args){
//        Action action = new Action() {
//            @Override
//            public int action(int a, int b) {
//                return a + b;
//            }
//        };
//
//        action = (x, y) -> x - y; //это называется лямюда выражение
//        System.out.println(action.action(10,5));
//
//        Action1 action1;
//        action1 = () -> 5; // тк в интерфейсе метод возращает int, поэтому в лямбда выражении мы должны что-то предать.
//                           // Если бы было void то могли бы вернуть System.out.println
//
//        Action2 action2;
//        action2 = a -> a + 5;
//
//        Action3 action3;
//        action3 = (a, b, c) -> a + b + c;
//    }

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        mathOperation.mathOperation(5,5, (a,b) -> a + b);
        mathOperation.mathOperation(5,5, (a,b) -> a - b);
        mathOperation.mathOperation(10,5, (a,b) -> a / b);
        mathOperation.mathOperation(5,5, (a,b) -> a * b);

        Consumer<String> consumer;
        consumer = (s) -> System.out.println(s);
        consumer.accept("Katty");


        fooConsumer (s -> System.out.println(s), "Katy"); // это реализация метода
        // переменная s - это переменная единственная, которая подается на вход метода accept

        // переходим к Optional

        Cat cat = null;
        Optional<Cat> optionalCat = Optional.ofNullable(cat);
        foo(optionalCat);
    }

    public static void fooConsumer(Consumer<String> consumer, String srt){
        consumer.accept(srt);
    }

    public static String foo(Optional<Cat> optionalCat){
        return optionalCat.map(Cat::getName).orElse("katya");
    }
}
