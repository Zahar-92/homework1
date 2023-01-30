package task4;

public class Animal {
    String nameCat;
    int ageCat;

    public Animal (){}
    public Animal (String myCat, int myAgeCat){
        nameCat = myCat;
        ageCat = myAgeCat;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameCat='" + nameCat + '\'' +
                ", ageCat=" + ageCat +
                '}';
    }
}