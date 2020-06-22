package core.app.exceptions;

import java.io.EOFException;
import java.io.IOException;

public abstract class InheritedThrows {

    abstract void doWithEx() throws IOException;

    void doConcreteWithEx() throws EOFException {

    }
}

class Descendant extends InheritedThrows {

    @Override
    void doWithEx() { // ! не обязательно указвывать Exception'ы указанные в абстрактных методах родителя
    }

    @Override
    void doConcreteWithEx() throws EOFException { // Обязательно, ругается компилятор
        super.doConcreteWithEx();
    }
}

