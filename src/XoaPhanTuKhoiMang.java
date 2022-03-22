import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int choice = -1;
        int[] array = {};
        int length;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Nhập độ dài của mảng");
            System.out.println("2. Nhập các phần tử của mảng");
            System.out.println("3. Nhập giá trị của phần tử muốn xóa");
            System.out.println("4. Nhập vị trí phần tử muốn xóa");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Độ dài của mảng là: ");
                    length = input.nextInt();
                    array = new int[length];
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Nhập giá trị phần tử của mảng: ");
                        array[i] = input.nextInt();
                        System.out.println("array[" + i + "]" + array[i]);
                    }
                    break;
                case 3:
                    System.out.println("Nhập giá trị phần tử muốn xóa");
                    int i_del = input.nextInt();
                    System.out.print("Mảng mới là: ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == i_del) {
                            if (array[i+1] != i_del) {
                                for (int j = i; j < array.length-1;j++) {
                                    array[j] = array[j + 1];
                                }
                                array[array.length-1] = 0;
                            } else if (array[i+1] == i_del) {
                                for (int j = i; j < array.length-2; j++) {
                                    array[j] = array[j+2];
                                }
                                array[array.length-1] = 0;
                                array[array.length-2] = 0;
                            }

                        }
                        System.out.print( " " + array[i] + " ");
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Nhập vị trí phần tử muốn xóa");
                    int index_del = input.nextInt();
                    System.out.print("Mảng mới là: ");
                    for (int i = index_del; i < array.length-1; i++) {
                        array[i] = array[i+1];
                    }
                    array[array.length-1]=0;
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(" " + array[i] + " ");
                    }
                    System.out.println(" ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
