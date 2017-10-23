package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.states.State;

public class DeadState extends State {
    public DeadState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        throw new IllegalStateException("This is no buddhistic animal - reincarnation is no option!");
    }
}
