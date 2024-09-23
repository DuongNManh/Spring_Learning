package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.shopapp.models.Product;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductImageDTO {

    @Size(min = 1, message = "Product ID is required")
    @JsonProperty("product_id")
    private Long productId;

    @Size(min = 5, max = 300, message = "Image Name must be between 5 and 300 characters")
    @JsonProperty("image_url")
    private String imageUrl;
}
