package com.assingment.jobSearhPortal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Validated
public class Job {
    @Id
    private Long jobId;
    private String title;
    private String description;
    private String location;
    @Min(message = "20000", value = 0L)
    private Double salary;
    @Email
    private String companyEmail;
    private String companyName;
    private String employerName;
    @Enumerated
    private Type jobType;
}
