
public class Personagem {
    private String nome;
    private int vida;
    
    public Personagem(String nome){
        this.nome = nome;
        this.vida = 100;
    }
    public String getNome(){
        return nome;
    }
    public int getVida(){
        return vida;
    }
    protected void setVida(int vida){
        this.vida = vida;
    }
    @Override
    public String toString(){
        return "O nome do personagem é: " + nome +
                "\nVida: " + vida;
    }
}

public enum Bestiario {
    
    Rato("Rato", 20, 15, 5),
    Esq("Esqueleto", 80, 45, 15),
    Golem("Golem", 100, 30, 60),
    Orc("Orc", 250, 60, 50),
    Drag("Dragão", 1000, 100, 80);
    
    private String tipo;
    private int vidaMaxima;
    private int ataque;
    private int defesa;
    
    private Bestiario(String tipo, int vidaMaxima, int ataque, int defesa){
        this.tipo = tipo;
        this.vidaMaxima= vidaMaxima;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public String getTipo(){
        return tipo;
    }
    public int getVidaMaxima(){
        return vidaMaxima;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getDefesa(){
        return defesa;
    }
}

public class Jogador extends Personagem{
    private int level;
    private String classe;
    
    public Jogador(String nome, int level, String classe){
        super(nome);
        this.level = level;
        this.classe = classe;
    }
    public int getLevel(){
        return level;
    }
    public String getClasse(){
        return classe;
    }
    @Override
    public String toString(){
        return super.toString() + 
                "\nO level é: " + level +
                "\nSua classe: " + classe;
    }
}

public class Monstro extends Personagem{
    private boolean hostil;
    private Bestiario tipo;
    
    public Monstro(String nome, boolean hostil, Bestiario tipo){
        super(nome);
        this.hostil = hostil;
        this.tipo = tipo;
        
        setVida(tipo.getVidaMaxima());
    }
    
    @Override
    public String toString(){
        return "O nome é: " + getNome() + 
                "\nHostilidade: " + hostil + 
                "\nTipo:" + tipo.getTipo() + 
                "\nSua vida é: "+ getVida();
       
    }
}

