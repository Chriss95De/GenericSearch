package de.oster.generic.search.method.parameter;


public class BasicIntegerParameter extends AbstractParameter {

    @Override
    public Integer getValue() {
        return Integer.parseInt(this.rawValue);
    }

}
