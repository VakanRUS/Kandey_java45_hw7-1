public class Main {
    public static void main(String[] args) {
        String personName = "Sarah";        //какие-то переменные приходящие откуда-то
        int personAge = 30;                 //но тут я объявлю их вручную
        Person sarah = new Person(personName, personAge);
//        sarah.name = "Shit";
        System.out.println("Name = " + sarah.getName());
        System.out.println("Age = " + sarah.getAge());
        String abc = new String("abc");
        System.out.println(abc);
    }
}