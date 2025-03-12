public class MainEx1 {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "01/01/2000", 1000.0);
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "01/01/1990", 5000.0);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        motoboy.contratar(gerente);
        gerente.demitir(motoboy);
    }

}
