package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

//Create a new file Titanic.java, and have it implement the Movie interface
    @Component
    public class TitanicMovie implements Movie {

        //Implement getTitle(), getMaturityRating(), getGenre() with information for the Titanic movie.
        public String getTitle() {
            return "Titanic";
        }

        public String getMaturityRating() {
            return "PG-13";
        }

        public String getGenre() {
            return "Romance";
        }


}
