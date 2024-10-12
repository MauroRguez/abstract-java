public class Gato extends Animal{
    private String colorPelo;



    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public void sonido() {
        System.out.println("El sonido que emite el gato es maullar");
    }

    @Override
    public void sonido(String texto) {
        System.out.println("El sonido emitido por el gato es: "+texto);
    }

    @Override
    public void sonido(int tiempo, String texto) {
        if(tiempo>20){
            System.out.println("El gato emite el sonido "+texto+" es demasiado largo");
        }
    }

    @Override
    public boolean sonido(int tiempo) {
        return tiempo == 1;
    }

    @Override
    public void deponer(boolean tipo) {
        System.out.println(tipo?"La deposicion es popo":"La deposicion es orina");
    }
    public void obededer(){
        System.out.println("El gato no obedece");
    }

}
