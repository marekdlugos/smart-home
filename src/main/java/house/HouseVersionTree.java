package house;

import house.House;

/**
 * Provides fully persistent data structure so that we can go back to a specific version
 * of house and modify it.
 * Tree representation enables creating new branch from any node.
 */

public class HouseVersionTree {
    class Node<House> {
    }

    Node<House> root;
}

