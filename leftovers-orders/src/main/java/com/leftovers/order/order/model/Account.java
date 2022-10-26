package com.leftovers.order.order.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_account")
public class Account //implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_no", nullable = false)
    private String phoneNo;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "type", nullable = false)
    //private EnumAccountType type;
    private String type;

   // @OneToOne(mappedBy = "account")
    //private Customer customer;

    //@OneToOne(mappedBy = "account")
    //private Driver driver;
/*
    public boolean equals  (Account account)
    {
        return this == account;
        //return (this.id == account.id);
    }

    @Override
    public int hashCode()
    {
        return this.id;
    }

 */
}