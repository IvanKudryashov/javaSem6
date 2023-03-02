package sem6;
import java.util.*;

public class Laptop {
  public static void main(String[] args) {
    System.out.println("Добро пожаловать в магазин ноутбуков! ");
    System.out.println(
            "Выберите действие: \n Нажмите 1, чтобы распечатать все товары; \n Нажмите 2 для поиска по каталогу; \n Нажмите 0 для выхода из магазина.");

    Scanner iScanner = new Scanner(System.in, "cp866");
    int userInput = iScanner.nextInt();

    HashSet<Components> notebookSet = new HashSet<Components>();

    Components notebook_1 = new Components(12345, "ASUS", "ASUS X515EA-BQ1461W", "8GB", "256GB",
            "Windows11", 36069);
    Components notebook_2 = new Components(23456, "Apple", "Apple MacBook Air 13 2022", "8GB", "256GB",
            "macOS", 94990);
    Components notebook_3 = new Components(34567, "Acer", "Acer Aspire 7 A715-42G-R427", "16GB", "512GB",
            "Windows11", 92134);
    Components notebook_4 = new Components(45678, "Dell", "Dell Alienware M15 R5", "16GB", "1TB",
            "Windows11", 159000);

    notebookSet.add(notebook_1);
    notebookSet.add(notebook_2);
    notebookSet.add(notebook_3);
    notebookSet.add(notebook_4);

    switch (userInput) {
        case 1:
            for (Components i : notebookSet) {
                System.out.println(i);
            }
            break;
        case 2:
            System.out.println(
                    "Введите цифру, соответствующую критерию поиска: \n 1 - производитель \n 2 - объем RAM \n 3 - объем HDD \n 4 - операционная система");
            int usersInput = iScanner.nextInt();
            switch (usersInput) {
                case 1:
                    System.out.println("Введите название производителя(Asus/Apple/Acer/Dell):");
                    String manufacturerInput = iScanner.next();
                    List<Components> queryNotebook = notebook_4.findNotebook(notebookSet, manufacturerInput);
                    for (Components i : queryNotebook) {
                        System.out.println(
                                "Ноутбук производителя = " + manufacturerInput + ": \n" + i.toString());
                    }
                    break;
                case 2:
                    System.out.println("Введите RAM ноутбука(8GB/16GB):");
                    String RAMInput = iScanner.next();
                    List<Components> queryNotebook2 = notebook_4.findNotebook(notebookSet, RAMInput);
                    for (Components i : queryNotebook2) {
                        System.out.println("Ноутбук с RAM = " + RAMInput + ": \n" + i.toString());
                    }
                    break;
                case 3:
                    System.out.println("Введите HDD ноутбука(256GB/512GB/1TB):");
                    String HDDInput = iScanner.next();
                    List<Components> queryNotebook3 = notebook_4.findNotebook(notebookSet, HDDInput);
                    for (Components i : queryNotebook3) {
                        System.out.println("Ноутбук с HDD = " + HDDInput + ": \n" + i.toString());
                    }
                    break;
                case 4:
                    System.out.println("Введите операционную систему ноутбука(MacOS/Windows11):");
                    String OSInput = iScanner.next();
                    List<Components> queryNotebook4 = notebook_4.findNotebook(notebookSet, OSInput);
                    for (Components i : queryNotebook4) {
                        System.out.println(
                                "Ноутбук с операционной системой = " + OSInput + ": \n" + i.toString());
                    }
                    break;
            }
        case 0:
            break;
        default:
            System.out.println("Извините, такой операции нет");
            return;
    }
    iScanner.close();
}
}
