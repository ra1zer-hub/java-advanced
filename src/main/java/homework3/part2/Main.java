package homework3.part2;

import homework3.part2.sweets.Candy;
import homework3.part2.sweets.Cookies;
import homework3.part2.sweets.Lollipop;
import homework3.part2.sweets.Sweetness;

/**
 * @author Artamonov Aleksandr
 */

public class Main {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Raffaello", 80, 150, true);
        Candy candy2 = new Candy("Pergale Caramel", 120, 230, false);
        Lollipop lollipop1 = new Lollipop("Чупа-чупс", 20, 30, "Апельсин");
        Lollipop lollipop2 = new Lollipop("Леденец", 35, 90, "Карамель");
        Cookies cookies1 = new Cookies("Milka", 156, 185, "Шоколад");
        Cookies cookies2 = new Cookies("Бискотти", 235, 140, "Вишневый мармелад");
        Sweetness[] sweetGift = {candy1, candy2, lollipop1, lollipop2, cookies1, cookies2};

        int totalWeight = 0;
        double totalPrice = 0;
        System.out.println("В подарке находятся следующие сладости: ");
        for (Sweetness someSweetness: sweetGift) {
            totalWeight += someSweetness.getWeight();
            totalPrice += someSweetness.getPrice();
            System.out.println(someSweetness);
        }
        System.out.println("\nОбщий вес подарка: " + totalWeight + " г., стоимость подарка: " + totalPrice + " руб.");
    }
}
