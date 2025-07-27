package fastapitest.domain;

import fastapitest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "pythons", path = "pythons")
public interface PythonRepository
    extends PagingAndSortingRepository<Python, Long> {}
