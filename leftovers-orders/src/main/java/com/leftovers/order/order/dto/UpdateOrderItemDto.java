package com.leftovers.order.order.dto;

import lombok.Data;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class UpdateOrderItemDto {

    public Integer foodId = 0;

    public Integer quantity = -1;

    public String additionalInstructions = "";

    public Integer foodRating = 0;

}