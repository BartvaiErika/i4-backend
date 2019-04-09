package com.example.social_network;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonEndpoint {

    private final PersonManager personManager;

    @GetMapping
    public List<Person> getAll() {
        return personManager.findAll();
    }

    @GetMapping
    public List<Person> getAllAtLeastOneFriend() {
        return personManager.findAllWithFriends();
    }

    @GetMapping
    public List<Person> getAllWithNoFriends() {
        return personManager.findAllWithNoFriend();
    }

    @PostMapping
    public void save(@RequestBody String name) {
        personManager.save(name);
    }

    @PutMapping("/persons/{id1}/friend/{id2}")
    public void hasFriend(@PathVariable Long id1, @PathVariable Long id2) {
        personManager.makeFriend(id1,id2);
    }

    @PutMapping("/persons/{id1}/unfriend/{id2}")
    public void noFriend(@PathVariable Long id1, @PathVariable Long id2) {
        personManager.leaveFriend(id1,id2);
    }
}
