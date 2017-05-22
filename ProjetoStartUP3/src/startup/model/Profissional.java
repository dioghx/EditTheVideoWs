package startup.model;

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
    private long      cpf;
    private String    nivel;
    private String 	  descricao;
    private long      avaliacao;  
    private Usuario   usuario;

  //Determinar se necessita de anotação para sequência,ja que estaremos utilizando MySQL.
    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFISSIONAL_SEQ")
    @SequenceGenerator(name = "PROFISSIONAL_SEQ", sequenceName = "PROFISSIONAL_SEQ", allocationSize = 1)
    @Column(name = "ID")
    public int getId()
    {
        return id;
    }
	public void setId(int pId)
    {
        id = pId;
    }
	
	@Column(name ="CPF")
    public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_USUARIO", referencedColumnName = "ID")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Column(name ="NIVEL")
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	@Column(name ="DESCRICAO")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name ="AVALIACAO")
	public long getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(long avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
