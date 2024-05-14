public class Incidente {
    public String tipo;
    public String descricao;
    public String dataHora;
    public String gravidade;
    public String localidade;

    public Incidente(String tipo, String descricao, String dataHora, String gravidade, String localidade){
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.gravidade = gravidade;
        this.localidade = localidade;
    }

    public String getTipo(){
        return tipo;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getDataHora(){
        return dataHora;
    }
    public String getGravidade(){
        return gravidade;
    }
    public String getLocalidade(){
        return localidade;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setDataHora(String dataHora){
        this.dataHora = dataHora;
    }
    public void setGravidade(String gravidade){
        this.gravidade = gravidade;
    }
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
}
