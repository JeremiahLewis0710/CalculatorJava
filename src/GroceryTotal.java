/**
 * Created by jeremiahlewis on 10/10/16.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class GroceryTotal {
    public void shoppingBill(){
        ArrayList<Double> myItemList = new ArrayList<>();
        while(true) {
            System.out.print("Please enter the price of your item: ");
            Scanner myItem = new Scanner(System.in);
            double pricing = myItem.nextDouble();
            myItemList.add(pricing);

            System.out.println("Would you like to add another item? y/n");
            Scanner choice = new Scanner(System.in);
            char yesno = choice.next().charAt(0);

            if(yesno == 'y'){
                continue;
            }
            else{
                for(double i : myItemList){
                    double sum = 0;
                     double total = sum + myItemList.get((int) i);
                    System.out.println(myItemList);
                    System.out.print(total);
                }
            }
        }




    }

}
