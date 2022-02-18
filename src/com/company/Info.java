package com.company;

public class Info {
    private String age;
    private String socialGroup;
    private String color;
    private String style;

    public Info(String age,String socialGroup, String color, String style) {
        this.age = age;
        this.socialGroup = socialGroup;
        this.color = color;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Info{" +
                "age='" + age + '\'' +
                ", socialGroup='" + socialGroup + '\'' +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
