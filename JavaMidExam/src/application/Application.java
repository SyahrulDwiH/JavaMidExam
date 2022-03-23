package application;

import data.*;

public class Application {
    public static void main(String[] args) {
        
        Axioo axioo = new Axioo("AXIOO MYBOOK 14 FHD Black", "Axioo", "Intel Celeron N3350", 
                "2", "DOS", "3", "HDD", 2);
        System.out.println("Laptop Axioo");
        System.out.println(axioo);
        axioo.getDisplay();
        axioo.getGraphic();
        
        
        Dell dell = new Dell("Dell Inspiron 3493", "Dell", "Intel Core i3-1005G1", 
                "2", "DOS", "4", "SSD M.2", -2);
        System.out.println("\nLaptop Dell");
        System.out.println(dell);
        dell.getDisplay();
        dell.getGraphic();
    }
}
