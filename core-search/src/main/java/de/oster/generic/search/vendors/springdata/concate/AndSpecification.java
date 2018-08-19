package de.oster.generic.search.vendors.springdata.concate;

import de.oster.generic.search.method.concate.And;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by Christian Oster christian.oster95@gmail.com on 19.08.2018.
 */
public class AndSpecification extends And implements Specification {

    @Override
    public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.and();
    }
}
