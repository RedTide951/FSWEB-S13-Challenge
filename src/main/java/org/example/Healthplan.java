package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private long id;
    private String name;
    private Plan plan;

    public Healthplan(long id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    // Getter for `id`
    public long getId() {
        return id;
    }

    // Getter for `plan`
    public Plan getPlan() {
        return plan;
    }
}
