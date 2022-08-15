public class IVA {

    public static void main(String[] args) {

    System.out.println(getIva(20.16));
}

    static double getIva (double precio) {

        //Iva de 16%
        double iva = .16;
        double suma = precio * iva;
        return precio + suma;
    }
}


