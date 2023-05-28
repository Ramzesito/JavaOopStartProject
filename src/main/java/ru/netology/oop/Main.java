package ru.netology.oop;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate formDate = new FormDate();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "1234 № 567890";
        post.phone = "+7 (123)-456-78-90";
        post.subscription = true;
        formDate.day = 11;
        formDate.month = 12;
        formDate.year = 1999;
        post.birthday = formDate;
    }
}
