package javaLearning;

public class ConstructorExp1 {
    int a;
    int b;
    int c;

    ConstructorExp1(){
        System.out.println(" Can not calculate without input ");
    }
    ConstructorExp1(int a){
        this.a=a;
        this.b=a;
        this.c =this.a+this.b;
        System.out.println(" Addition of 1-argument Constructor "+this.c);
    }
    ConstructorExp1(int a, int b){
        this.a=a;
        this.b=b;
        this.c =this.a+this.b;
        System.out.println(" Addition of 2-argument Constructor "+this.c);

    }
    ConstructorExp1( int a, int b,int c){
        this.a =a;
        this.b =b;
        this.c =c;
        this.c =this.a+this.b+this.c;
        System.out.println(" All 3 Variables Initialized and Addition "+this.c);
    }

    public static void main(String[] args) {
        ConstructorExp1 c= new ConstructorExp1();
        ConstructorExp1 c1= new ConstructorExp1(10);
        ConstructorExp1 c2= new ConstructorExp1(10,20);
        ConstructorExp1 c3= new ConstructorExp1(10,20,30);

    }
}
