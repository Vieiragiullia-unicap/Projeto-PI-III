public class Localidade extends Incidente {
    protected String nome;
    protected String historico;
    protected String coordenadasGPS;

    public Localidade(String nome, String historico, String coordenadasGPS){
        super(tipo, descricao, dataHora, gravidade, localidade);
        this.nome = nome;
        this.historico = historico;
        this.coordenadasGPS = coordenadasGPS;
    }

    public String getNome(){
        return nome;
    }
    public String getHistorico(){
        return historico;
    }
    public String getCoordenadasGPS(){
        return coordenadasGPS;
    }   
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setHistorico(String historico){
        this.historico = historico;
    }
    public void setCoordenadasGPS(String coordenadasGPS){
        this.coordenadasGPS = coordenadasGPS;
    }
    
}