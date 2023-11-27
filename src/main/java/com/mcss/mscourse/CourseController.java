package com.mcss.mscourse;

import com.mcss.grpc.lib.UserReadResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    CourseUserReadService courseUserReadService;

    @GetMapping("/{id}")
    public UserReadResponseDTO readUser(@PathVariable String id) {
        return courseUserReadService.readUser(id);
    }

}
