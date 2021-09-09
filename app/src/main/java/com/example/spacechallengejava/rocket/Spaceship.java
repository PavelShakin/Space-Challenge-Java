package com.example.spacechallengejava.rocket;

import com.example.spacechallengejava.Item;

public interface Spaceship {
    boolean launch();
    boolean land();
    boolean canCarry(Item item);
    void carry(Item item);
}
