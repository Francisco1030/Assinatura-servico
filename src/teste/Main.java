package teste;

import model.Assinatura;
import model.Programa;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Assinatura assinatura = new Assinatura();
        assinatura.setDescricao("Assinatura DEVMedia");
        assinatura.setPreco(104.9);
        assinatura.setDataExpiracao(LocalDate.parse("2019-06-22"));

        Programa programa = new Programa();
        programa.exibirDiasAteExpirar(assinatura);
        //System.out.println(LocalDate.now());
    }
}
