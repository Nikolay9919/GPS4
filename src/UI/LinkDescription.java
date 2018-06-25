/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

public class LinkDescription {

    public String nameA;
    public String nameB;
    public double length;
    public Direction direction;

    LinkDescription(String nameA, String nameB, Direction direction, float length) {
        this.nameA = nameA;
        this.nameB = nameB;
        this.direction = direction;
        this.length = length;
    }

    public static String getDirectionName(Direction direction) {
        if (direction.equals(Direction.RIGHT)) {
            return ">";
        }
        if (direction.equals(Direction.LEFT)) {
            return "<";
        }
        if (direction.equals(Direction.BOTH)) {
            return "<>";
        }
        return "";
    }

    public enum Direction {
        RIGHT, LEFT, BOTH
    }
}
