package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDetailDTO {

    @Min(value = 1, message = "User id must be greater than 0")
    @JsonProperty("order_id")
    private Long orderId;

    @Min(value = 1, message = "Product id must be greater than 0")
    @JsonProperty("product_id")
    private String productId;

    @Min(value = 0, message = "Price must be greater than 0")
    private Float price;

    @Min(value = 1, message = "Quantity must be greater than 0")
    @JsonProperty("number_of_products")
    private int numberOfProducts;

    @Min(value = 0, message = "Total money must be >= 0")
    @JsonProperty("total_money")
    private float totalMoney;

    private String color;

}
