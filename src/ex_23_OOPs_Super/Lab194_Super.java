package ex_23_OOPs_Super;

public class Lab194_Super {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }

}

class GOD{
    public  int gold = 100;
    void sound(){
        System.out.println("GOD!!");
    }

    GOD(){
        System.out.println("GOD DC");
    }
}

class Animal extends GOD{
    @Override
    void sound() {

        super.sound();//It will call parent class i.e God class sound() method
    }
    Animal(){
        super();//here it will call parent class i.e God class default constructor
        //Here we have first created Animal class constructor because constructor will be called inside constructor only
    }
    Animal(int a,int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);//Here super.gold will call parent class i.e God class variable
    }
}

