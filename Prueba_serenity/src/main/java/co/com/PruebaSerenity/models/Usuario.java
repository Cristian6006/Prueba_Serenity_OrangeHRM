package co.com.PruebaSerenity.models;



import java.util.Locale;

public class Usuario {
    private String firstName;
    private String middleName;
    private String lastName;
    private String id;

    private Usuario() {}

    public String getFirstName() { return firstName;}
    public String getMiddleName() { return middleName;}
    public String getLastName() { return lastName;}
    public String getId() { return id;}

    public static Builder builder() { return new Builder();}

    public static class Builder {
        private final Usuario usuario  = new Usuario();
        public Builder firstName(String firstName) { usuario.firstName = firstName;   return this; }
        public Builder middleName(String middleName) { usuario.middleName = middleName;   return this; }
        public Builder lastName(String lastName) { usuario.lastName = lastName;   return this; }
        public Builder id(String id) { usuario.id = id;   return this; }
        public Usuario build() { return usuario; }
    }
}
