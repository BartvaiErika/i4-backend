package com.example.social_network;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class PersonEndpointTest {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    Person person;

    @Autowired
    List<Person> persons;

    @BeforeEach
    public void setUp() throws Exception {
        personRepository.deleteAll();
        personRepository.saveAll(persons);
    }

    public void getAll() {
    }

    @Test
    public void getAllAtLeastOneFriend() {
    }

    @Test
    public void getAllWithNoFriends() {
    }

    @Test
    public void save() {
    }

    @Test
    public void hasFriend() {
    }

    @Test
    public void noFriend() {
    }
}