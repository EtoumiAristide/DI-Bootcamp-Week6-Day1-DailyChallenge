public class Person {
    public String name;
    public int age;
    public double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        salary = -1;
    }

    public void displayInfos() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary:" + salary);
    }
}
