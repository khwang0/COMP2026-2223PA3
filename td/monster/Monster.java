package td.monster;

import td.Block;
import java.util.List;
import td.tower.Tower;
/**
 * Monster class.
 * 
 * On each turn it moves to the right by one cell. If it steps on 
 * a tower (i.e., share the same coordinate as the tower), the tower
 * will be destroyed.
 * 
 * A monster reaches home will end the game. 
 * 
 * If a monster has health point 0 or negative, it cannot move anymore
 * and shall be removed from the game.
 * 
 * A monster shall return the last digit of its health as its symbol.
 * For example, if a monster has a health 10, it should return the character '0'
 * If a monster has a health of 31, it should return the character '1'
 * 
 * 
 * There are some methods to be included in this class. Yet, you need to 
 * deduce what methods are needed from other java files.
 * 
 * 
 */
public class Monster extends Block {
    //TODO
}
