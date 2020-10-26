package main.java.com.jadevirek.patterns.behavioral.iterator;

public interface ProfileIteratorInterface {
    boolean hasNext();

    Profile getNext();

    void reset();
}
