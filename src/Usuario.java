public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(11);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
