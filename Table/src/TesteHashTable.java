import java.util.Hashtable;

public class TesteHashTable {
	public static void main(String[] args) {
		int fim;
		int i = fim = 0;
		Cliente c1 = new Cliente("7548","Valdinei Santos");
		Cliente c2 = new Cliente("8289","Claire Moura");
		Cliente c3 = new Cliente("1565","Vagner Seller");

		Hashtable<Integer,Cliente> ht = new Hashtable<Integer, Cliente>();
		//ht.put(1, c1);
		//ht.put(2, c2);
		//ht.put(3, c3);
				
		
		ht.put(criaKey(c1.cpf), c1);
		ht.put(criaKey(c2.cpf), c2);
		ht.put(criaKey(c3.cpf), c3);
				
				
		System.out.println("KEY \t\t Cliente\n");
//		System.out.println(ht.size() + "- size ; " + criaKey(c2.cpf) + "; " + criaKey(c1.cpf) + "; " + criaKey(c3.cpf) );
		do{
			if(ht.get(i) == null){
				i++;
			}else{
				System.out.println(ht.get(i));
				fim++;
				i++;
			}
					
		}while(fim < ht.size());
	}// fim main

	public static int criaKey(String cpf) {// criar key
		int key = 0;
		key = (Integer.parseInt(cpf) / 50 ) % 8;// recebe cpf divide por 50 e pega o resto da divisao por 8
		return key;// retorna o resultado da equação acima como key
	}

}// fim classe

class Cliente {
	public String cpf;
	public String nome;

	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return cpf + " | " + nome;
	}
}