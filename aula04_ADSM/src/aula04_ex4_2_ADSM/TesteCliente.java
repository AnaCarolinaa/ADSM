package aula04_ex4_2_ADSM;

public class TesteCliente {

	public static void main(String[] args) {
		SomadorExistente existente = new SomadorExistente();
		ExistenteToEsperadoAdapter adapter = new ExistenteToEsperadoAdapter(existente);
		
		Cliente cliente = new Cliente(adapter);
		
		cliente.executar();

	}

}
