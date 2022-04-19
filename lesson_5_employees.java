package ru.gorban;

public class lesson_5_employees {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public String toString(){
        return  "Full name: " + surname + " " + name + " "  +patronymic + " "  + "; " + "Position: " + position + "; " + "Email: " + email + "; " + "Phone: " + phone + "; " + "Salary: " + getSalary() + "; " + "Age; " + getAge()+ "." ;
    }
    public lesson_5_employees(String surname, String name, String patronymic, String position, String email, String phone, String salary, String age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = Integer.parseInt(salary);
        this.age = Integer.parseInt(age);
        System.out.println(toString());
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
