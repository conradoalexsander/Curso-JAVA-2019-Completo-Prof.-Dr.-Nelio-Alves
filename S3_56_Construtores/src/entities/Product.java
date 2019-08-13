package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;

	/*
	 * 1�) O comando public public Product(String name, double price, int
	 * quantity){} � um contrutor que obriga a inser��o dos campos no instanciamento
	 * de objetos
	 */
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	/*2� O comando this garante que a vari�vel est� referenciando os pr�prios par�metros do objeto (public String name;
		*public double price;public int quantity)
	 * � poss�vel realizar a SOBRECARGA de contrutores, adicionando mais um construtor com par�metros diferentes. Conforme exemplo abaixo:
	 */
	}
		
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//O constrotor padr�o [Ex.: Product()], sempre retorna os valores vazios: null para var e string, 0 para n�meros
	//De acordo com o padr�o JavaBeans, as vari�veis n�o devem ser acessadas diretamente pelo usu�rio
	//Para isso s�o necess�rios m�todos, tais como getters e setters. Estes devem ser posicionados abaixo dos contrutores
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}