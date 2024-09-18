package com.project.shopapp.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Getter // tao getter cho tat ca cac field
@Setter // tao setter cho tat ca cac field
@AllArgsConstructor // tao constructor voi tat ca cac field la tham so
@NoArgsConstructor // tao constructor rong
public class CategoryDTO {
    @NotEmpty(message = "Category's name is required")
    private String name;
}
