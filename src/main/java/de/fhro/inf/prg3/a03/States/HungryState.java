package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;

public class HungryState extends State {

    public HungryState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        return new DeadState(animal, -1);
    }

    public State feed(){
        logger.info("Om nom nom...");
        return new DigestingState(animal, animal.getDigest(), duration - time);
    }
}
