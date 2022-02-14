public class Rombo implements FiguraGeometrica {
    private float lado;
    private float diagonalm;
    private float diagonalMa;
    private String nombre;


    public Rombo(float lado, float diagonalm, float diagonalMa, String nombre) {
        super();
        this.lado = lado;
        this.diagonalm = diagonalm;
        this.diagonalMa = diagonalMa;
        this.nombre = nombre;
    }//Constructor


    public float getLado() {
        return lado;
    }//getLado

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getDiagonalm() {
        return diagonalm;
    }

    public void setDiagonalm(float diagonalm) {
        this.diagonalm = diagonalm;
    }

    public float getDiagonalMa() {
        return diagonalMa;
    }

    public void setDiagonalMa(float diagonalMa) {
        this.diagonalMa = diagonalMa;
    }

    @Override
    public float area(){
        return (getDiagonalMa() * getDiagonalm()) /2;
    }//area

    @Override
    public float perimetro(){
        return getLado() * 4;
    }//Perimetro

    @Override
    public String getNombre() {
        return nombre;
    }
}//Class Rombo
