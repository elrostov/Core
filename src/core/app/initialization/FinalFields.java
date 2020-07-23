package core.app.initialization;

public class FinalFields {

    // Финальные поля можно инициализировать только во время создания объекта,
    // то есть либо в месте объявления, либо в конструкторе. Их значение должно
    // быть присвоено ровно один раз к моменту завершения инициализации экземпляра.
    private final int i;

    FinalFields() {
        this. i = 5; // OK
    }

    public void initI() {
//        this. i = 5; // Error
    }

    public void initI(final int j) {
//        j = 5; // Error
    }

    public void initLocalFinal () {
        final int k; // OK
        k = 10; // OK
    }
}
