package day7;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class Main2 {
 public static void main(String[] args) {
     System.out.println("Try programiz.pro");
     for (int i = 1;i<=100; i++){
         if(i%7==0 || i % 10 == 7 || i / 10 == 7){
             System.out.println("clap");
         }else{
              System.out.println(i);
         }
     }
 }
}