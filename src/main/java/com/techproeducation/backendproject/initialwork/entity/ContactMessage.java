package com.techproeducation.backendproject.initialwork.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;


@Entity
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class ContactMessage {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NotNull(message = "Name does not be null.!")
    private String name;

    @Email(message = "Email does not be null.!")
    @NotNull(message = "Please prove valid email.!")
    private String email;

    @NotNull(message = "Subject does not be null.!")
    private String subject;

    @NotNull(message = "Message does not be null.!")
    private String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd HH:mm", timezone = "US")
    @Setter(AccessLevel.NONE)
    private LocalDateTime createDate =LocalDateTime.now();

}
