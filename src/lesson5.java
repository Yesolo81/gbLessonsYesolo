public class lesson5 {
    public static void main (String[] args) {
        Employer[] empArray = new Employer[5];
        empArray[0] =  new Employer("Ivanov Ivan", "Director","ivanov@mail.ru","+79253332211", 100000, 60);
        empArray[1] =  new Employer("Petrov Alexey", "Vice Director","petrov@mail.ru","+79263332211", 70000, 50);
        empArray[2] =  new Employer("Koloda Dmitry", "Manager","koloda@mail.ru","+79243332211", 60000, 40);
        empArray[3] =  new Employer("Derkach Irina", "Engineer","derkach@mail.ru","+79213332211", 50000, 32);
        empArray[4] =  new Employer("Serova Elena", "Secretary","serova@mail.ru","+79203332211", 30000, 21);

        for (int i = 0; i < 5; i++) {
            if (empArray[i].age >= 40) {
                empArray[i].printEmployer();
            }
        }
    }
}
