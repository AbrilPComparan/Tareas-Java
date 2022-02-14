public class Romboide implements FiguraGeometrica {
    private float base;
    private float altura;
    private String nombre;

    public Romboide(float base, float altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }//Constructor

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }//setBase

    public float getAltura() {
        return altura;
    }//getAltura

    public void setAltura(float altura) {
        this.altura = altura;
    }//setAltura

    public float area(){
        return (getAltura() * getBase());
    }//Area

    public float perimetro(){
        return (2 * getAltura()) + (2* getBase());
    }//Perimetro

    public String getNombre(){
        return nombre;
    }
}//Clas Romboide
