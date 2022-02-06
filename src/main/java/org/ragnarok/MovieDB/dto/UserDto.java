package org.ragnarok.MovieDB.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ragnarok.MovieDB.model.UserRole;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String username;
    private String password;
    private String emailId;
    private UserRole role;
}
