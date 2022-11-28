package pt.up.fe.ldts.example4;

public class Client extends Person {

    public Client(String name, String phone) {
        super(name, phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Client client = (Client) o;

        return true;
    }
}
