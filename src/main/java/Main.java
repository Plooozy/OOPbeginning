public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthDay = new FormDate();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444№444444";
        post.phone = "+7(999)-999-99-99";
        post.subscription = true;
        post.birthDay.day = 13;
        post.birthDay.month = 6;
        post.birthDay.year = 1999;
    }
}
