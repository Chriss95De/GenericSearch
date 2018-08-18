package de.oster.generic.search.method.defaults;

import de.oster.generic.search.method.Method;

/**
 * Created by Christian Oster christian.oster95@gmail.com on 19.08.2018.
 */
public abstract class AbstractMethod implements Method {

    protected String attribute;

    @Override
    public void setAttributeName(String attribute) {
        this.attribute = attribute;
    }
}
