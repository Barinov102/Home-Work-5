package Lesson5;
import java.util.Scanner;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
                Spisok[] koLichestvo = new Spisok[5];
                koLichestvo[0] = new Spisok("Petr", "Starshi master", "vk@primer,ru", "+79996665544", 25000, 35);
                koLichestvo[1] = new Spisok("Ivan", "Securiti", "vz@primer,ru", "+79998884455", 27000, 32);
                koLichestvo[2] = new Spisok("Dima", "Zamestitel stolovoi", "dm@primer,ru", "+79997771234", 29000, 61);
                koLichestvo[3] = new Spisok("Fillip", "Frilanser", "ol@primer,ru", "+79995554789", 32000, 55);
                koLichestvo[4] = new Spisok("Shahnozar", "Direktor firmi", "kv@primer,ru", "+79994445896", 138000000, 20);

                Scanner scan = new Scanner(System.in);
                System.out.println(koLichestvo);

                for (int i = 0; i < koLichestvo.length; i++) {
                    if (koLichestvo[i].age > 40) koLichestvo[i].print();
                }
        }
}



