package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void dog() {
        Item[] items = new Item[] {
                new Item("dog", 10, 20)
        };

        GildedRose gildedRose = new GildedRose(items);

        assertEquals("dog", gildedRose.items[0].name);
        assertEquals(10, gildedRose.items[0].sellIn);
        assertEquals(20, gildedRose.items[0].quality);
    }

    @Test
    void cat() {
        Item[] items = new Item[] {
                new Item("cat", 20, 30)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(19, gildedRose.items[0].sellIn);
        assertEquals(29, gildedRose.items[0].quality);
    }

    @Test
    void agedBrie1() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 30)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(9, gildedRose.items[0].sellIn);
        assertEquals(31, gildedRose.items[0].quality);
    }

    @Test
    void agedBrie2() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 0, 30)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(31, gildedRose.items[0].quality);
    }

    @Test
    void agedBrie3() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 0, 50)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(50, gildedRose.items[0].quality);
    }

    @Test
    void agedBrie4() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 0, 49)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(50, gildedRose.items[0].quality);
    }

    @Test
    void sulfuras1() {
        Item[] items = new Item[] {
                new Item("Sulfuras", 0, 100)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(50, gildedRose.items[0].quality);
    }

    @Test
    void backstagePass1() {
        Item[] items = new Item[] {
                new Item("Backstage pass", 20, 30)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(19, gildedRose.items[0].sellIn);
        assertEquals(31, gildedRose.items[0].quality);
    }

    @Test
    void backstagePass2() {
        Item[] items = new Item[] {
                new Item("Backstage pass", 10, 20)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(9, gildedRose.items[0].sellIn);
        assertEquals(22, gildedRose.items[0].quality);
    }

    @Test
    void backstagePass3() {
        Item[] items = new Item[] {
                new Item("Backstage pass", 5, 40)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(4, gildedRose.items[0].sellIn);
        assertEquals(43, gildedRose.items[0].quality);
    }

    @Test
    void backstagePass4() {
        Item[] items = new Item[] {
                new Item("Backstage pass", 1, 40)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.items[0].sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }

    @Test
    void backstagePass5() {
        Item[] items = new Item[] {
                new Item("Backstage pass", 0, 40)
        };

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }
}
