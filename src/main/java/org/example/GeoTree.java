package org.example;

import java.util.ArrayList;

class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(Person parent, Person children) {

        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}
