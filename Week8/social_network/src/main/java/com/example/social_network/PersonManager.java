package com.example.social_network;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonManager {

    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void save(String name) {
        Person person = new Person();
        person.setName(name);
        personRepository.save(person);
    }

    public List<Person> findAllWithFriends() {
        List<Person> peopleWithFriends = personRepository.findAllPersonByFriendNotNull();
        List<Person> peopleWithoutFriens = personRepository.findAllPersonByFriendNull();
        if (peopleWithFriends.size()>0) {
            return personRepository.saveAll(peopleWithFriends);
        }
        return null;
    }

    public List<Person> getPeopleWithFriends() {
        return null;
    }

    public List<Person> findAllWithNoFriend() {
        List <Person> peopleWithFriendsEmpty = personRepository.findAllPersonByFriendNull();
        List <Person> peopleWithoutFriends = Optional.of(peopleWithFriendsEmpty).orElse(null);
        return peopleWithoutFriends;
    }

    public void makeFriend(Long id1, Long id2) {
        Person person1 = getPerson(id1);
        Person person2 = getPerson(id2);

        List <Person> friendsOfPerson1 = getFriends(person1);
        List <Person> friendsOfPerson2 = getFriends(person2);

        friendsOfPerson1.add(person2);
        personRepository.save(person1);

        friendsOfPerson2.add(person1);
        personRepository.save(person2);
    }

    public void leaveFriend(Long id1, Long id2) {
        Person person1 = getPerson(id1);
        Person person2 = getPerson(id2);

        List <Person> friendsOfPerson1 = getFriends(person1);
        List <Person> friendsOfPerson2 = getFriends(person2);

        friendsOfPerson1.remove(person2);
        friendsOfPerson2.remove(person1);

        personRepository.save(person1);
        personRepository.save(person2);
    }


    List<Person> getFriends(Person person) {
        return getFriends(person);
    }

    private Person getPerson(Long id) {
        return Optional.of(personRepository.getOne(id)).orElse(null);
    }
}
