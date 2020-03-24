package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].sellIn -= 1;

            if (items[i].name.equals("Aged Brie")) {
                if (items[i].quality < 50) {
                    items[i].quality += 1;
                }
                continue;
            }

            if (items[i].name.equals("Backstage pass")) {
                if (items[i].sellIn >= 11) {
                    items[i].quality += 1;
                }
                if (items[i].sellIn <= 10 && items[i].sellIn > 5) {
                    items[i].quality += 2;
                }
                if (items[i].sellIn <= 5 && items[i].sellIn >= 1) {
                    items[i].quality += 3;
                }
                if (items[i].sellIn <= 0) {
                    items[i].quality = 0;
                }
                continue;
            }

            if (items[i].sellIn < 0) {
                items[i].quality -= 2;
            }

            if (items[i].sellIn >= 0) {
                items[i].quality -= 1;
            }

            if (items[i].quality > 50) {
                items[i].quality = 50;
            }

            if (items[i].quality < 0) {
                items[i].quality = 0;
            }

            if (items[i].name.equals("Sulfuras")) {
                continue;
            }
        }
    }
}
