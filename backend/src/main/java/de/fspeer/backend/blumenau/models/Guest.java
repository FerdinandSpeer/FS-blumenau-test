package de.fspeer.backend.blumenau.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public record Guest(
        String id,
        String firstName,
        String lastName,
        Date birthDate,
        String nationality,
        String street,
        String city,
        int zip,
        String email,
        int phone,
        String travelDocumentNumber
) {
    public GuestDTO toDTO() {
        return new GuestDTO(
                this.firstName(),
                this.lastName(),
                this.birthDate(),
                this.nationality(),
                this.street(),
                this.city(),
                this.zip(),
                this.email(),
                this.phone(),
                this.travelDocumentNumber()
        );
    }
}
