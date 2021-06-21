package ru.netology.manager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    PosterManager manager = new PosterManager();

    MovieItem first = new MovieItem(1, "first", "ved1", "detective");
    MovieItem second = new MovieItem(2, "second", "ruby2", "horror");
    MovieItem tri = new MovieItem(3, "third", "ved3", "drama");
    private MovieItem three;

    @Test
    void addAtEmpty() {
        manager.add(first);

        assertArrayEquals(new MovieItem[]{first}, manager.getAll());
//
    }

    @Test
    void addTwoElements() {
        manager.add(first);
        manager.add(second);

        assertArrayEquals(new MovieItem[]{second, first}, manager.getAll());
    }

    @Test
    void addThreeElements() {
        manager.add(first);
        manager.add(second);
        manager.add(three);

        assertArrayEquals(new MovieItem[]{three, second, first}, manager.getAll());
    }

    @Test
    void getAllViaConstructorUnder() {
        PosterManager manager2 = new PosterManager(1);

        manager2.add(first);
        manager2.add(second);
        manager2.add(three); 

        assertArrayEquals(new MovieItem[]{three}, manager2.getAll());
    }

    @Test
    void getAllViaConstructorAbove() {
        PosterManager manager2 = new PosterManager(5);

        manager2.add(first);
        manager2.add(second);
        manager2.add(three);

        assertArrayEquals(new MovieItem[]{three, second, first}, manager2.getAll());
    }
}