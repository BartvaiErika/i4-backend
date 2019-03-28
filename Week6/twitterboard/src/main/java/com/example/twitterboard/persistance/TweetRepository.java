package com.example.twitterboard.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TweetRepository extends MongoRepository<Tweet, String> {

//    Can store new tweets
//    Can display all existing tweets starting from latest
//    Can display existing tweets from a particular user starting from latest
//    Can like an existing tweet
//    Can comment on an existing tweet
       List <Tweet> storeTweets();
       List <Tweet> findAllOrOrderByTimestamp();
       List <Tweet> findAllByUserOrderByTimestampDesc();
       Tweet updateByLikes();
       Tweet updateByComment();

}

