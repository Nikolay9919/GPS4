package Algorithm;

import java.util.ArrayList;

public class Node {

    private String name;
    private double weight;
    private int x;
    private int y;
    public boolean isTested;
    public double distance;

    public ArrayList<Link> paths = new ArrayList<>();

    public Node(String name, int x, int y, float weight) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.weight = weight;
    }

    public void insertPath(Link path) {
        paths.add(path);
    }

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Node(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
