package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    protected static final Logger logger = LogManager.getLogger();

    protected final Animal animal;
    protected final int duration;
    protected int time;

    public State(Animal animal, int duration) {
        this.animal = animal;
        this.duration = duration;
        time = 0;
    }

    public final State tick() {
        if(duration < 0)
            return this;

        time++;

        if(time == duration) {
            return successor();
        } else {
            logger.info(getClass().getName());
            return this;
        }
    }

    public abstract State successor();
}
