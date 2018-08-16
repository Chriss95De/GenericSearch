package de.oster.generic.search.method.parameter;


public class BasicStringParameter extends AbstractParameter {

    @Override
    public Class getType() {
        return String.class;
    }

    @Override
    public String parseValue(String input) {
        return input;
    }

}
