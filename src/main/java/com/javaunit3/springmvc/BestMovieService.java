package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;


    @Configuration
    public class BestMovieService {
        @Autowired
        private Movie movie;

        public Movie getBestMovie() {
            return movie;
        }

        @Autowired
        public void setMovie(Movie movie) {
            this.movie = movie;
        }

        @Autowired
        public void BestMovieService(Movie movie) {
            this.movie = movie;
        }

        // In the BestMovieService class, use the Qualifier annotation and the default bean id for the titanic movie to inject the titanic movie object instead of the batman one.
        @Autowired
        public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
            this.movie = movie;
        }
}
