package com.leftovers.order.order.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_driver")
public class Driver {


    @Id
    @Column(name = "account_id", nullable = false)
    private Integer id;


    @OneToOne
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Driver.class)
    @JsonIdentityReference(alwaysAsId = true)
    @PrimaryKeyJoinColumn(name = "account_id")//, referencedColumnName = "id")
    private Account account;

    @Column(name = "license_plate", nullable = false)
    private String licensePlate;

    @Column(name = "rating", nullable = false)
    private BigDecimal rating;
/*
    @OneToMany
    private List<Order> orders;
*/
}