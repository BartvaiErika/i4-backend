package com.example.twitterboard.logic;

import com.example.twitterboard.persistance.Tweet;
import com.example.twitterboard.persistance.TweetRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

import java.util.List;

@SpringBootTest(webEnvironment = NONE)
public class TwitterTest {

    @Autowired
    Twitter twitter;

    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    Tweet tweet;

    @Autowired
    List<Tweet> tweets;

    @Before
    public void setUp() throws Exception {
        tweetRepository.deleteAll();
        tweetRepository.saveAll(tweets);
    }

    @Test
    public void findAll() {
        List<Tweet> actual = twitter.findAll();
        assertFalse(actual.isEmpty());
    }

    @Test
    public void findAllAndOrderByTimestampDesc(String user) {
        List<Tweet> actual = twitter.findAllAndOrderByTimestampDesc(user);
        assertFalse(actual.isEmpty());
    }

    @Test
    public void findAllByUser(String user) {
        List<Tweet> actual = twitter.findAllAndOrderByTimestampDesc();
        assertNotNull(actual);
        assertTrue(actual.get(0).getUser().equals(user));
    }

    @Test
    public void updateByLikes(String id, int likes) {
        Tweet actual = twitter.updateByLikes(id, likes);
        Assertions.assertThat(actual.getLikes());
    }

    @Test
    public void updateByComment(String id, String comment) {
        Tweet actual = twitter.updateByComment(id,comment);
        assertFalse(actual.getComments().isEmpty());
    }
}