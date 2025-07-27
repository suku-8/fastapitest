package fastapitest.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fastapitest.TestApplication;
import fastapitest.domain.CustomerRegistered;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Customer_table")
@Data
//<<< DDD / Aggregate Root
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @PostPersist
    public void onPostPersist() {
        CustomerRegistered customerRegistered = new CustomerRegistered(this);
        customerRegistered.publishAfterCommit();
    }

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = TestApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }
}
//>>> DDD / Aggregate Root
