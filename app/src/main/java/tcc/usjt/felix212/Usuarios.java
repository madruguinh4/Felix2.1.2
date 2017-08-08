package tcc.usjt.felix212;

/**
 * Created by alan0 on 08/08/2017.
 */

public class Usuarios {

    private  String id;
    private  String email;
    private  String senha;
    private  String sobrenome;
    private  String aniversarios;
    private  String idade;

    public Usuarios() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAniversarios() {
        return aniversarios;
    }

    public void setAniversarios(String aniversarios) {
        this.aniversarios = aniversarios;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
