package core.app.exceptions;

import java.io.IOException;

public class MultiCatchBlock {

    private static class FirstException extends RuntimeException{}
    private static class SecondException extends FirstException{}

    public static void main(String[] args) {
        try {

        } catch (SecondException | ArithmeticException e) { // работает
//        } catch (SecondException | FirstException e) { // не работает, если исключения из одной иерархии наследования
        } catch (RuntimeException e) { // работает

        }
    }
}
