package td.tower;

import td.Block;
import td.Game;
import td.monster.Monster;

import java.util.List;

/**
 * Catapult
 * 
 * A catapult works in the following way. It will target on
 * one monster among all monsters that are in range. When there
 * are more than one monsters in range, pick ANY monster with 
 * highest remaining health point.
 * 
 * Then, it hits the target monster and other monsters located in
 * its 8 neighthor adjacent cells. For example,
 * ----------------------
 * | a | b | c | e |
 * | d | f | g | h |
 * | i | j | k | l |  ...
 * | m | n | o | p |
 * ----------------------
 * * If g is the target monster, monsters <b, c, e, f, g, h, j, k, l>
 * will receive damage.
 * * If m is the target monster, monsters <i, j, m, n>
 * will receive damage.
 * 
 * Note: In the first example, even if monster b is out of the range 
 * of the Tower, as long as Tower can hit g, b will also receive damage.
 * 
 * Propoerty of Catapult:
 * Symbol : 'C'
 * Inital power: 4
 * Range : 6
 * cost : 7
 * upgrade power: 2 
 * upgrade cost: 3
 * 
 */
public class CatapultTower extends Tower {
    //TODO
}
