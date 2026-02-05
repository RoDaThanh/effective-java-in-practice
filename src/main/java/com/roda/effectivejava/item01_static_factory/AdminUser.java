package com.roda.effectivejava.item01_static_factory;

public class AdminUser extends User{

    public AdminUser(int age) {
        super("ADMIN", age, true);
    }
}
