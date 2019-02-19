import model.Pessoa;
import repository.Repository;
import servico.PessoaService;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ("Fernando", "9999966666");
		Pessoa pessoa2 = new Pessoa ("luana", "9999966666");
		Repository<Pessoa> repositorio = new Repository<Pessoa>();
		PessoaService service = new PessoaService(repositorio);
		
		repositorio.add(pessoa);
		repositorio.add(pessoa2);
		System.out.println(repositorio.emptyList());
		System.out.println(repositorio.getList());
		service.imprimirLista();
		
		
		repositorio.printIndex();
		repositorio.delete(0);
		repositorio.printIndex();
		

	}

}
