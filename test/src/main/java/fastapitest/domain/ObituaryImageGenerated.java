package fastapitest.domain;

import fastapitest.domain.*;
import fastapitest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ObituaryImageGenerated extends AbstractEvent {

    private Long id;

    public ObituaryImageGenerated(Python aggregate) {
        super(aggregate);
    }

    public ObituaryImageGenerated() {
        super();
    }
}
//>>> DDD / Domain Event
