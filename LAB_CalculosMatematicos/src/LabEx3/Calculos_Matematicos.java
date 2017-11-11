package LabEx3;
public class Calculos_Matematicos {
    
    public int num;
    public int num2;
    public int num3;
    
    public Calculos_Matematicos(int num,int num2,int num3){
        this.num = num;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public int mcd_euclides(int num,int num2, int num3){
       if(num3 == 0){
           return num;
       }
       if(num2 == 0){
           return mcd_euclides(num3,num2,num%num3);
       }
       else{
           return mcd_euclides(num2,num%num2,num3);
       }
    }
    
   
}

