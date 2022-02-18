package com.company;

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        int data, year, month;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the day of birth");
//        data = scan.nextInt();
//        System.out.println("Enter the month of birth");
//        month = scan.nextInt();
//        System.out.println("Enter the year of birth");
//        year = scan.nextInt();
//        Human human1 = new Human(data, month, year);

        DB db = new DB();
        DB.getInstance();
        Human human2 = new Human(1, 1, 2000);
        System.out.println(human2.getAge(human2));
        System.out.println(db.getInfo(human2.getAge(human2)));
    }
}

class Human {
    int date;
    int month;
    int year;

    public Human(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getAge(Human human) {
        Date now = new Date();
        Date today = new Date(now.getYear(), now.getMonth(), now.getDay());
        Date bob = new Date(human.year, human.month, human.date);
        Date bobnow = new Date(today.getYear(), today.getMonth(), today.getDay());
        int age;
        age = today.getYear() + 1900 - bob.getYear();
        if (bobnow.compareTo(today) < 0) age -= 1;
        return age;
    }

}
