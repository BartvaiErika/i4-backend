package com.example.social_network;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List <Person> findAllPersonByFriendNull();
    List <Person> findAllPersonByFriendNotNull();
}
