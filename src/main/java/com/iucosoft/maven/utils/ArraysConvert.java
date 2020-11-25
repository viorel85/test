
package com.iucosoft.maven.utils;

/**
 *
 * @author Viorel
 */
public class ArraysConvert {
    public static String toString(String[] limbaje){
        StringBuilder sb = new StringBuilder();
        
        for(String s: limbaje){
            sb.append(s);  //scoatem in cuvint
            sb.append(","); //punem virgila
        }
        
        sb.trimToSize(); //?????
//        taie untima virgula
        if(sb.length()>0){ //daca este ceva in sb atunci
            sb.deleteCharAt(sb.length()-1); // stergem elementul cu index -1 de la coada
        }
//        
        return sb.toString(); // intoarcem un string
    }
    
}
