package de.oster.generic.search.method.concate;

import de.oster.generic.search.StatementPart;
import de.oster.generic.search.method.Method;

/**
 * Created by Christian Oster christian.oster95@gmail.com on 22.08.2018.
 */

public interface Concate<T> extends StatementPart {

    /**
     * Identifier for the parser.
     */
    String getName();

    void setMethod(Method method);

    T getMethod();

}
