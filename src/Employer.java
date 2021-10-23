public class Employer {
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employer (String fio, String position, String email, String phone, int salary, int age) {
    this.fio = fio;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
    }

    void printEmployer () {
        System.out.println(fio);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary + " RUB");
        System.out.println(age + " years");
        System.out.println();
    }
}
