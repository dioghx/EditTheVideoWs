package startup.dto;

import java.util.List;

public abstract class AbstractDTO<T>
{
    private boolean      ok;
    private String       mensagem;
    private T       objeto;
    private List<T> lista;
    private int matricula;
    
    public AbstractDTO()
    {
        super();
    }

    public AbstractDTO(boolean pOk, String pMensagem)
    {
        super();
        ok = pOk;
        mensagem = pMensagem;
    }

    public AbstractDTO(boolean pOk, String pMensagem, T pObjeto)
    {
        super();
        ok = pOk;
        mensagem = pMensagem;
        objeto = pObjeto;
    }

    public AbstractDTO(boolean pOk, String pMensagem, List<T> pLista)
    {
        super();
        ok = pOk;
        mensagem = pMensagem;
        lista = pLista;
    }

    public AbstractDTO(boolean pOk, String pMensagem, int pMatricula)
    {
        super();
        ok = pOk;
        mensagem = pMensagem;
        matricula = pMatricula;
    }
    
    public boolean isOk()
    {
        return ok;
    }

    public void setOk(boolean pOk)
    {
        ok = pOk;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String pMensagem)
    {
        mensagem = pMensagem;
    }

    protected T getObjeto()
    {
        return objeto;
    }

    protected void setObjeto(T pT)
    {
        objeto = pT;
    }

    public List<T> getLista()
    {
        return lista;
    }

    public void setLista(List<T> pLista)
    {
        lista = pLista;
    }
    public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
