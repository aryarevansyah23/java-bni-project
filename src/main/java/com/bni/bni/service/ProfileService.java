package com.bni.bni.service;

import com.bni.bni.entity.Profiles;
import com.bni.bni.repository.ProfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfilesRepository repository;

    public Profiles createProfile(Profiles profile) {
        profile.setCreatedAt(OffsetDateTime.now());
        profile.setUpdatedAt(OffsetDateTime.now());
        return repository.save(profile);
    }

    public Optional<Profiles> getProfileById(Long id) {
        return repository.findById(id);
    }
}
