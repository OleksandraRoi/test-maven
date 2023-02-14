import com.github.javafaker.Faker;

public class DemoFake {

    public static void main(String[] args) {

        Faker faker = new Faker();
        System.out.println(faker.address().firstName());
        System.out.println(faker.address().lastName());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.chuckNorris().fact());
        System.out.println(faker.app().author());
        System.out.println(faker.beer().yeast());
        System.out.println(faker.backToTheFuture().quote());
    }
}
