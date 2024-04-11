package model;

public class Mamifero extends Animal {
    private String alimento;

    // Construtor
    public Mamifero() {
        this.setAmbiente("Terra"); 
    }

    // Getters e Setters
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Métodos
    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}
