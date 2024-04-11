package view;

import model.Animal;
import model.Peixe;
import model.Mamifero;

public class TesteAnimais {
    public static void main(String[] args) {
  
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2.0f);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5f);
        tubarao.setCaracteristica("Barbatanas e cauda");

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5f);
        urso.setAlimento("Mel");

  
        System.out.println("Zoo:");
        System.out.println("------------------------------");
        camelo.dados();
        System.out.println("------------------------------");
        tubarao.dados();
        System.out.println("------------------------------");
        urso.dados();
        System.out.println("------------------------------");
    }
}
