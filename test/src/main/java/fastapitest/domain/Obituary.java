package fastapitest.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fastapitest.TestApplication;
import fastapitest.domain.ObituaryDataCreated;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Obituary_table")
@Data
//<<< DDD / Aggregate Root
public class Obituary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long obituaryId;

    private Long funeralInfoId;

    private String obituaryFilePath;

    private String obituaryStatus;

    private Date obituaryCreatedAt;

    private String deceasedName;

    private String deceasedNameHanja;

    private String deceasedRrn;

    private Integer deceasedAge;

    private Date deceasedDate;

    private Date deceasedBirthOfDate;

    private String deceasedGender;

    private String deceasedReligion;

    private String deceasedRelationToHouseholdHead;

    private String reportRegistrationDate;

    private String reporterName;

    private String reporterRrn;

    private String reporterRelationToDeceased;

    private String reporterAddress;

    private String reporterPhone;

    private String reporterEmail;

    private String submitterName;

    private String submitterRrn;

    private String funeralCompanyName;

    private String directorName;

    private String directorPhone;

    private String funeralHomeName;

    private String mortuaryInfo;

    private String funeralHomeAddress;

    private String funeralDuration;

    private String processionDateTime;

    private String burialSiteInfo;

    private String chiefMourners;

    private String templateKeyword;

    public static ObituaryRepository repository() {
        ObituaryRepository obituaryRepository = TestApplication.applicationContext.getBean(
            ObituaryRepository.class
        );
        return obituaryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void createObituaryDataPolicy(
        ObituaryCreationRequested obituaryCreationRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Obituary obituary = new Obituary();
        repository().save(obituary);

        ObituaryDataCreated obituaryDataCreated = new ObituaryDataCreated(obituary);
        obituaryDataCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(obituaryCreationRequested.get???()).ifPresent(obituary->{
            
            obituary // do something
            repository().save(obituary);

            ObituaryDataCreated obituaryDataCreated = new ObituaryDataCreated(obituary);
            obituaryDataCreated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateObituaryInfoPolicy(
        ObituaryImageGenerated obituaryImageGenerated
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Obituary obituary = new Obituary();
        repository().save(obituary);

        */

        /** Example 2:  finding and process
        

        repository().findById(obituaryImageGenerated.get???()).ifPresent(obituary->{
            
            obituary // do something
            repository().save(obituary);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
