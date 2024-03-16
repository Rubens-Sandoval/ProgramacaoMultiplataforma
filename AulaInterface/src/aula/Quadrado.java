package aula;

public class Quadrado implements FiguraGeometrica{
    private int lado;

    public int getLado(){
        return lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    @Override
    public int getArea(){
        int area = 0;
        area = lado * lado;

        return area;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int getPerimetro() {
        return 0;    
    }

    
}
