package buen_ejemplo;

public class Sms implements Notificador{
    @Override
    public void enviar(String mensaje){
        System.out.println("Enviando SMS " + mensaje);
    }
}
