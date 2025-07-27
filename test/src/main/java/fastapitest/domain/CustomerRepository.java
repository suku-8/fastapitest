package fastapitest.domain;

import fastapitest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository
    extends PagingAndSortingRepository<Customer, Long> {}
