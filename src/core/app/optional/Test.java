package core.app.optional;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Optional<String> s = Optional.of("input");
        System.out.println(s.map(Test::getOutput)); // Метод map() принимает функцию,
        // возвращающую объект, который она впоследствии обрачивает в Optional и
        // возвращает.

        System.out.println(s.flatMap(Test::getOutputOpt)); // Метод flatMap() принимает
        // функцию, возвращающую Optional. Этот Optional flatMap() возвращает как есть.
    }

    static String getOutput(String input) {
        return input == null ? null : "map output for " + input;
    }

    static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("flatMap output for " + input);
    }
}
