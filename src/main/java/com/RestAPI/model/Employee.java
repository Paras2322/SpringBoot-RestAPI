package com.RestAPI.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_info")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Integer empId;

    @Column(name="emp_name", nullable = false)
    private String empName;

    @Column(name="emp_city", nullable = false)
    private String empCity;

    @Column(name="emp_phone", nullable = false)
    private String empPhoneNumber;


}
