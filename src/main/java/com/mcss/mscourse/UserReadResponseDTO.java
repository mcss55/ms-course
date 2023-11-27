package com.mcss.mscourse;

import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class UserReadResponseDTO {

    String id;

    String name;

    String email;

    String password;

    List<String> courses;

}