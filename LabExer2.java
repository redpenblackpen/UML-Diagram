import java.util.Scanner;

public class LabExer2 {
    
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;
    private String getTotalCost;
    
    public LabExer2(){
    
    }
    
    public void setItemName(String newItemName){
        
        this.itemName = newItemName;
        
    }
    
    public void setTotalCost(int quantity, double price){
        
        this.itemQuantity = quantity;
        this.itemPrice = price;
    
    }
    
    public String getItemName(){
        
        return itemName;
    
    }
    
    public double getTotalCost(int a, double b){
        
        double c = a * b;
        return c;
       
    
    }
    
    public void readInput(){
        
        
    Scanner input  = new Scanner(System.in);
    
     System.out.println("Enter the name of item you are purchasing");
     itemName = input.nextLine();
    
     System.out.println("Enter quantity and price");
     itemQuantity = input.nextInt();
     itemPrice = input.nextDouble();

}
    
    public void writeOutput(){
    
    
    amountDue = getTotalCost(itemQuantity, itemPrice);
            
    System.out.println("You are purchasing " + itemQuantity + " bag(s) " + "at " + itemPrice + " each ");
    System.out.printf("Amount due is  + %.2f", amountDue);
     
    }
    
    
    public static void main(String[] args) {
       
           

       LabExer2 s = new LabExer2();
       
       s.readInput();
       s.writeOutput();
       
      
       
      
    }
    
}
