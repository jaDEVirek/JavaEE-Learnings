package main.java.com.jadevirek.patterns.behavioral.iterator;

public interface SocialNetwork {
    ProfileIteratorInterface createFriendsIterator(String profileEmail);

    ProfileIteratorInterface createCoworkersIterator(String profileEmail);
}
