public class Main {
    public static void main(String[] args) {

       Perro obPerro= new Perro();
       Gato obGato=new Gato();
       obPerro.setNombre("Teo");
       obPerro.setColorPelo("Cafe");
       obPerro.sonido();
       obPerro.sonido(12);
       obPerro.sonido("Guau");
       obPerro.sonido(23,"Grrr");
       obPerro.obededer();
       obGato.setNombre("Milu");
       obGato.setColorPelo("Negro");
       obGato.sonido();
       obGato.sonido(24);
       obGato.sonido("Miauuu");
       obGato.sonido(25,"Auggggg");

    }
}