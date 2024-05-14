public class Historico extends Incidente{
    public int id;
    public ArrayList<inidente>
    
    public Historico(int id, ArrayList<inidente>){
        super(tipo, descricao, dataHora, gravidade, localidade);
        this.id = id;
        this.inidente = inidente;
    }

    public int getId(){
        return id;
    }
    public ArrayList<inidente> getInidente(){
        return inidente;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setInidente(ArrayList<inidente> inidente){
        this.inidente = inidente;
    }
}