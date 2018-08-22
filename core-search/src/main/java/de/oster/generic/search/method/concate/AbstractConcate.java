package de.oster.generic.search.method.concate;

import de.oster.generic.search.method.Method;

/**
 * Created by Christian Oster christian.oster95@gmail.com on 22.08.2018.
 */
public abstract class AbstractConcate<T> implements Concate {

    Method method;

    @Override
    public void setMethod(Method method) {
        this.method = method;
    }

    @Override
    public T getMethod() {
        return (T)method;
    }

}
