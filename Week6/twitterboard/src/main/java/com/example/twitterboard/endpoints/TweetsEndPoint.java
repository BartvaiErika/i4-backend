package com.example.twitterboard.endpoints;

import com.example.twitterboard.logic.Twitter;
import com.example.twitterboard.persistance.TweetRepository;
import com.example.twitterboard.persistance.Tweet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tweets")
public class TweetsEndPoint {

    private final Twitter twitter;

//    GET to /tweets -> returns all Tweets ordered by timestamp descending.
//    GET to /tweets/user/{user} -> returns all Tweets of user ordered by timestamp descending
//    POST a Tweet to /tweets -> saves new Tweet.
//    The app sets the timestamp of the Tweet right before saving it.
//    PUT to /tweets/{id}/likes -> adds one like to the Tweet with id.
//    PUT to /tweets/{id}/comments -> adds to the Tweet with id one comment received via request body.

    @GetMapping
    public List<Tweet> getAll() {
        return twitter.findAll();
    }

    @GetMapping
    public List<Tweet> getAllOrderByTimestamp() {
        return twitter.findAllAndOrderByTimestampDesc();
    }

    @GetMapping("/tweets/{user}")
    public List<Tweet> tweetsOfUser (@RequestBody String user) {
        return twitter.findAllByUser(user);
    }

    @PostMapping
    public List<Tweet> saveNewTweet (Tweet tweet)  {
        tweet.setTimestamp(LocalDateTime.now());
        return twitter.storeTweets();
    }

    @PutMapping("/id/{like}")
    public Tweet updateLike(@RequestBody String id, int like) {
        Tweet tweet = twitter.getId(id).addLike(like);
        return twitter.storeTweets(tweet);
    }


    @PutMapping("/id/{comment}")
    public Tweet updateComment(@RequestBody String id, String comment) {
        Tweet tweet = twitter.findByid(id).get();
        List<String> comments = tweet.getComments();
        comments.add(comment);
        tweet.setComments(comments);
        twitter.storeTweets(tweet);
        return tweet;
    }

}


