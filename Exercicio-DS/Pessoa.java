public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    //Construtor
    public Pessoa (String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }  

    public Pessoa (){}
    //Método GET
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getemail(){
        return email;
    }

    //Método SET
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
