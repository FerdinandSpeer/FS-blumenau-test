package de.fspeer.backend.blumenau.service;

public class IdService {
    public static String generateId() {
        return java.util.UUID.randomUUID().toString();
    }
}
