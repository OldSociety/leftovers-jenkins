package com.leftovers.order.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Time;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class UpdateOrderDto {

    private Integer driverId = 0;

    private Integer discountId = 0;

    //public EnumOrderStatus status;
    private String orderStatus = "";

    private Time deliveryTime;

    private BigDecimal totalPrice = new BigDecimal(0);

    private Integer driverRating = 0;

}