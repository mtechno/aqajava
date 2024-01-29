package Lesson4;

public class Sotrudnik {
    String fio, position, email, phone;
    int salary, age;

    public Sotrudnik ( String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return "Сотрудник: " + fio + " , должность: " + position + " , электронная почта: " + email + " , телефон: " + phone + " , зарплата: " + salary + " , возраст " + age;
    }

    public static void main(String[] args) {
        Sotrudnik[] sotrArray = new Sotrudnik[5];
        sotrArray[0] = new Sotrudnik("Иванов Иван Иванович", "инженер", "ingeneer@company.com", "+79991234567", 20000, 50);
        sotrArray[1] = new Sotrudnik("Иванов Петр Иванович", "директор", "director@company.com", "+79991334567", 200000, 55);
        sotrArray[2] = new Sotrudnik("Иванов Сергей Иванович", "программист", "prog@company.com", "+79991434567", 200000, 33);
        sotrArray[3] = new Sotrudnik("Иванов Алексей Иванович", "тестировщик", "test@company.com", "+79991534567", 200000, 33);
        sotrArray[4] = new Sotrudnik("Иванов Роман Иванович", "специалист", "spec@company.com", "+79991634567", 2000, 18);

        System.out.println(sotrArray[2].toString());;
    }

}

/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

Создать массив из 5 сотрудников.
Пример:
// вначале объявляем массив объектов
Person[] persArray = new Person[5];
// потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer",
               "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
*/