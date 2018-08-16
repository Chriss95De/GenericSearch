package de.oster.generic;

import de.oster.generic.search.method.Method;
import de.oster.generic.search.method.defaults.LikeMethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StaticConfiguration {

    public static Set<Method> methods = new HashSet<Method>();

    public StaticConfiguration() {
        methods.add(new LikeMethod());
    }
}
