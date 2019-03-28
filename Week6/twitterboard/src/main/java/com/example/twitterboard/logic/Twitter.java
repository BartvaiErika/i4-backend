package com.example.twitterboard.logic;

import com.example.twitterboard.persistance.Tweet;
import com.example.twitterboard.persistance.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Twitter {
    private final TweetRepository tweetRepository;

    public List<Tweet> findAll() {
        return tweetRepository.findAll();
    }

    public void storeTweets(Tweet tweet) {
        tweetRepository.insert(tweet);
        tweetRepository.save(tweet);
    }

    public List<Tweet> findAllAndOrderByTimestampDesc() {
        return tweetRepository.findAllByUserOrderByTimestampDesc();
    }

    public List<Tweet> findAllByUser(String user) {
        return tweetRepository.findAllByUserOrderByTimestampDesc();
    }

    public Tweet updateLikes(String id) {
        Tweet tweet = tweetRepository.findById(id).orElse(null);
        int likes = tweet.getLikes();
        tweet.setLikes(likes+1);
        tweetRepository.save(tweet);
        return tweet;
    }

    public Tweet updateByComment(String id, String comment) {
            return tweetRepository.updateByComment();
    }

    public Tweet findByid(String id) {
        Tweet tweet = tweetRepository.findOne(tweet.getId()).orElse(null);
        return tweet;
    }
}

