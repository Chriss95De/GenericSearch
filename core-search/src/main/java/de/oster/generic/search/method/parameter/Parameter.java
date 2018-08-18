package de.oster.generic.search.method.parameter;

public interface Parameter<T> {

    String getName();

    String getDescription();

    void setRawValue(String rawValue);

    T getValue();
}
