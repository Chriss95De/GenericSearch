package de.oster.generic.search.method.defaults;

import de.oster.generic.search.method.Method;
import de.oster.generic.search.method.parameter.BasicStringParameter;
import de.oster.generic.search.method.parameter.Parameter;

import java.util.ArrayList;

public class LikeMethod implements Method {

    @Override
    public String getName() {
        return "LIKE";
    }

    @Override
    public ArrayList<Parameter> getParameters() {

        ArrayList<Parameter> params = new ArrayList<>();

        params.add(new BasicStringParameter(){
            @Override
            public String getDescription() {
                return "Outputs anything like the given value. Wildcards are defined by %";
            }
        });

        return params;
    }
}
