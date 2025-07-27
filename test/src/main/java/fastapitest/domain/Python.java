package fastapitest.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fastapitest.TestApplication;
import fastapitest.domain.ObituaryImageGenerated;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Python_table")
@Data
//<<< DDD / Aggregate Root
public class Python {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static PythonRepository repository() {
        PythonRepository pythonRepository = TestApplication.applicationContext.getBean(
            PythonRepository.class
        );
        return pythonRepository;
    }

    //<<< Clean Arch / Port Method
    public static void requestObituaryImagePolicy(
        ObituaryDataCreated obituaryDataCreated
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Python python = new Python();
        repository().save(python);

        ObituaryImageGenerated obituaryImageGenerated = new ObituaryImageGenerated(python);
        obituaryImageGenerated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(obituaryDataCreated.get???()).ifPresent(python->{
            
            python // do something
            repository().save(python);

            ObituaryImageGenerated obituaryImageGenerated = new ObituaryImageGenerated(python);
            obituaryImageGenerated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
