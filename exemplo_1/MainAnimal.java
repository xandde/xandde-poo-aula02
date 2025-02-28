public class MainAnimal {
    public static void main(String[] args) {
        Galo galo1 = new Galo();
        Gato gato1 = new Gato();
        Cachorro cachorro1 = new Cachorro();

        System.out.println(galo1.emitirSom());
        System.out.println(galo1.comer());

        System.out.println(gato1.emitirSom());
        System.out.println(gato1.comer());

        System.out.println(cachorro1.emitirSom());
        System.out.println(cachorro1.comer());
    }

}
