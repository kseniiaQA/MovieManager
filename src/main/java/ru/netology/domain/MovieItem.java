package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MovieItem {
    private int id;
    private String imageUrl;
    private String name;
    private String genre;
 private boolean isTomorrow;

    public MovieItem(int i, String first, String ved1, String detective) {
    }
}