package com.mcss.mscourse;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
@Table(name = "courses")
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String name;

    String description;

    String author;

    String image;

    String price;

    String category;

    String rating;
}
