package aula04_ex5_1_ADSM;

public class IOFacade 
{
	public final ArquivoDeTexto arquivoDeTexto;
	public final ArquivoBinario arquivoBinario;
	public final Objeto objeto;
	
	public IOFacade(ArquivoDeTexto arquivoDeTexto, ArquivoBinario arquivoBinario, Objeto objeto)
	{
		this.arquivoDeTexto = arquivoDeTexto;
		this.arquivoBinario = arquivoBinario;
		this.objeto = objeto;
	}
	
	public void abrirTexto()
	{
		arquivoDeTexto.abreArquivoDeTexto();
	}
	
	public void abrirBinario()
	{
		arquivoBinario.abreArquivoBinario();
	}
	
	public void abrirObjeto()
	{
		objeto.criaObjeto();
		objeto.abreObjeto();
	}
}
