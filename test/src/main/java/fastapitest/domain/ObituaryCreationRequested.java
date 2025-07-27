package fastapitest.domain;

import fastapitest.domain.*;
import fastapitest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ObituaryCreationRequested extends AbstractEvent {

    private Long funeralInfoId;
    private Long customerId;
    private String customerName;
    private String customerRrn;
    private String customerPhone;
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

    public ObituaryCreationRequested(FuneralInfo aggregate) {
        super(aggregate);
    }

    public ObituaryCreationRequested() {
        super();
    }
}
//>>> DDD / Domain Event
