package de.oster.generic.search.vendors.springdata.methods;

import de.oster.generic.search.method.defaults.LikeMethod;
import de.oster.generic.search.method.parameter.Parameter;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by Christian Oster christian.oster95@gmail.com on 19.08.2018.
 */
public class LikeSpecification extends LikeMethod implements Specification
{
    @Override
    public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {

        Parameter parameter = getParameters()[0];

        return cb.like(root.<String>get(this.attribute), (String)parameter.getValue());
    }
}
