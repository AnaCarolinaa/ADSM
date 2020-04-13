package aula04_ex5_1_ADSM;

public class MainFacade {

	public static void main(String[] args) 
	{
		ArquivoDeTexto arquivoDeTexto = new ArquivoDeTexto();
		ArquivoBinario arquivoBinario = new ArquivoBinario();
		Objeto objeto = new Objeto(1, "objeto1");
		
		IOFacade facade = new IOFacade(arquivoDeTexto, arquivoBinario, objeto);
		facade.abrirTexto();
		facade.abrirBinario();
		facade.abrirObjeto();
	}
}
