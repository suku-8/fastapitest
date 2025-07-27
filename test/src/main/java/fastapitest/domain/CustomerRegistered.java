package fastapitest.domain;

import fastapitest.domain.*;
import fastapitest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CustomerRegistered extends AbstractEvent {

    private Long customerId;
    private String customerLoginId;
    private String customerLoginPassword;
    private String customerRole;
    private String customerName;
    private String customerRrn;
    private String customerAge;
    private String customerGender;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    private String customerJob;
    private String customerHasChildren;
    private String customerIsMarried;
    private String customerDiseaseList;

    public CustomerRegistered(Customer aggregate) {
        super(aggregate);
    }

    public CustomerRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
