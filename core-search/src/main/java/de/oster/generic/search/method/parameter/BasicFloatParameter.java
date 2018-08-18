package de.oster.generic.search.method.parameter;


public class BasicFloatParameter extends AbstractParameter {

    @Override
    public Float getValue() {
        return Float.parseFloat(this.rawValue);
    }
}
