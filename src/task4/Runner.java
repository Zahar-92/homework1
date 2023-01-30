package task4;

import java.util.Random;

public class Runner {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Первый while создает 10 котиков и выводит на консоль дефолтное имя и возраст.
    public void catHome(){

        Random random = new Random();
        int age = random.nextInt(29);

        String[] name = {"Котя", "Боливар", "Соня", "Черныш", "Солнце", "Сруль", "Белик", "Рыжик", "Машка", "Мышелов"};
        int n = (int) (Math.random()*9);

       int i = 1;
       while (i <=10){
           System.out.println("Имя: " + name[new Random().nextInt(name.length)] + " ,возраст: " + random.nextInt(29));
           i++;
                  }
           }
           //Сгенерировать метод  toString

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}