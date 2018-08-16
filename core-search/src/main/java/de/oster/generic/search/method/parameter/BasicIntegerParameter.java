package de.oster.generic.search.method.parameter;


public class BasicIntegerParameter extends AbstractParameter {

    @Override
    public Class getType() {
        return Integer.class;
    }

    @Override
    public Integer parseValue(String input) {
        return Integer.parseInt(input);
    }

}
