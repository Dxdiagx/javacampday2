package oopIntro;

public class Product {

     int id;
     String name;
     double unitPrice;
     String detail;

     public Product(int id,String name,double unitPrice,String detail){

          this.id=id;
          this.name=name;
          this.unitPrice=unitPrice;
          this.detail=detail;
     }
     public Product(){
          System.out.println("Overloading Method");
     }
}
