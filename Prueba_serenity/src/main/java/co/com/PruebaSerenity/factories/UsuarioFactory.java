package co.com.PruebaSerenity.factories;

import co.com.PruebaSerenity.models.Usuario;
import net.datafaker.Faker;
import java.util.Locale;

public class UsuarioFactory {
    private static final Faker faker = new Faker(new Locale("es"));

    public static Usuario randomUser() {
        return Usuario.builder()
                .firstName(faker.name().firstName())
                .middleName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .id(String.valueOf(faker.random().nextInt(3)))
                .build();
    }

    public static Usuario updatedUser(Usuario original) {
        return Usuario.builder()
                .firstName(faker.name().firstName())
                .middleName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .build();
    }
}
