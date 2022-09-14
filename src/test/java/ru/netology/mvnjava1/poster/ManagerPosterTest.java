package ru.netology.mvnjava1.poster;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerPosterTest {


    @Test
    public void testAll() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
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
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

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

    @Test
    public void testlimited() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";
        String movie8 = "movie8";
        String movie9 = "movie9";
        String movie10 = "movie10";
        String movie11 = "movie11";

        ManagerPoster managerPoster = new ManagerPoster(10);

        managerPoster.add(movie1);
        managerPoster.add(movie2);
        managerPoster.add(movie3);
        managerPoster.add(movie4);
        managerPoster.add(movie5);
        managerPoster.add(movie6);
        managerPoster.add(movie7);
        managerPoster.add(movie8);
        managerPoster.add(movie9);
        managerPoster.add(movie10);
        managerPoster.add(movie11);


        String[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,


        };
        String[] actual = managerPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast1() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";
        String movie8 = "movie8";
        String movie9 = "movie9";
        String movie10 = "movie10";


        ManagerPoster managerPoster = new ManagerPoster(9);

        managerPoster.add(movie1);
        managerPoster.add(movie2);
        managerPoster.add(movie3);
        managerPoster.add(movie4);
        managerPoster.add(movie5);
        managerPoster.add(movie6);
        managerPoster.add(movie7);
        managerPoster.add(movie8);
        managerPoster.add(movie9);
        managerPoster.add(movie10);


        String[] expected = {

                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,

        };
        String[] actual = managerPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLimited() {
        ManagerPoster managerPoster = new ManagerPoster(10);

        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";
        String movie8 = "movie8";
        String movie9 = "movie9";
        String movie10 = "movie10";

        managerPoster.add(movie1);
        managerPoster.add(movie2);
        managerPoster.add(movie3);
        managerPoster.add(movie4);
        managerPoster.add(movie5);
        managerPoster.add(movie6);
        managerPoster.add(movie7);
        managerPoster.add(movie8);
        managerPoster.add(movie9);
        managerPoster.add(movie10);


        String[] expected = {

                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
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



