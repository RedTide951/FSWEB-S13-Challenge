package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    // Getter for `id`
    public int getId() {
        return id;
    }

    // Getter for `plan`
    public Plan getPlan() {
        return plan;
    }
}
