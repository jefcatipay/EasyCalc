package jef.catipay.com.easycalc;
/**
 * Created by Jef on 7/19/2017.
 */

public class Operations {

public number input;

    public float addition(number input){
    this.input = input;
    return input.getA()+input.getB();
    }
    public float multiply(number input){
        this.input = input;
        return input.getA()*input.getB();
    }
    public float division(number input){
        this.input = input;
        return input.getA()/input.getB();
    }
    public float subtraction(number input){
        this.input = input;
        return input.getA()-input.getB();
    }
}
