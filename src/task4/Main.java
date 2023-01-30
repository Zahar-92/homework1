package task4;

import java.util.Random;

public class Main {
   public static void main(String[] args) {
      System.out.println("\nЦикл№1 WHILE:");
   Runner runner = new Runner();
   runner.catHome();

            //Во втором цикле for создаем 10 котиков, вводим их возраст и имя через сеттер, и   выводим в консоль через геттер.
      System.out.println("\nЦикл№2 FOR:");
      runner.setName("Котяра");
      runner.setAge(1);
      for (int j = 0; j<10; j++) {
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Рыжик");
         runner.setAge(12);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Обжера");
         runner.setAge(7);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Нолик");
         runner.setAge(2);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Кубик");
         runner.setAge(6);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Белик");
         runner.setAge(5);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Бася");
         runner.setAge(6);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Фунтик");
         runner.setAge(3);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Муся");
         runner.setAge(6);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Котофей");
         runner.setAge(11);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());

         runner.setName("Умник");
         runner.setAge(4);
         System.out.println("Имя- " + runner.getName() + " Возраст- " + runner.getAge());
         break;
      }

      //Третий цикл do while создает 10 котиков вводит имя и возраст через конструктор.Выводим в консоль.
      System.out.println("\nЦикл №3 DO While:");
      Animal animal = new Animal();
      animal.nameCat = "One";
      animal.ageCat = 4;

      Animal animal1 = new Animal("Two", 9);
      Animal animal2 = new Animal("Three", 1);
      Animal animal3 = new Animal("Three", 2);
      Animal animal4 = new Animal("Three", 3);
      Animal animal5 = new Animal("Four", 4);
      Animal animal6 = new Animal("Six", 5);
      Animal animal7 = new Animal("Seven", 6);
      Animal animal8 = new Animal("Eight", 7);
      Animal animal9 = new Animal("Nine", 8);
      Animal animal10 = new Animal("Ten", 9);
      int f = 1;
      do {

         System.out.println("Имя- " + animal.nameCat + " ,Возраст- " + animal.ageCat);
         f++;
         System.out.println("Имя- " + animal1.nameCat + " ,Возраст- " + animal1.ageCat);
         f++;
         System.out.println("Имя- " + animal2.nameCat + " ,Возраст- " + animal2.ageCat);
         f++;
         System.out.println("Имя- " + animal3.nameCat + " ,Возраст- " + animal3.ageCat);
         f++;
         System.out.println("Имя- " + animal4.nameCat + " ,Возраст- " + animal4.ageCat);
         f++;
         System.out.println("Имя- " + animal5.nameCat + " ,Возраст- " + animal5.ageCat);
         f++;
         System.out.println("Имя- " + animal6.nameCat + " ,Возраст- " + animal6.ageCat);
         f++;
         System.out.println("Имя- " + animal7.nameCat + " ,Возраст- " + animal7.ageCat);
         f++;
         System.out.println("Имя- " + animal8.nameCat + " ,Возраст- " + animal8.ageCat);
         f++;
         System.out.println("Имя- " + animal9.nameCat + " ,Возраст- " + animal9.ageCat);
         f++;
         System.out.println("Имя- " + animal10.nameCat + " ,Возраст- " + animal10.ageCat);
      } while (f <= 10);

      //В четвертом цикле foreach выводим  массив из пяти котиков, у них выводим имя и возраст.
      System.out.println("\nЦикл №4 Foreach:");

      Random random = new Random();
      int age = random.nextInt(29);
      String[] cats = {"Муська", "Охотник", "Котька", "Солнышко", "Душка"};
        for (String cat : cats){
           System.out.println("Имя- " + cat + " Возраст- " + random.nextInt(29));
       }
   }
}
