 

import java.util.Scanner;

public class PizzaDashboard {

    public static void main(String[] args) {
        
        PizzaStore pizzaStore = new PizzaStore(1, "Pizza Hut", "Surabaya");
        PizzaInterface pizzaService = new PizzaService(pizzaStore);
        
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Halo, selamat datang di toko pizza !!!\n");
                System.out.println("Pilih menu : \n1) Tambahkan pizza \n2) Atur harga pizza \n3) Menghapus menu pizza "
                    + "\n4) Keluar");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

            case 1: {

                System.out.println("\n<=>Tambahkan menu pizza baru<=>\n");
                System.out.println(
                        "Masukkan detail dari toping, tingkat kepedasan(nol, sedang, tinggi), deskripsi singkat dari toping");
                String[] pizzaTopping = scanner.nextLine().split(",");
                Topping topping = new Topping(pizzaTopping[0], pizzaTopping[1], pizzaTopping[2]);

                System.out.println(
                        "Masukkan detail dari adonan pizza, jenis(tebal / tipis), deskripsi dari adonan pizza");
                String[] pizzaBases = scanner.nextLine().split(",");
                PizzaBase pizzaBase = new PizzaBase(pizzaBases[0], pizzaBases[1], pizzaBases[2]);

                System.out.println(
                        "Masukkan detail dari nama pizza, harga, ukuran(small/Medium/Large)");
                String[] pizzaDetails = scanner.nextLine().split(",");
                Pizza pizza = new Pizza(1, pizzaDetails[0], Double.parseDouble(pizzaDetails[1]), pizzaDetails[2],
                        topping, pizzaBase);

                pizzaService.addNewPizza(pizza);
                System.out.println("Menu pizza baru berhasil ditambahkan !!!\n\n" + pizza + "\n");
                break;
            }
            case 2: {

                System.out.println("\n<=>Update harga pizza<=>\n");
                System.out.println("Masukkan nama pizza : ");
                String pizzaName = scanner.next();
                System.out.println("Masukkan harga pizza yang baru : ");
                double price = scanner.nextDouble();
                System.out.println("Detail pizza berhasil diubah !!!");    
                break;
            }
            case 3: {

                System.out.println("\n<=>Menghapus menu pizza<=>\n");
                System.out.println("Masukkan nama pizza : ");
                String pizzaName = scanner.next();

                System.out.println("Pizza berhasil dihapus !!!");
                break;
            }

            case 4: {
                System.out.println("Terimakasih !!!");
                return;
            }
            default: {
                System.out.println("Opsi salah, coba yang lain !!!");
                break;
            }
            }
            }
        } catch (Exception exception) {
            System.err.println(exception);
        }
    }
}