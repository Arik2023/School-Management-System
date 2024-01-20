package com.techproeducation.backendproject.initialwork.dto;


import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessageDTO {

    @NotNull(message = "Name does not be null.!")
    private String name;

    @Email(message = "Email does not be null.!")
    @NotNull(message = "Please prove valid email.!")
    private String email;

    @NotNull(message = "Subject does not be null.!")
    private String subject;

    @NotNull(message = "Message does not be null.!")
    private String message;







    public ContactMessageDTO(ContactMessage contactMessage) {
        this.name = contactMessage.getName();
        this.email = contactMessage.getEmail();
        this.subject = contactMessage.getSubject();
        this.message = contactMessage.getMessage();


    }
}
