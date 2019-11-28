package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;

public class StartControllerTest {

     @Test
    public void givenStartControllerWhenStartGameThenChangeState() {
        State state = new State();
        StartController startController = new StartController(new Game(), state);
        assertEquals(StateValue.INITIAL, state.getValueState());
        startController.start();
        assertEquals(StateValue.IN_GAME, state.getValueState());
    }

}