package servico;






import model.Pessoa;
import repository.Repository;

public class PessoaService {
	public Repository<Pessoa> repo;

	public PessoaService(Repository<Pessoa> repo) {
		this.repo = repo;
	}
	
	public void  imprimirLista(){
		for (Pessoa pessoa : repo.list) {
			System.out.println("imprimindo pela camada de serviço");
			System.out.println(pessoa);
			
		}
		
		
	}

}
