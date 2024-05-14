public class Administrador extends Usuario {
    protected String cargo;

    public Administrador(int id, String nome, String cargo, String email){
        super(0, nome, localizacao, email);
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
