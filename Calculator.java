
class Calculator {
  
    float addition (float num1,float num2){
        return(num1+num2);
    }
   
    float substraction (float num1,float num2){
        return(num1-num2);
    }

    float multiplication (float num1,float num2){
        return(num1*num2);
    }


    float division(float num1,float num2){
        return(num1/num2);
    }

public static void main(String []args){
    Calculator calc=new Calculator();

    float num1=10;
    
    float num2=20;
    
        float add=calc.addition(num1,num2);
        System.out.println("Addition of two Numbers:"+add);
 
        float sub=calc.substraction(num1,num2);
        System.out.println("Substraction :"+sub);
     
        float mul=calc.multiplication(num1,num2);
        System.out.println("Multiplication:"+mul);
                
        float div=calc.division(num1,num2);
        System.out.println("Division:"+div);
        
    }
}
