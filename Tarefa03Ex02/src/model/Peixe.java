package model;

public class Peixe extends Animal {
    private String caracteristica;

    // Construtor
    public Peixe() {
        this.setPatas(0); // Peixe tem 0 patas
        this.setAmbiente("Mar"); // Padrão de ambiente marinho
        this.setCor("Cinzento"); // Padrão de cor cinzenta
    }

    // Getters e Setters
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // Métodos
    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}
