package Java;
import java.util.Scanner;

public class New {
    static int N;
    static int M[];
    static Scanner Sc;

    public static void main(String[] args) {
        Sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang N = ");
        N = Sc.nextInt();
        M = new int[N];

        char c = 'y';
        while (c == 'y' || c == 'Y') {
            System.out.println("1. Nhap mang ");
            System.out.println("2. Xuat mang ");
            System.out.println("3. Tim x ");
            System.out.println("4. Xoa x ");
            System.out.println("5. Sap xep ");
            System.out.print("Chon 1-5: ");
            int Item = Sc.nextInt();
            Menu(Item);

            System.out.print("Nhap 'y' hoac 'Y' de tiep tuc, ky tu bat ky de thoat: ");
            Sc.nextLine(); // bỏ Enter thừa
            String line = Sc.nextLine();
            if (line.length() > 0) {
                c = line.charAt(0);
            } else {
                c = 'n';
            }
        }
        Sc.close();
    }

    static void nhap(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = Sc.nextInt();
        }
    }

    static void Xuat(int N) {
        for (int i = 0; i < N; i++)
            System.out.println("M[" + i + "] = " + M[i]);
    }

    static void tim(int N, int x) {
        boolean found = false;
        for (int i = 0; i < N && !found; i++)
            if (M[i] == x)
                found = true;
        if (found)
            System.out.println("Tim thay x trong mang M");
        else
            System.out.println("Khong tim thay x trong mang ");
    }

    static void xoa(int N, int x) {
        for (int i = 0; i < N - 1; i++)
            if (M[i] == x) {
                for (int j = i; j < N - 1; j++)
                    M[j] = M[j + 1];
                N--; // giảm số phần tử
                break;
            }
    }

    static void sapxep(int N) {
        for (int i = 0; i < N - 1; i++)
            for (int j = 0; j < N - 1 - i; j++)
                if (M[j] > M[j + 1]) {
                    int tam = M[j];
                    M[j] = M[j + 1];
                    M[j + 1] = tam;
                }
    }

    static void Menu(int Item) {
        switch (Item) {
            case 1:
                nhap(N);
                break;
            case 2:
                Xuat(N);
                break;
            case 3: {
                System.out.print("Nhap x can tim: ");
                int x = Sc.nextInt();
                tim(N, x);
                break;
            }
            case 4: {
                System.out.print("Nhap x can xoa: ");
                int x = Sc.nextInt();
                xoa(N, x);
                break;
            }
            case 5:
                sapxep(N);
                System.out.println("Mang da duoc sap xep.");
                break;
            default:
                System.out.println("Nhap sai! Moi ban chon tu 1-5.");
        }
    }
}
