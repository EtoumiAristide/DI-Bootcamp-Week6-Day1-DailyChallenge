public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Pascal", 35, 685000);
        person1.displayInfos();
        person2.displayInfos();

        Person person3 = new Person("John", 26);
        person3.displayInfos();
        if (person3.salary == -1) {
            System.out.println("Salary not provided");
        }
    }
}