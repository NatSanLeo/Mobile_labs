package Recursos.Utilidades;

public enum Data {
    USER_ADMIN("standard_user"),
    PASSWORD("secret_sauce");

    private String valor;

    Data(final String v) {
        valor = v;

    }

    @Override
    public String toString() {
        return this.valor;
    }
}