package de.oster.generic.search;

import de.oster.generic.search.method.Method;

public class Statement {

    private String field;

    private String value;

    private Method method;

    public Statement(String field, String value, Method method) {
        this.field = field;
        this.value = value;
        this.method = method;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
