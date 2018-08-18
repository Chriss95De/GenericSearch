package de.oster.generic.search.method.parameter;

/**
 * Provides basic template for convenience.
 *
 * Sets default description of empty string.
 *
 * Provides basic string parsing
 *
 */
public abstract class AbstractParameter<T> implements Parameter {

    protected String rawValue;

    @Override
    public String getName() {
        return "value";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }
}
