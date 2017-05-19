package startup.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "EMPRESA")
public class Empresa implements Serializable, Cloneable
{

    private static final long serialVersionUID = 4927454144429877814L;

    private int       id;
    private String    nome_curto;
    private String    razao_social;
    private String    email;
    private long      cnpj;
    private String    telefone;
    private String    login;
    private String    senha;
    private Endereco  endereco;

    @Id()
	@SequenceGenerator(name ="PRO_SEQ", sequenceName = "PROFISSIONAL_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRO_SEQ")
	@Column(name ="ID")
    public int getId()
    {
        return id;
    }

    public void setId(int pId)
    {
        id = pId;
    }

    @Column(name = "NOME_CURTO")
    public String getNome_Curto()
    {
        return nome_curto;
    }

    public void setNome_Curto(String pNome_Curto)
    {
        nome_curto = pNome_Curto;
    }

    @Column(name = "RAZAO_SOCIAL")
    public String getRazao_Social()
    {
        return razao_social;
    }

    public void setRazao_Social(String pRazao_Social)
    {
        razao_social = pRazao_Social;
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


    @Column(name = "TELEFONE")
    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String pTelefone)
    {
        telefone = pTelefone;
    }

    @Column(name = "CNPJ")
    public long getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(long pCnpj)
    {
        cnpj = pCnpj;
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
    

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_ENDERECO", referencedColumnName = "ID")
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

