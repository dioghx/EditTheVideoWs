package startup.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "USUARIO")
public class Usuario implements Serializable, Cloneable
{
    private static final long serialVersionUID = 2179092916642396463L;

    private int       id;
    private String    nome;
    private String    email;
    private Date 	  nascimento;
    private String	  telefone;
    private String	  login;
    private String	  senha;

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQ")
    @SequenceGenerator(name = "USUARIO_SEQ", sequenceName = "USUARIO_SEQ", allocationSize = 1)
    @Column(name = "id")
    public int getMatricula()
    {
        return id;
    }

    public void setMatricula(int pId)
    {
        id = pId;
    }

    @Column(name = "NOME")
    public String getNome()
    {
        return nome;
    }

    public void setNome(String pNome)
    {
        nome = pNome;
    }

    @Column(name = "EMAIL")
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String pEmail)
    {
        email = pEmail;
    }

    @Column(name = "NASCIMENTO")
    public Date getNascimento()
    {
        return nascimento;
    }

    public void setNascimento(Date pNascimento)
    {
        nascimento = pNascimento;
    }

    @Column(name = "TELEFONE")
    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String pTelefone)
    {
        telefone = pTelefone;
    }

    @Column(name = "LOGIN")
    public String getLogin()
    {
        return login;
    }

    public void setLogin(String pLogin)
    {
        login = pLogin;
    }

    @Column(name = "SENHA")
    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String pSenha)
    {
        senha = pSenha;
    }



   

   
}
