package filapacientes;

public class Paciente {
	private String nome;
	private String sexo;
	private int idade;
	
	
	public Paciente(){	
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
    @Override
	public String toString(){
		return "Nome: "+getNome()+
				"\nSexo: "+getSexo()+
				"\nIdade: "+getIdade()+" Anos";
	}

}
