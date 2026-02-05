package com.roda.effectivejava.item01_static_factory;

public abstract class User {
    protected final String name;
    protected final int age;
    protected final boolean active;

    protected User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public static User create(String role) {
        if ("ADMIN".equals(role)) {
            return new AdminUser(18);
        }
        throw  new IllegalArgumentException("Unknown role: " + role);
    }
}
