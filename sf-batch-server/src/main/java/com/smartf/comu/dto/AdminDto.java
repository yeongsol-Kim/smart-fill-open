package com.smartf.comu.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminDto {

    @NotEmpty
    @Size(min = 4, max = 20)
    private String username;

    @NotEmpty
    @Size(min = 8, max = 16)
    private String password;

    @NotEmpty
    @Size(min = 8, max = 16)
    private String passwordConfirm;

    @NotEmpty
    @Size(max = 10)
    private Long dependentId;

}
