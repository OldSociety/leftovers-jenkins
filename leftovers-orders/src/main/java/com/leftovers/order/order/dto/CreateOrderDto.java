package com.leftovers.order.order.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Time;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class CreateOrderDto {

    @NotNull
    //@NotBlank(message = "Customer is required")
    //public Customer customer;
    private Integer customerId;

    @NotNull
    //@NotBlank(message = "Restaurant is required")
    //private Restaurant restaurant;
    private Integer restaurantId;

    //@NotNull
    //@NotBlank(message = "Driver is required")
    //private Driver driver;
    private Integer driverId;

    //private Discount discount;
    private Integer discountId;

    private Time deliveryTime;// = Time.valueOf("01:01:01");

    //private EnumOrderStatus status;
    private String orderStatus = "pending";

    private BigDecimal totalPrice;

    private Integer driverRating;

    //gonna need to think about how to make this work
//    private List<OrderItem> items;
}