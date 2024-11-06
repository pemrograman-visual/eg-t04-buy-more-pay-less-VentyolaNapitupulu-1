// 12S24039 - Jody Alfonso Siahaan
// 12S24042 - Ventyola Rohati Napitupulu

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int[] banyakbuku = new int[3];

        banyakbuku[0] = 0;
        banyakbuku[1] = 0;
        banyakbuku[2] = 0;
        double[] price = new double[3];

        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        double[] totalprice = new double[3];

        totalprice[0] = 0;
        totalprice[1] = 0;
        totalprice[2] = 0;
        double totalakhir1;
        int i;
        int banyakbuku0;
        int banyakbuku1;
        int banyakbuku2;

        i = 0;
        banyakbuku0 = 0;
        banyakbuku1 = 0;
        banyakbuku2 = 0;
        String buku0;
        String buku1;
        String buku2;

        buku0 = "Buku";
        buku1 = "Buku";
        buku2 = "Buku";
        int nol;
        int satu;
        int dua;

        nol = 0;
        satu = 1;
        dua = 2;
        do {
            iSBN[i] = input.nextLine();
            if (iSBN[i].equals("---")) {
                i = 3;
            } else {
                if (iSBN[i].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[i];
                    }
                    if (iSBN[0].equals(buku0)) {
                        i = 0;
                        price[i] = Double.parseDouble(input.nextLine());
                        banyakbuku[i] = Integer.parseInt(input.nextLine());
                        banyakbuku0 = banyakbuku0 + banyakbuku[i];
                        nol = 3;
                        i = i + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[0].equals(buku1)) {
                            i = 1;
                            price[i] = Double.parseDouble(input.nextLine());
                            banyakbuku[i] = Integer.parseInt(input.nextLine());
                            banyakbuku1 = banyakbuku1 + banyakbuku[i];
                            nol = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            price[i] = Double.parseDouble(input.nextLine());
                            banyakbuku[i] = Integer.parseInt(input.nextLine());
                            banyakbuku2 = banyakbuku2 + banyakbuku[i];
                            nol = 3;
                            i = 0;
                        }
                    }
                } else {
                    if (iSBN[i].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[1].equals(buku1)) {
                            i = 1;
                            price[i] = Double.parseDouble(input.nextLine());
                            banyakbuku[i] = Integer.parseInt(input.nextLine());
                            banyakbuku1 = banyakbuku1 + banyakbuku[i];
                            satu = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            price[i] = Double.parseDouble(input.nextLine());
                            banyakbuku[i] = Integer.parseInt(input.nextLine());
                            banyakbuku2 = banyakbuku2 + banyakbuku[i];
                            satu = 3;
                            i = 0;
                        }
                    } else {
                        if (iSBN[i].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[i];
                            }
                            if (iSBN[2].equals(buku2)) {
                                i = 2;
                                price[i] = Double.parseDouble(input.nextLine());
                                banyakbuku[i] = Integer.parseInt(input.nextLine());
                                banyakbuku2 = banyakbuku2 + banyakbuku[i];
                                dua = 3;
                                i = 0;
                            }
                        }
                    }
                }
            }
        } while (i < 3);
        if (banyakbuku0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (banyakbuku0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (banyakbuku0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        totalprice[0] = price[0] * banyakbuku0;
        if (banyakbuku1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (banyakbuku1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (banyakbuku1 >= 5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        totalprice[1] = price[1] * banyakbuku1;
        if (banyakbuku2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (banyakbuku2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (banyakbuku2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        totalprice[2] = price[2] * banyakbuku2;
        totalakhir1 = totalprice[0] + totalprice[1] + totalprice[2];
        System.out.println(toFixed(totalakhir1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
