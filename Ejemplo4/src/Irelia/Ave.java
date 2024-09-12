package Irelia;

public class Ave {



	private String colorPlumas;

	private String tamanoAlas;



	public Ave(String colorPlumas, String tamanoAlas) {

		this.setColorPlumas(colorPlumas);

		this.setTamanoAlas(tamanoAlas);



		System.out.println("constructor ejecutado en clase Ave");



	}



	public Ave() {

		System.out.println("Este constructor se declaro en la clase Ave");

	}



	public void comer() {

		System.out.println("comiendo semillas de sesamo");

	}



	public void caminar() {

		System.out.println("caminando a paso de ave");

	}



	public void metodoAve() {

		System.out.println("Este metodo fue declarado en clase Ave");

	}



	public String getColorPlumas() {
		return colorPlumas;
	}



	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}



	public String getTamanoAlas() {
		return tamanoAlas;
	}



	public void setTamanoAlas(String tamanoAlas) {
		this.tamanoAlas = tamanoAlas;
	}

}

