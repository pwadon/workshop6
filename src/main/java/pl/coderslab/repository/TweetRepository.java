package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.Tweet;
import pl.coderslab.entity.User;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    List<Tweet> getAllByUserId(Long id);
    List<Tweet> getAllByUser(User user);
    List<Tweet> getFirstByUserOrderByCreated(User user);
}
