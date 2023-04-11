package ru.netology.services;
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Ivan";
        post.passport = "444№44444444";
        post.patronymic = "Иванов";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        System.out.println(post.subscription);
    }
}
