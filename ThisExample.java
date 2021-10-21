class Person{
    String name;
    int age;

    public Person(){
        System.out.println("Un-parametrised Constructor.");
    }

    public Person(String name){
        this();
        this.name = name + "!!";
        System.out.println("1-Parametrized Constructor.");
    }

    public Person(String name, int age){
        this("Gaurav");
        this.name = name;
        this.age = age;
        System.out.println("2 - Parametrized constuctor.");
    }
}

public class ThisExample{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Sushant");
        Person p3 = new Person("Sushant" , 20);
    }
}