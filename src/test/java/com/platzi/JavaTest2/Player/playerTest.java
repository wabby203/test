package com.platzi.JavaTest2.Player;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class playerTest {
    Dice dice;

    @Before
    public  void septup (){

    }

    @Test
    public void the_player_lose_when_dice_numbrer_is_to_low() {
        dice = new Dice(6);
        player player = new player(dice, 4);
        assertFalse(player.play());
    }

    @Test //mockito se usa cuando dependemos de otra clase para hacer correr nuestra clase de prueba
    public void the_player_lose_when_dice_numbrer_is_to_low_with_mockito() {
        //el usar el mockito, no ayuda a simular la clase y a poner posibles resultados
        dice = Mockito.mock(Dice.class);

        //simula el dado con dice.roll y finje que el resultado es 2
        Mockito.when(dice.rol()).thenReturn(2);
        player player = new player(dice, 4);
        assertFalse(player.play());
    }

    @Test //mockito se usa cuando nuestra clase depende de otra clase para correr
    public void the_player_win_when_dice_numbrer_is_to_low_with_mockito() {
        //el usar el mockito, no ayuda a simular la clase y a poner posibles resultados
         dice = Mockito.mock(Dice.class);

        //simula el dado con dice.roll y finje que el resultado es 2
        Mockito.when(dice.rol()).thenReturn(4);
        player player = new player(dice, 4);
        assertTrue(player.play());
    }


}