package core.app.initialization;

public class MyTest {

    static {
        initialize();
    }

    private static int sum;

    public static int getSum() {
        System.out.println(initialized);
        initialize();
        return sum;
    }

    private static boolean initialized = false; // Если бы данное статическое поле было
    // расположено выше статического блока инициализации, то порядок инициализации был
    // бы иным: сначала инициализировалось поле значением, указанным в месте объявления,
    // а затем значением, указанным в статическом блоке. Но в нашем случае значение,
    // указанное при объявлении поля отработает позже блока инициализиции так как находится
    // в коде ниже этого блока, поэтому и перетрет заданное блоком значение.

    public static boolean getInitialized() {
        return initialized;
    }

    private static void initialize() {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true; // Несмотря на то, что в ходе работы статического блока
            // инициализации значение переменной initialized будет установлено true, а
            // sum = 4450, загрузчик класса перетрет initialized на false, так как на
            // последнем этапе инициализации он должен инициализировать статические поля
            // значениями, указанными в месте объявления.
        }
    }
}
