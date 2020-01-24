package com.dushdesh.chucknorrisjokesapp.services;

import org.springframework.stereotype.Service;

@Service
public class JokeService {

    public String getChuckNorrisJoke() {
        return guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote();

    }
}
