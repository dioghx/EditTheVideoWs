package startup.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "PROFISSIONAL")
public class Profissional 
{
    
    private int       id;
    private String    nome;
    private String    email;
    private long      cpf;
    private Date 	  nascimento;
    private String	  telefone;
    private String	  login;
    private String	  senha;
    private Endereco  endereco;

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFISSIONAL_SEQ")
    @SequenceGenerator(name = "PROFISSIONAL_SEQ", sequenceName = "PROFISSIONAL_SEQ", allocationSize = 1)
    @Column(name = "ID")
    public int getId()
    {
        return id;
    }
    
    @OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_ENDERECO", referencedColumnName = "ID")
    public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setId(int pId)
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

    @Column(name = "CPF")
    public long getCpf()
    {
        return cpf;
    }

    public void setCpf(long pCpf)
    {
        cpf = pCpf;
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
