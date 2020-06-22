package core.app.exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {
        try {
            throw new SecondException();
        } catch (SecondException | ArithmeticException e) { // работает
//        } catch (SecondException | FirstException e) { // не работает, если исключения из одной иерархии наследования
        } catch (RuntimeException e) { // работает
            // можно комбинировать разные подходы к ловле исключений
        }
    }

    private static class FirstException extends RuntimeException {

    }

    private static class SecondException extends FirstException {

    }
}
