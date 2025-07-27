package fastapitest.infra;

import fastapitest.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FuneralInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FuneralInfo>> {

    @Override
    public EntityModel<FuneralInfo> process(EntityModel<FuneralInfo> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/requestobituarycreation"
                )
                .withRel("requestobituarycreation")
        );

        return model;
    }
}
