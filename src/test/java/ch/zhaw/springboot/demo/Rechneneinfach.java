package ch.zhaw.springboot.demo;

public class Rechneneinfach {
    
    public String convert (int i){
        if (i >= 100 && i%5 == 0) {
            return "Uber 100 & /5";
        }   else if (i < 0 ) {
            return "Negativ";
        }   else if (i%3 == 0) {
            return "Drü";
        }   else if (i%8 == 0){
            return "Acht";
        }   else if (i%4 == 0){
            return "Vier";
        }   else if (i%2 == 0){
            return "Zwo";
        }   else if (i%5 == 0){
            return "5";
        }
        return String.valueOf(i);
    }
}

