package fastapitest.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fastapitest.config.kafka.KafkaProcessor;
import fastapitest.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    FuneralInfoRepository funeralInfoRepository;

    @Autowired
    PythonRepository pythonRepository;

    @Autowired
    ObituaryRepository obituaryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ObituaryDataCreated'"
    )
    public void wheneverObituaryDataCreated_RequestObituaryImagePolicy(
        @Payload ObituaryDataCreated obituaryDataCreated
    ) {
        ObituaryDataCreated event = obituaryDataCreated;
        System.out.println(
            "\n\n##### listener RequestObituaryImagePolicy : " +
            obituaryDataCreated +
            "\n\n"
        );

        // Sample Logic //
        Python.requestObituaryImagePolicy(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ObituaryCreationRequested'"
    )
    public void wheneverObituaryCreationRequested_CreateObituaryDataPolicy(
        @Payload ObituaryCreationRequested obituaryCreationRequested
    ) {
        ObituaryCreationRequested event = obituaryCreationRequested;
        System.out.println(
            "\n\n##### listener CreateObituaryDataPolicy : " +
            obituaryCreationRequested +
            "\n\n"
        );

        // Sample Logic //
        Obituary.createObituaryDataPolicy(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ObituaryImageGenerated'"
    )
    public void wheneverObituaryImageGenerated_UpdateObituaryInfoPolicy(
        @Payload ObituaryImageGenerated obituaryImageGenerated
    ) {
        ObituaryImageGenerated event = obituaryImageGenerated;
        System.out.println(
            "\n\n##### listener UpdateObituaryInfoPolicy : " +
            obituaryImageGenerated +
            "\n\n"
        );

        // Sample Logic //
        Obituary.updateObituaryInfoPolicy(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
