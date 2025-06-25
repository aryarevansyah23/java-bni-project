package com.bni.bni.controller;

import com.bni.bni.entity.Profiles;
import com.bni.bni.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @PostMapping
    public ResponseEntity<Profiles> createProfile(@RequestBody Profiles profile) {
        return ResponseEntity.ok(service.createProfile(profile));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profiles> getProfile(@PathVariable Long id) {
        return service.getProfileById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
}
