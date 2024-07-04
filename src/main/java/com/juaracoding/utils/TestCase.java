package com.juaracoding.utils;

public enum TestCase {
    A1("User Login Valid", "Login User", "Astrin"),

    B1("User Add to cart", "Add Cart", "Astrin"),

    C1("Logout User", "Login User", "Astrin");

    private String testCaseName, module, author;

    TestCase(String value, String module, String author){
        testCaseName = value;
        this.module = module;
        this.author = author;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public String getModuleName(){
        return module;
    }

    public String getAuthorName(){
        return author;
    }
}
