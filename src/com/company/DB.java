package com.company;

final class DB {
    private static String[][] instance;
    public String value;

    private static String[][] createDB() {
        String[][] db = new String[100][4];
        for (int i = 0; i < 100; i++) {
            db[i][0] = String.valueOf(i);
        }
        for (int i = 0; i <= 100; i++) {
            if (i < 17) {
                db[i][1] = "Дети";
            } else if (i >= 18 & i <= 25) {
                db[i][1] = "Молодежь";
            } else if (i >= 26 & i <= 49) {
                db[i][1] = "Взрослые";
            } else if (i >= 50 & i < 100) {
                db[i][1] = "Пожилой";
            }
        }
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 8);
            switch (random) {
                case (1) -> db[i][2] = "yellow";
                case (2) -> db[i][2] = "green";
                case (3) -> db[i][2] = "black";
                case (4) -> db[i][2] = "brown";
                case (5) -> db[i][2] = "white";
                case (6) -> db[i][2] = "gray";
                case (7) -> db[i][2] = "blue";
                default -> db[i][2] = "red";
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i < 17) {
                db[i][3] = "sports";
            } else if (i >= 18 & i <= 25) {
                db[i][3] = "glamour";
            } else if (i >= 26 & i <= 49) {
                db[i][3] = "casual";
            } else if (i >= 50 & i < 99) {
                db[i][3] = "classic";
            }
        }
        return db;

    }

    public static String[][] getInstance() {
        if (instance == null) {
            instance = createDB();
        }
        return instance;
    }
    public Info getInfo(int id){
        String age = instance[id][0];
        String socialGroup = instance[id][1];
        String color = instance[id][2];
        String style = instance[id][3];
        Info info = new Info(age, socialGroup,color,style);
        return info;
    }

}
