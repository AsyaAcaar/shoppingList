import java.util.Scanner;
import java.util.ArrayList; // we use this line for use array list class 
import java.util.Arrays; // we use this line for use arrays.aslist method.more effective than prices.add()...
public class shoppinglist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> shoppinglist=new ArrayList<>();
        ArrayList <String> products= new ArrayList<>(Arrays.asList("tea","honey","cheese","coffee","sugar","chocolate","apple","toothpaste","paper","milk"));
        ArrayList <Double> prices= new ArrayList<>(Arrays.asList(12.50,12.0,25.0,80.0,13.0,15.0,34.50,6.0,8.0,10.0));
        while(true){ //for infinite loop
        System.out.printf("Welcome to Shopping List!\nFor add product select 1;\nFor delete product select 2;\nFor list of product select 3\nFor total price select 4;");
        int operation=input.nextInt();
        switch(operation){
            case 1:
                input.nextLine();//we need to clear and pass the first enter.
                System.out.println("Which product you want to add?(\"tea\",\"honey\",\"cheese\",\"coffee\",\"sugar\",\"chocolate\",\"apple\",\"toothpaste\",\"paper\",\"milk)");
                String userProduct = input.nextLine();
                shoppinglist.add(userProduct);
                System.out.println("Your product has been added!");
                break;

            case 2:
                System.out.println("Which product you want to delete?");
                int userProduct2=input.nextInt();
                shoppinglist.remove(userProduct2-1);//to delete products and minus 1 because index starts from 0
                System.out.println("Product has been deleted successfully!");
                break;

            case 3:
                System.out.println("The list of product:"+ shoppinglist );
                break;

            case 4:
                double total= 0.0;
                for (String item:shoppinglist){//passing items one by one
                    int index = products.indexOf(item);//we need to match products with prices
                    if (index != -1){//if there is a product
                    total += prices.get(index);//get price of the product by index and add to total
                    }
                }

                    System.out.println("Total price is " + total);
                    break;

            }
    
        }
    }
}