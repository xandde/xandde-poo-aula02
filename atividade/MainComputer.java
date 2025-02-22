public class MainComputer {
    public static void main(String[] args) {
        Processador processador1 = new Processador("480hz", "TSMC", "TRx300");
        Memoria memoria1 = new Memoria("1tb", "Kingston", "2024");
        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }

}
