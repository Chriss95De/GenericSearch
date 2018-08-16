package de.oster.generic.search.method.parameter;


public class BasicFloatParameter extends AbstractParameter {

    @Override
    public Class getType() {
        return Float.class;
    }

    @Override
    public Float parseValue(String input) {
        return Float.parseFloat(input);
    }

}
