package de.oster.generic.search.method.parameter;

public interface Parameter<T> {

    String getName();

    String getDescription();

    Class<?> getType();

    T parseValue(String input);
}
