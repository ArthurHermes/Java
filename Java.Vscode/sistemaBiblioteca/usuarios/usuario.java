package usuarios;

public class usuario {
    private int idUsuario;
    private String nome;
    private String senha;
    private String endereco;


    private tpUsuario tipoUsuario;

    public enum tpUsuario {
        usuario,
        gerente
    }


    /* Constructor */
    public usuario(int idUsuario, String nome, String senha, String endereco, tpUsuario tipoUsuario){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
        this.tipoUsuario = tipoUsuario;
    }

    
    /* Setters */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipoUsuario(tpUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    /* Getters */
    public int getIdUsuario() {
        return idUsuario;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public tpUsuario getTipoUsuario() {
        return tipoUsuario;
    }

}
