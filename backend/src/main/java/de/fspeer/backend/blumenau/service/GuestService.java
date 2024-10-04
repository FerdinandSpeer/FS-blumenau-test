package de.fspeer.backend.blumenau.service;

import de.fspeer.backend.blumenau.Repository.GuestRepository;
import de.fspeer.backend.blumenau.models.Guest;
import de.fspeer.backend.blumenau.models.GuestDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> findAll() {
        return guestRepository.findAll();
    }

    public Guest findById(String id) {
        return guestRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Guest saveGuest(GuestDTO guestDTO) {
        return guestRepository.save(guestDTO.fromDTO(IdService.generateId()));
    }

    public Guest updateGuest(GuestDTO guestDTO, String id) {
        findById(id);
        return guestRepository.save(guestDTO.fromDTO(id));
    }

    public void deleteById(String id) {
        guestRepository.deleteById(id);
    }
}
