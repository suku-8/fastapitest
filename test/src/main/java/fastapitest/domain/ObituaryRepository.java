package fastapitest.domain;

import fastapitest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "obituaries",
    path = "obituaries"
)
public interface ObituaryRepository
    extends PagingAndSortingRepository<Obituary, Long> {}
