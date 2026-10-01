class Student {

    private String name;
    private int age;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return name;
    }

    void setage(int age) {
        if (age > 0 && age < 100) {
            this.age = age;

        } else {
            System.out.println("please enter valid age");
        }
    }

    int getage() {
        return age;
    }

    void display() {
        System.out.println("the age is " + age + " the name is : " + name);
    }
}

class Product{
    private String productName;
    private int price;
    private int quantity;

    void setProductName(String productName){
        this.productName=productName;
    }

    void setPrice(int price){

        if(price>0){
            this.price=price;        
            }
            else{
                System.out.println("please enter valid price");
               
            }
    }

    void setQuantity(int quantity){
        if(quantity>0){
            this.quantity=quantity;
        }else{
            System.out.println("please enter valid quantity");
        }
  
    }
    String getproductName(){
        return productName;
    }
    int getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
    int getTotalPrice(){
        return price*quantity;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        // Student s = new Student();
        
        // s.setage(21);
        // s.getage();

        // s.setname("deepak");
        // s.getname();

        // s.display();

      //////////////////////
      
        Product p = new Product();
            p.setProductName("laptop");
            p.setPrice(50000);
            p.setQuantity(2);
    
            System.out.println("the product name is : " + p.getproductName());
            System.out.println("the product price is : " + p.getPrice());
            System.out.println("the product quantity is : " + p.getQuantity());
            System.out.println("the total price is : " + p.getTotalPrice());

    }
}
