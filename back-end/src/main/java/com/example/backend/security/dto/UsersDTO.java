package com.example.backend.security.dto;

import com.example.backend.security.config.custom.CustomUserDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class UsersDTO {
    private Long id;
    private String username;
    private String email;
    private String role;

    public UsersDTO toUserDTO(CustomUserDetails customUserDetails){
        this.setId(customUserDetails.getId());
        this.setUsername(customUserDetails.getUsername());
        this.setEmail(customUserDetails.getEmail());
        this.setRole(customUserDetails.getRole());
        return  UsersDTO.this;
    }
}

