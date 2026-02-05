package com.roda.effectivejava.item01_static_factory;

/**
 * Static constructor has name and easy to use
 */
public class GoodUser {
    private final String name;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final boolean active;

    private GoodUser(String name, String firstName, String lastName, int age, boolean active) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.active = active;
    }

    public static GoodUser activeAdmin(int age) {
        return new GoodUser("ADMIN", null, null, age, true);
    }

    public static GoodUser withName(String name) {
        return new GoodUser(name, "", "", 0, false);
    }

    public static GoodUser withNameAndFirstName(String name, String firstName) {
        return new GoodUser(name, firstName, "", 0, false);
    }

    public static GoodUser fullUser(String name, String firstName, String lastName, int age) {
        return new GoodUser(name, firstName, lastName, age, false);
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
