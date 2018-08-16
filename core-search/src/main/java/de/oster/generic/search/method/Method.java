package de.oster.generic.search.method;

import de.oster.generic.search.StatementPart;
import de.oster.generic.search.method.parameter.Parameter;

import java.util.ArrayList;
import java.util.List;

public interface Method extends StatementPart {

    /**
     * Identifier for the parser.
     */
    String getName();


    /**
     * Defines the parameter types, order naturally given by the {@link ArrayList}.
     */
    List<Parameter> getParameters();

}
