import java.util.ArrayList;
import java.util.List;

public class Historico extends Incidente{
    public int id;
    public List<Incidente> incidentes;
    
    public Historico.historico(int id, List<Incidente> incidentes){
        this.id = id;
        this.Incidente = incidentes;
    }

    public int getId(){
        return id;
    }
    public List<Incidente> getInicdente(){
        return incidentes;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setIncidente(List<Incidente> incidentes){
        this.incidentes = incidentes;
    }
}