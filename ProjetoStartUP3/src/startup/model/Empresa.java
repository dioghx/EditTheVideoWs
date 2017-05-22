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
    private long      cnpj;
    private Usuario usuario;

  //Determinar se necessita de anotação para sequência,ja que estaremos utilizando MySQL.
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

    @Column(name = "NOMECURTO")
    public String getNome_Curto()
    {
        return nome_curto;
    }
    

    public void setNome_Curto(String pNome_Curto)
    {
        nome_curto = pNome_Curto;
    }

    @Column(name = "RAZAOSOCIAL")
    public String getRazao_Social()
    {
        return razao_social;
    }

    public void setRazao_Social(String pRazao_Social)
    {
        razao_social = pRazao_Social;
    }


	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_USUARIO", referencedColumnName = "ID")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

 
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

