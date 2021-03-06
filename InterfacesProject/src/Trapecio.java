public class Trapecio implements FiguraGeometrica {
    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;
    private float baseMe;
    private float baseMa;
    private float altura;
    private String nombre;

    public Trapecio(float lado1, float lado2, float lado3, float lado4, float baseMe, float baseMa, float altura,
            String nombre) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.baseMe = baseMe;
        this.baseMa = baseMa;
        this.altura = altura;
        this.nombre = nombre;
    }//Constructor

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public float getLado4() {
        return lado4;
    }

    public void setLado4(float lado4) {
        this.lado4 = lado4;
    }

    public float getBaseMe() {
        return baseMe;
    }

    public void setBaseMe(float baseMe) {
        this.baseMe = baseMe;
    }

    public float getBaseMa() {
        return baseMa;
    }

    public void setBaseMa(float baseMa) {
        this.baseMa = baseMa;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float area(){
        return (getAltura() * (getBaseMe() + getBaseMa())/2);
    }//Area

     @Override
     public float perimetro(){
         return (getLado1()+getLado2()+getLado3()+getLado4());
     }//Perimetro
    
     @Override
     public String getNombre(){
         return nombre;
     }//getNombre

    
}
