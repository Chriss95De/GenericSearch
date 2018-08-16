package de.oster.generic.filter;

public enum FilterMethod {

    FIELD("field"), REMOVEFIELD("remove"), SORT("sort");

    private String value;

    FilterMethod(String value)
    {
        this.value = value;
    }

    public String value()
    {
        return value;
    }
}
