package ru.netology.mvnjava1.poster;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerPosterTest {
    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";


    @Test
    public void testAll() {

        ManagerPoster managerPoster = new ManagerPoster();
        managerPoster.add(movie1);
        managerPoster.add(movie2);
        managerPoster.add(movie3);
        managerPoster.add(movie4);
        managerPoster.add(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = managerPoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast() {

        ManagerPoster managerPoster = new ManagerPoster();
        managerPoster.add(movie1);
        managerPoster.add(movie2);
        managerPoster.add(movie3);
        managerPoster.add(movie4);
        managerPoster.add(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = managerPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

