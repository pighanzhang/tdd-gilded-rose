package cn.xpbootcamp.gilded_rose;

public class Item {
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String toString() {
        return this.name + ": 保质期->" + this.sellIn + "; 价值->" + this.quality;
    }
}
