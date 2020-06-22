package core.app.exceptions;

import org.junit.jupiter.api.Test;

public class SuppressedEx implements AutoCloseable {

    static int number = 0;

    @Test
    void tryCatchFinally() {
        /** Подавленные исключения (suppressed exception) образуются, когда в блоке try
         *  генерируется исключение и в методе close() при закрытии ресурса генерируется
         *  исключение, в этом случае первое исключение считается главным остальные подавленные*/
        try (SuppressedEx ex1 = new SuppressedEx();
             SuppressedEx ex2 = new SuppressedEx()) {
            System.out.println("Try 1");
            throw new RuntimeException("Main exception");
        } catch (Exception e) {
            // основное исключение уже содержить инфо о подавленном исключении
            e.printStackTrace();
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t.getMessage());
            }
        } finally {
            throw new RuntimeException("Ex in finally");
        }
    }

    @Test
    void noCatchAndExInFinally() {
        /** Даже, если в методе close() будет сгенерировано исключение и оно добавится к подавленным
         * исключения для блока try, все они заменятся исключением,
         * которое будет сгенерировано блоком finally .
         */
        try (SuppressedEx ex1 = new SuppressedEx();
             SuppressedEx ex2 = new SuppressedEx()) {
            System.out.println("Try 2");
        } finally {
            throw new RuntimeException("Ex in finally");
        }
    }

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Suppressed Exception");
    }
}

