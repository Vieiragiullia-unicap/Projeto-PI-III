public class Notificacao extends Usuario {
    private String mensagem;
    private String tipo;
    private String dataHora;
    private String destinaratio;

    public Notificacao(String mensagem, String tipo, String dataHora, String destinaratio){
        super(0, nome, localizacao, email);
        this.mensagem = mensagem;
        this.tipo = tipo;
        this.dataHora = dataHora;
        this.destinaratio = destinaratio;
    }

    public String getMensagem(){
        return mensagem;
    }
    public String getTipo(){
        return tipo;
    }
    public String getDataHora(){
        return dataHora;
    }
    public String getDestinaratio(){
        return destinaratio;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setDataHora(String dataHora){
        this.dataHora = dataHora;
    }
    public void setDestinaratio(String destinaratio){
        this.destinaratio = destinaratio;
    }

    /*  
    public String toString(){
        return mensagem + " " + tipo + " " + dataHora + " " + destinaratio;
    }
    public boolean equals(Object obj){
        if(obj instanceof Notificacao){
            Notificacao n = (Notificacao) obj;
            return this.mensagem == n.mensagem;
        }
        return false;
    public int hashCode(){
        return mensagem;
    }  
    */
}
