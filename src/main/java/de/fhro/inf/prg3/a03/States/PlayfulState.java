package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;

public class PlayfulState extends State {

    public PlayfulState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan...getting tired!");
        return new SleepingState(animal, animal.getSleep());
    }
}
