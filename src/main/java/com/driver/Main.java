package com.driver;
public class Main
 {
   public static void main(String[] args)
   {
     B obj=new B();
     String s=obj.meth();
     System.out.println(s);
   }
   public static class A
   {
       public String meth()
       {
           return "Invoking method from class A";
       }
   }
   public static class B extends A
   {
       public String meth()
       {
           return "Method is overridden in Extendend class B";
       }
   }
 }