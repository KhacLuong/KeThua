package Abstractdemo;

public class square extends Calculator{
    private float w;

    public square(float w) {
        this.w = w;
    }

    @Override
    void Caculate() {
       float  area= w*w;
        System.out.println(" area Square" + area);
    }
}
