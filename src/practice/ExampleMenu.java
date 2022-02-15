package practice;
import java.util.Scanner;

public class ExampleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddressExample[] addressList = new AddressExample[1000];
        int offset=0;


        while(true){
            System.out.println("Welcome to Address Book, Press 1 for create new create new record, 2 for update, 3 for delete, 4 for exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice ==1 ){
                // create new address
                System.out.println("Enter name ");
                String name = scanner.nextLine();

                System.out.println("Enter address ");
                String address = scanner.nextLine();

                System.out.println("Enter city ");
                String city = scanner.nextLine();

                System.out.println("Enter country ");
                String country = scanner.nextLine();

                AddressExample addressExample = new AddressExample(name,address,city, country);

                if(offset <=1000){
                    addressList[offset] = addressExample;
                    offset++;
                    System.out.println("Address added");
                }
                else {
                    System.out.println("List full");
                }

            }

            else if (choice == 2){
                // update the existing address
                System.out.println("Enter name ");
                String name = scanner.nextLine();
                boolean flag= false;

                for(int i =0; i <offset;i++){
                    if(addressList[i].getName().equals(name)) {
                        flag=true;
                        System.out.println("Enter updated name ");
                        String updatedName = scanner.nextLine();
                        addressList[i].setName(updatedName);
                    }
                }
                if(flag)
                    System.out.println("record updated");
                else
                    System.out.println("record not found");

            }

            else if (choice == 3){
                // delete given address
                System.out.println("Enter name to delete");
                String nameToDelete = scanner.nextLine();
                boolean flag= false;

                for(int i =0; i <offset;i++){
                    if(addressList[i].getName().equals(nameToDelete)) {
                        flag=true;
                        addressList[i]=null;
                    }
                }
                if(flag)
                    System.out.println("record deleted");
                else
                    System.out.println("record not found");
            }

            else if (choice ==4){
                break;
            }
            else{
                System.out.println("wrong choice");
            }
        }
    }
}
