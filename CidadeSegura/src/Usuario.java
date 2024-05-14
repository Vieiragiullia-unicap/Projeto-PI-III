public class Usuario {
    private int id;
    private String nome;
    private String localizacao;
    private String email;

    public Usuario(int id, String nome, String localizacao, String email){
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.email = email;
    }
    public int getId(){
        return id;
    }   
    public String getNome(){
        return nome;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public String getEmail(){
        return email;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }   
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
