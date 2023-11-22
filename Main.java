
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        BinarySearchTree x = new BinarySearchTree();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("0 - exit");
            System.out.println("1 - add node");
            System.out.println("2 - sum");
            System.out.println("3 - size");
            System.out.println("4 - height");
            System.out.println("5 - search");
            System.out.println("6 - search2");
            System.out.println("7 - search min");
            System.out.println("8 - search min2");
            System.out.println("9 - delete min");
            System.out.println("11 - preOrder");
            System.out.println("22 - inOrder");
            System.out.println("33 - postOrder");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {
                case 0:
                    return;
                case 1:
                    System.out.print("New data: ");
                    int newData = input.nextInt();
                    x.addNode(newData);
                    break;
                case 2:
                    System.out.println("Sum: " + x.sum(x.root));
                    break;
                case 3:
                    System.out.println("Size: " + x.size(x.root));
                    break;
                case 4:
                    System.out.println("Height: " + x.height(x.root));
                    break;
                case 5:
                    System.out.print("What is the data you are looking at: ");
                    int data1 = input.nextInt();
                    if(x.search1(data1) == null){
                        System.out.println("--- null 1 ---");
                        break;
                    }else{
                        System.out.println("The value you are looking for is avaliable in the system.");
                    }
                    break;
                case 6:
                    System.out.print("What is the data you are looking at: ");
                    int data2 = input.nextInt();
                    if(x.search2(x.root, data2) == null){
                        System.out.println("--- null 2 ---");
                        break;
                    }else{
                        System.out.println("The value you are looking for is avaliable in the system.");
                    }
                    break;
                case 7:
                    System.out.println("Min: " + x.minSearch1().data);
                    break;
                case 8:
                    System.out.println("Min: " + x.minSearch2(x.root).data);
                    break;
                case 9:
                    x.deleteMin();
                    break;
                case 11:
                    x.preOrder(x.root);
                    System.out.println();
                    break;
                case 22:
                    x.inOrder(x.root);
                    System.out.println();
                    break;
                case 33:
                    x.postOrder(x.root);
                    System.out.println();
                    break;
            }
            System.out.println("--------------------------------------------------------------------");
        }

    }

}
