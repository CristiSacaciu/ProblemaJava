package com.company;
public class shoppingItem {

    private String ItemName;
    private double ItemPrice;
    private int ItemQty;

    public shoppingItem()
    {
        ItemName = "Fruit";
        ItemPrice = 100;
        ItemQty = 1;

    }

    public shoppingItem(String ItemName, double ItemPrice, int ItemQty )
    {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemQty = ItemQty;

    }


    public String getItemName() {
        return ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public double getItemTotalPrice() {
        return ItemPrice * ItemQty;
    }

    public int getItemQty() {
        return ItemQty;
    }

    public void setItemName(String ItemName)
    {
        this.ItemName = ItemName;
    }

    public void setItempPrice(double ItemPrice)
    {
        this.ItemPrice = ItemPrice;
    }

    public void setItemQty(int ItemQty)
    {
        this.ItemQty = ItemQty;
    }


    @Override
    public String toString()
    {
        return ItemName + " " + ItemPrice + " lei"  + " x " + ItemQty + " bucati ";
    }
}