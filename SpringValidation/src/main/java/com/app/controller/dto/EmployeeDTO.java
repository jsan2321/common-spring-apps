package com.app.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull(message = "name can't be null")
    private String name;

    @NotNull(message = "lastName can't be null")
    // @Size(min = 3, max = 10) // size must be between 3 and 10 (characters)
    private String lastName;

    @Email // this is more used
    @NotBlank
    @NotNull(message = "email can't be null")
    //@Pattern(regexp = "^[a-zA-Z0-9. _%+-]+@[a-zA-Z0-9. -]+\\\\\\\\. [a-zA-Z]{2,}$", message = "email is not valid") // regular expression to validate email ... USERNAME@DOMAIN.COM
    private String email;

    @NotNull(message = "phone can't be null")
    @CreditCardNumber
    private Long phone;

    @NotNull(message = "age can't be null")
    //@Min(18) // must be greater than or equal to 18
    //@Max(25) // must be less than or equal to 25
    private byte age;

    @Digits(integer = 1, fraction = 2, message = "The number received is invalid")
    @NotNull(message = "height can't be null")
    private double height;

    @NotNull(message = "married can't be null")
    //@AssertTrue // must be true
    //@AssertFalse // must be false
    private boolean married;

    @Past(message = "The date must be before the current date")
    //@Future // must be a future date
    private LocalDate dateOfBirth;

    @Valid // for objects
    private DepartmentDTO departmentDTO;

//    @NotEmpty
//    List<Integer> numbers;
}
