/*
 * Ad Soyad: Muhammed Metin Kızıl
 * Ogrenci No: 250541038
 * Tarih: 13.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

package GeoSekilHesaplayici;

import java.util.Scanner;

public class GeoSekilHesaplayici {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // --- 1. ADIM: TUM VERILERI TOPLA ---

        System.out.println("Lutfen tum sekillerin bilgilerini girin:");

        // Kare bilgisi
        System.out.println("\nKarenin kenar uzunluğunu (cm) giriniz:");
        double kare_kenar = scan.nextDouble();

        // Dikdörtgen bilgileri
        System.out.println("\nDikdörtgenin kısa kenarını (cm) giriniz:");
        double kisa_kenar = scan.nextDouble();
        System.out.println("Dikdörtgenin uzun kenarını (cm) giriniz:");
        double uzun_kenar = scan.nextDouble();

        // Daire bilgisi
        System.out.println("\nDairenin yarıçapını (cm) giriniz:");
        double radius = scan.nextDouble();

        // Üçgen bilgileri
        System.out.println("\n--- Ucgen Alan Bilgileri ---");
        System.out.println("Üçgenin taban uzunluğunu (cm) giriniz:");
        double taban = scan.nextDouble();
        System.out.println("Üçgenin yüksekliğini (cm) giriniz:");
        double yukseklik = scan.nextDouble();

        System.out.println("\n--- Ucgen Cevre Bilgileri ---");
        System.out.println("Üçgenin 1. kenarını (cm) giriniz:");
        double a = scan.nextDouble();
        System.out.println("Üçgenin 2. kenarını (cm) giriniz:");
        double b = scan.nextDouble();
        System.out.println("Üçgenin 3. kenarını (cm) giriniz:");
        double c = scan.nextDouble();

        // --- 2. ADIM: TUM HESAPLAMALARI YAP ---

        // Kare
        double kare_alan = calculateSquareArea(kare_kenar);
        double kare_cevre = calculateSquarePerimeter(kare_kenar);

        // Dikdörtgen
        double dikdortgen_alan = calculateRectangleArea(uzun_kenar, kisa_kenar);
        double dikdortgen_cevre = calculateRectanglePerimeter(uzun_kenar, kisa_kenar);

        // Daire
        double daire_alan = calculateCircleArea(radius);
        double daire_cevre = calculateCircleCircumference(radius);

        // Üçgen
        double ucgen_alan = calculateTriangleArea(taban, yukseklik);
        double ucgen_cevre = calculateTrianglePerimeter(a, b, c);


        // --- 3. ADIM: SONUCLARI TABLO OLARAK YAZDIR ---
        // Sizin istediğiniz formatlama burada uygulanıyor.

        System.out.println("\n========================================");
        System.out.println("          HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        // Kare Sonuçları
        // (Değişken adları sizin örneğinizden farklı olduğu için kendi adlarımızı kullandım: kare_kenar)
        System.out.printf("\nKARE (kenar: %.2f cm):\n", kare_kenar);
        System.out.printf("\tAlan: \t\t%.2f cm²\n", kare_alan);
        System.out.printf("\tCevre: \t\t%.2f cm\n", kare_cevre);

        // Dikdörtgen Sonuçları
        // (Değişken adları: uzun_kenar, kisa_kenar)
        System.out.printf("\nDIKDORTGEN (%.2f x %.2f cm):\n", uzun_kenar, kisa_kenar);
        System.out.printf("\tAlan: \t\t%.2f cm²\n", dikdortgen_alan);
        System.out.printf("\tCevre: \t\t%.2f cm\n", dikdortgen_cevre);

        // Daire Sonuçları
        // (Değişken adı: radius)
        System.out.printf("\nDAIRE (yaricap: %.2f cm):\n", radius);
        System.out.printf("\tAlan: \t\t%.2f cm²\n", daire_alan);
        System.out.printf("\tCevre: \t\t%.2f cm\n", daire_cevre);

        // Üçgen Sonuçları
        // (Değişken adları: taban, yukseklik)
        System.out.printf("\nUCGEN (taban: %.2f, yukseklik: %.2f cm):\n", taban, yukseklik);
        System.out.printf("\tAlan: \t\t%.2f cm²\n", ucgen_alan);
        // Çevre farklı kenarları kullandığı için ayrıca belirttim
        System.out.printf("\tCevre (%.1f, %.1f, %.1f): \t%.2f cm\n", a, b, c, ucgen_cevre);

        System.out.println("\n========================================");

        scan.close(); // Scanner en sonda kapatılıyor
    }

    // --- Hesaplama Metotları (Değişiklik Yok) ---

    // --- Kare Metotları ---
    public static double calculateSquareArea(double kenar_uzunlugu) {
        return Math.pow(kenar_uzunlugu, 2);
    }
    public static double calculateSquarePerimeter(double x) {
        return 4 * x;
    }

    // --- Dikdörtgen Metotları ---
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // --- Daire Metotları ---
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // --- Üçgen Metotları ---
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
