package ru.topacademy.lesson3;

import java.util.Scanner;

/*
Задача: Написать программу на Java, которая выполняет конвертацию массы, валют и температуры, используя Scanner для ввода данных от пользователя и выбор типа конвертации.
Условия задачи:
        1. Программа должна предложить пользователю выбрать тип конвертации:
        1 для конвертации массы
2 для конвертации валюты
3 для конвертации температуры

2. Для конвертации массы:
Предложите конвертацию килограммов в фунты и наоборот.
1 кг = 2.20462 фунтов.

3. Для конвертации валюты:
Конвертация рублей в доллары и обратно.
        1 доллар = 100 рублей (можно изменить курс на актуальный, если нужно).

        4. Для конвертации температуры:
Конвертация из Цельсия в Фаренгейт и наоборотMes*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Выберите что нужно перевести: \
                
                 1 - масса\
                
                 2 - валюта\
                
                 3 - температура""");
        int variantNumber = scanner.nextInt();

        if (variantNumber == 1) {
            System.out.println("""
                    Выберите что нужно перевести: \
                    
                     1 - кг->фунты\
                    
                     2 - фунты->кг""");
            int variantNumberWeight = scanner.nextInt();

            if (variantNumberWeight == 1) {
                System.out.println("Введите массу: ");
                int kg = scanner.nextInt();
                System.out.println("фунты = " + (kg * 2.20462));
            } else if (variantNumberWeight == 2) {
                System.out.println("Введите массу: ");
                int pounds = scanner.nextInt();
                System.out.println("киллограммы = " + (pounds * 0.453592));
            }

        } else if (variantNumber == 2) {
            System.out.println("""
                    Выберите что нужно перевести: \
                    
                     1 - рубли->доллары\
                    
                     2 - доллары->рубли""");
            int variantNumberMoney = scanner.nextInt();

            if (variantNumberMoney == 1) {
                System.out.println("Введите сумму: ");
                int rub = scanner.nextInt();
                System.out.println("доллары = " + (rub * 0.010824));
            } else if (variantNumberMoney == 2) {
                System.out.println("Введите сумму: ");
                int usd = scanner.nextInt();

                System.out.println("рубли = " + (usd / 92.39));
            }

        } else if (variantNumber == 3) {
            System.out.println("""
                    Выберите что нужно перевести: \
                    
                     1 - Цельсия->Фаренгейт\
                    
                     2 - Фаренгейт->Цельсия""");
            int variantNumberDegrees = scanner.nextInt();

            if (variantNumberDegrees == 1) {

                System.out.println("Введите Цельсию: ");
                int celsius = scanner.nextInt();
                System.out.println("Фаренгейт = " + ((celsius * 9 / 5) + 32));
            } else if (variantNumberDegrees == 2) {
                System.out.println("Введите Фаренгейты: ");
                int fahrenheit = scanner.nextInt();
                System.out.println("Цельсию = " + ((fahrenheit - 32) * 5 / 9));
            }
        }

        scanner.close();
    }
}