package edu.icet.model.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {
    private String id;
    private String title;
    private String name;
    private Date dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;
}
