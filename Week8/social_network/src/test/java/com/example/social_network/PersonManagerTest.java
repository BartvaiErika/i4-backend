package com.example.social_network;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
public class PersonManagerTest {

    @Autowired
    PersonManager personManager;

    @Autowired
    Person personWithFriend;

    @Autowired
    Person personWithoutFriend;

    @Autowired
    PersonRepository personRepository;

    @BeforeEach
    public void before() throws Exception {
        personRepository.save(personWithFriend);
        personRepository.save(personWithoutFriend);
    }

    @AfterEach
    public void after() throws Exception  {
        personRepository.deleteAll();
    }

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
    }

    @Test
    public void findAllWithFriends() {
    }

    @Test
    public void getPeopleWithFriends() {
    }

    @Test
    public void findAllWithNoFriend() {
    }

    @Test
    public void makeFriend() {
    }

    @Test
    public void leaveFriend() {
    }

    @Test
    public void getFriends() {
    }
}