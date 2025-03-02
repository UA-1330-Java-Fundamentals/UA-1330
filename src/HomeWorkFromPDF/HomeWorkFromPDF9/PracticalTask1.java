/*
Create a dynamic array containing objects of the HeavyBox class which includes int weight
and String contents fields. Output its contents using for-each loop.
• Change the weight of the first box by 1.
• Remove the last box.
• Output result to the console. Remove all boxes and output result to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF9;

import java.util.ArrayList;

class HeavyBox{
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents){
        this.contents = contents;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

public class PracticalTask1 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(23, "Books"));
        boxes.add(new HeavyBox(44, "Clothes"));
        boxes.add(new HeavyBox(12, "Tools"));

        for (HeavyBox heavyBox : boxes) {
            System.out.println("Контекст коробки: " + heavyBox.getContents());
        }

        System.out.println("До зміни: " + boxes.get(2).getWeight());
        boxes.get(2).setWeight(boxes.get(2).getWeight() + 1);
        System.out.println("Після зміни: " + boxes.get(2).getWeight());

        boxes.remove(boxes.size() - 1);
        for (HeavyBox heavyBox : boxes) {
            System.out.println("Контекст коробки після видалення останнього елементу: " + heavyBox.getContents());
        }

        boxes.clear();
        for (HeavyBox heavyBox : boxes) {
            System.out.println("Контекст коробки після очищення усіх елементів: " + heavyBox.getContents());
        }
    }
}
