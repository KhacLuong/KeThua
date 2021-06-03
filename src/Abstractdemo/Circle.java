package Abstractdemo;

public class Circle extends  Calculator{
    float area;
    float rad;
public Circle(float r){
    rad = r;
}
    @Override
    public void Caculate() {
        area = getPI()*rad*rad;
        System.out.println(" Area Circle " + area);
    }
}
