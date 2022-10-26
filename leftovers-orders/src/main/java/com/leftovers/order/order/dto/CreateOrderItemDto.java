package com.leftovers.order.order.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class CreateOrderItemDto {

    @NotNull
    public Integer orderId;

    @NotNull
    public Integer foodId;

    public Integer quantity;

    //public BigDecimal price;

    public String additionalInstructions;

    //public Integer foodRating;

}