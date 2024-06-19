import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args) {
        int[] vector = new int[4];
        vector[0] = 20;
        vector[1]  = 30;
        vector[2] = 10;
        vector[3] = 0;
        int compra1 = 44;
        if (vector[3] == 0){ //suponiendo que la lista esta ordenada
        for (int i=0;i<vector.length;i++){
            if (vector[i] == 0){
               vector[i] = compra1;
            }
            }
        } else{
                int[] vectorAux = new int[vector.length * 2]; 
                for (int j=0;j<vectorAux.length;j++){
                    vectorAux[0] = 20;
                    vectorAux[7] = compra1;
                    vectorAux[1] = 30;
                    vectorAux[2] = 10;
                    vectorAux[3] = 15;
                    vector = vectorAux;
                }
        }
            
             
        
       for (int k=0;k<vector.length;k++){
          System.out.println(vector[k]);
        }
    }
}