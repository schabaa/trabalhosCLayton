package bichinhovirtual;

public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int forca;
    private int calorias;
    private int idade;
    private boolean vivo;

    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.forca = 10;      // Valor inicial da força
        this.calorias = 50;   // Valor inicial das calorias
        this.idade = 1;       // Valor inicial da idade
        this.vivo = true;     // Animal começa vivo
    }

    public String getNome() { return nome; }
    public String getClasse() { return classe; }
    public String getFamilia() { return familia; }
    public int getForca() { return forca; }
    public int getCalorias() { return calorias; }
    public int getIdade() { return idade; }
    public boolean isVivo() { return vivo; }

    public void comer() {
        if (vivo) {
            calorias += 10;
            forca += 2;
            System.out.println(nome + " comeu e agora tem " + calorias + " calorias e " + forca + " de força.");
            exibirStatus();
        } else {
            System.out.println(nome + " está morto e não pode comer.");
        }
    }

    public void correr() {
        if (vivo) {
            calorias -= 5;
            forca -= 1;
            idade += 1;
            System.out.println(nome + " correu e agora tem " + calorias + " calorias, " + forca + " de força e " + idade + " anos.");
            exibirStatus();
            verificarEstado();
        } else {
            System.out.println(nome + " está morto e não pode correr.");
        }
    }

    public void dormir() {
        if (vivo) {
            forca += 3;
            calorias += 5;
            System.out.println(nome + " dormiu e recuperou energia. Força: " + forca + ", Calorias: " + calorias + ".");
            exibirStatus();
        } else {
            System.out.println(nome + " está morto e não pode dormir.");
        }
    }

    public void morrer() {
        vivo = false;
        System.out.println(nome + " morreu.");
    }

    private void verificarEstado() {
        if (calorias <= 0 || forca <= 0) {
            morrer();
        }
    }

    public void exibirStatus() {
        System.out.println("Status atual:");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Família: " + familia);
        System.out.println("Força: " + forca);
        System.out.println("Calorias: " + calorias);
        System.out.println("Idade: " + idade);
        System.out.println("Está vivo? " + (vivo ? "Sim" : "Não"));
    }
}
