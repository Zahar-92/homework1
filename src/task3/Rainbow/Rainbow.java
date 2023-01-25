package task3.Rainbow;

import java.util.Scanner;

public class Rainbow {
    public final String RED = "Красный";
    public final String ORANGE = "Оранжевый";
    public final String YELLOW = "Желтый";
    public final String GREEN = "Зеленый";
    public final String BLUE = "Голубой";
    public final String INDIGO = "Синий";
    public final String VIOLET = "Фиолетовый";

    public void colorSelection(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Дорогой пользователь, у тебя есть уникальная возможность узнать под каким номером " +
                "расположен цвет радуги!");
        System.out.print("Для этого введи цифру от 1 до 7 и ты узнаешь, какой цвет находится под твоим номером:");
        int firstColourNumber = scanner.nextInt();
        if (firstColourNumber == 1){
            System.out.println(RED);
        } else if (firstColourNumber == 2) {
            System.out.println(ORANGE);
        }
            else if (firstColourNumber == 3){
                System.out.println(YELLOW);
            }
            else if (firstColourNumber == 4){
                System.out.println(GREEN);
            }
            else if (firstColourNumber == 5){
                System.out.println(BLUE);
            }
            else if (firstColourNumber == 6){
                System.out.println(INDIGO);
            }
            else if (firstColourNumber == 7){
                System.out.println(VIOLET);
            }
            else {
                System.out.println("Такого цвета нет в радуге!");
            }
        }

    }






