package de.oster.generic.search.method.defaults;

import de.oster.generic.search.method.parameter.BasicStringParameter;
import de.oster.generic.search.method.parameter.Parameter;

public abstract class LikeMethod<T> extends AbstractMethod {

    @Override
    public String getName() {
        return "LIKE";
    }

    @Override
    public Parameter[] getParameters() {

        Parameter[] params = new Parameter[1];

        params[0] = new BasicStringParameter(){
            @Override
            public String getDescription() {
                return "Outputs anything like the given value. Wildcards are defined by %";
            }
        };

        return params;
    }
}
