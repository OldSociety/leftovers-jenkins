package com.leftovers.order.order.model;


import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = com.leftovers.order.order.model.Restaurant.class)
    //@JsonIdentityReference(alwaysAsId = true)
    @JoinColumn(name = "address_id", nullable = false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    @Column(name = "phone_no", length = 15)
    private String phoneNo;

    @Column(name = "website", nullable = false)
    private String website;

    @Column(name = "open_time")
    private Time openTime;

    @Column(name = "close_time")
    private Time closeTime;

    @Column(name = "rating")
    @Builder.Default
    private BigDecimal rating = new BigDecimal("5.0");

    @Column(name = "rating_count")
    @Builder.Default
    private Integer ratingCount = 0;

    //@OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //private List<Food> menuItems;


}