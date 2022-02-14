
public class testCalculos {
	public static void main(String[] args) {
			Triangulo 	t1 = new Triangulo("triángulo", 10, 20, 10, 10, 10);
			Triangulo 	t2 = new Triangulo("triángulo", 15, 25, 15, 15, 15);
			Cuadrado  	c1 = new Cuadrado("cuadrado 1", 25);
			Rectangulo  r1 = new Rectangulo("rectángulo 1",25, 15);
			Rombo 		ro1 = new Rombo(10, 5, 10, "Rombo 1");
			Romboide	rom1 = new Romboide(15, 20, "Romboide 1");
			Trapecio 	tr1 = new Trapecio(10, 20, 8, 20, 15, 20, 15, "Trapecio 1");
			
			Calculos.calc(t1);

			Calculos.calc(t2);
			
			Calculos.calc(c1);
			
			Calculos.calc(r1);

			Calculos.calc(ro1);

			Calculos.calc(rom1);

			Calculos.calc(tr1);

	}//main
} // class testCalculos
