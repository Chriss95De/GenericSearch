package de.oster.generic.search.method;

import de.oster.generic.search.StatementPart;
import de.oster.generic.search.method.parameter.Parameter;

import java.util.ArrayList;
import java.util.List;

public interface Method<T> extends StatementPart {

    /**
     * Identifier for the parser.
     */
    String getName();


    /**
     * Defines the needed parameter for the method
     */
    Parameter[] getParameters();


    /**
     * Injects the name of the field or attribute that is operated on.
     */
    void setAttributeName(String attribute);

}
