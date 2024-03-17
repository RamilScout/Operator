public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 19;
        if (age < 18) {
            System.out.println("возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("возраст человека равен " + age + ", значит он совершеннолетний");
        }

        //task 2
        int temperature = 13;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        //task 3
        int speed = 67;
        if (speed > 60) {
            System.out.println("скорость превышена, придеться заплатить штраф");
        } else {
            System.out.println("скорость не превышена, можно ездить спокойно");
        }

        //task 4
        {
            age = 19;
            if (age >= 2 && age <= 6) {
                System.out.println("возраст человека равен " + age + ", значит ему нужно ходить в садик");
            } else if (age <= 17) {
                System.out.println("возраст человека равен " + age + ", значит ему нужно учиться в школе");
            } else if (age <= 24) {
                System.out.println("возраст человека равен " + age + ", значит ему нужно учиться в университете");
            } else {
                System.out.println("возраст человека равен " + age + ", значит ему нужно ходить на работу");
            }

            //task 5
            {
                age = 13;
                if (age < 5) {
                    System.out.println("возраст ребенка равен " + age + ", значит ему кататься нельзя");
                } else if (age < 14) {
                    System.out.println("возраст ребенка равен " + age + ", значит ему можно кататься со взрослым");
                } else {
                    System.out.println("возраст ребенка равен " + age + ", значит ему можно кататься без взрослого");
                }

                //task 6
                int passengers = 74;
                if (passengers < 60) {
                    System.out.println("есть сидячие места");
                } else if (passengers < 102) {
                    System.out.println("есть стоячие места");
                } else {
                    System.out.println("мест нет");
                }

                //task 7
                int one = 1;
                int two = 2;
                int three = 3;
                if (one > two && one > three) {
                    System.out.println("one максимум");
                } else if (two > three) {
                    System.out.println("two максимум");
                } else {
                    System.out.println("three максимум");
                }
            }
        }
    }
}