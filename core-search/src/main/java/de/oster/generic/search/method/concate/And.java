package de.oster.generic.search.method.concate;

/**
 * Created by Christian Oster christian.oster95@gmail.com on 22.08.2018.
 */
public abstract class And<T> extends AbstractConcate<T> {

    @Override
    public String getName() {
        return "AND";
    }

}
