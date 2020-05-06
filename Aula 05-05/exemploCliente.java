package PLPaula;

public class exemploCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(123456789,"1234567","Marcio", "12345678");
        Cliente cliente2 = new Cliente(12345, "12345678");
        System.out.println(cliente2.idCliente);
    }
    
}