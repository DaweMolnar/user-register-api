package com.dmolnar.user.api.user;

import lombok.Data;

@Data
public class UserDTO {
    public String userName;
    public String password;
    public String address;

    public User toEntity() {
        User user = new User();
        user.password = password;
        user.address = address;
        user.userName = userName;
        return user;
    }
}
