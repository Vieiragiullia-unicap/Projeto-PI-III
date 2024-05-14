public class Relatorio extends Usuario {
    public String descricao;
    public String data;

    public Relatorio(String descricao, String data){
        super(0, nome, localizacao, email);
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao(){
        return descricao;
    }
    public String getData(){
        return data;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setData(String data){
        this.data = data;
    }
    
}
