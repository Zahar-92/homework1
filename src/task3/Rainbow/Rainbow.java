package task3.Rainbow;

import java.util.Scanner;

public class Rainbow {
    public final String RED = "Красн";
    public final String ORANGE = "Оранжев";
    public final String YELLOW = "Желт";
    public final String GREEN = "Зелен";
    public final String BLUE = "Голуб";
    public final String INDIGO = "Син";
    public final String VIOLET = "Фиолетов";

    public void colorSelection(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Дорогой пользователь, у тебя есть уникальная возможность узнать под каким номером " +
                "расположен цвет радуги!");
        System.out.println("Для этого введи цифру от 1 до 7 и ты узнаешь, какой цвет находится под твоим номером, " +
                "\nтакже ты можешь смешать краски, для этого объедени цифры между собой (пример: 25, 47, и т.п.):");
        int firstColourNumber = scanner.nextInt();
        if (firstColourNumber == 1){
            System.out.println(RED + "ый");
        } else if (firstColourNumber == 2) {
            System.out.println(ORANGE + "ый");
        }
            else if (firstColourNumber == 3){
                System.out.println(YELLOW + "ый");
            }
            else if (firstColourNumber == 4){
                System.out.println(GREEN + "ый");
            }
            else if (firstColourNumber == 5){
                System.out.println(BLUE + "ой");
            }
            else if (firstColourNumber == 6){
                System.out.println(INDIGO + "ий");
            }
            else if (firstColourNumber == 7){
                System.out.println(VIOLET + "ый");
            }


            switch (firstColourNumber){
                case 12, 21:
                    System.out.println(RED + "о-" +ORANGE + "ый");
                    break;
                case 13, 31:
                    System.out.println(RED + "о-" +YELLOW + "ый");
                    break;
                case 14, 41:
                    System.out.println(RED + "о-" +GREEN + "ый");
                    break;
                case 15, 51:
                    System.out.println(RED + "о-" +BLUE + "ой");
                    break;
                case 16, 61:
                    System.out.println(RED + "о-" +INDIGO + "ий");
                    break;
                case 17, 71:
                    System.out.println(RED + "о-" +VIOLET + "ый");
                    break;
                case 23, 32:
                    System.out.println(ORANGE + "о-" +YELLOW + "ый");
                    break;
                case 24, 42:
                    System.out.println(ORANGE + "о-" +GREEN + "ый");
                    break;
                case 25, 52:
                    System.out.println(ORANGE + "о-" +BLUE + "ой");
                    break;
                case 26, 62:
                    System.out.println(ORANGE + "о-" +INDIGO + "ий");
                    break;
                case 27, 72:
                    System.out.println(ORANGE + "о-" +VIOLET + "ый");
                    break;
                case 34, 43:
                    System.out.println(YELLOW + "о-" +GREEN + "ый");
                    break;
                case 35, 53:
                    System.out.println(YELLOW + "о-" +BLUE + "ой");
                    break;
                case 36, 63:
                    System.out.println(YELLOW + "о-" +INDIGO + "ий");
                    break;
                case 37, 73:
                    System.out.println(YELLOW + "о-" +VIOLET + "ый");
                    break;
                case 45, 54:
                    System.out.println(GREEN + "о-" +BLUE + "ой");
                    break;
                case 46, 64:
                    System.out.println(GREEN + "о-" +INDIGO + "ий");
                    break;
                case 47, 74:
                    System.out.println(GREEN + "о-" +VIOLET + "ый");
                    break;
                case 56, 65:
                    System.out.println(INDIGO + "е-" + BLUE + "ой");
                    break;
                case 57, 75:
                    System.out.println(VIOLET + "о-" +BLUE + "ой");
                    break;
                case 67, 76:
                    System.out.println(INDIGO + "е-" +VIOLET + "ый");
                    break;
            }
        }

    }






