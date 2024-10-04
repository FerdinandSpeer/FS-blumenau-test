package de.fspeer.backend.blumenau.models;

import java.util.Date;

public record GuestDTO(
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
    public Guest fromDTO(String id) {
        return new Guest(id,
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
