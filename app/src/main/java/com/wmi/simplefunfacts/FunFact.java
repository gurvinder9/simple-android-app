package com.wmi.simplefunfacts;

import java.util.Random;

public class FunFact {

    private String[] facts = {
            "A cat's tail contains nearly 10 percent of all the bones in its body.",
            "Gecko feet have millions of tiny hairs that stick to surfaces with a special " +
                    "chemical bond and let them climb walls and hang on by just one toe.",
            "The term \"astronaut\" comes from Greek words that mean \"star\" and \"sailor.\"",
            "The calcium in our bones and the iron in our blood come from ancient explosions of giant stars.",
            "The Nile crocodile can hold its breath underwater for up to 2 hours while waiting for prey.",
            "Because the speed of Earth's rotation changes over time, a day in the age of dinosaurs was just 23 hours long.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

    public String getFacts() {
        Random rand = new Random();
        int getFactItem = rand.nextInt(facts.length);

        return facts[getFactItem];
    }
}
