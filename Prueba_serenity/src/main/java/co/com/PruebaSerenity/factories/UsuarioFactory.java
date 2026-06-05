package co.com.PruebaSerenity.factories;

import co.com.PruebaSerenity.models.Usuario;
import net.datafaker.Faker;
import java.util.Locale;
import java.util.UUID;

public class UsuarioFactory {
    private static final Faker faker = new Faker(new Locale("es"));

    public static Usuario randomUser() {
        return Usuario.builder()
                .firstName(faker.name().firstName())
                .middleName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .id(UUID.randomUUID().toString().substring(0, 8))
                .build();
    }

    public static Usuario updatedUser(Usuario original) {
        return Usuario.builder()
                .firstName(faker.name().firstName())
                .middleName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .id(original.getId())
                .build();
    }
}
