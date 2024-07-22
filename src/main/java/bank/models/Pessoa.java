package bank.models;

public abstract class Pessoa {

	protected int id;
    protected String email;
    protected String name;
    protected String cpfCnpj;

    public Pessoa() {
    }

    public Pessoa(String name, String cpfCnpj) {
        this.setName(name);
        this.setCpfCnpj(cpfCnpj);
	}

    //retirei o ID para usar esse constructor em funcionarios
    public Pessoa(String email, String name,String cpfCnpj) {
    	this.setEmail(email);
    	this.setName(name);
    	this.setCpfCnpj(cpfCnpj);
    }
    
    public Pessoa(String name, int id) {
    	this.setName(name);
    	this.setId(id);
    }

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", email=" + email + ", name=" + name + ", cpfCnpj=" + cpfCnpj + "]";
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
