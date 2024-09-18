package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@Getter // tao getter cho tat ca cac field
@Setter // tao setter cho tat ca cac field
@AllArgsConstructor // tao constructor voi tat ca cac field la tham so
@NoArgsConstructor // tao constructor rong
public class ProductDTO {

    @NotBlank(message = "Product's name is required")
    @Size(min = 3, max = 100, message = "Product's name must be between 5 and 100 characters")
    private String name;
    
    private String description;

    @Min(value = 0, message = "Product's price must be greater than 0")
    @Max(value = 1000000, message = "Product's price must be less than 1000000")
    private float price;

    @NotNull(message = "Product's category_id is required")
    @JsonProperty("category_id")
    private int categoryId;

    private String thumbnail;

    private List<MultipartFile> files;


}
