package com.example.project02.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginDTO {
    private String email;
    private String password;

}
