package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;

public class SleepingState extends State {
    public SleepingState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        return new HungryState(animal, duration);
    }
}
