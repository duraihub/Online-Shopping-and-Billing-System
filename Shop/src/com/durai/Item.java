package com.durai;

public class Item {
private String site;
private int pant;
private int shirt;
private int shoe;
private int belt;
private int mrp;
private int total;
private Item i;

public Item(String site, int pant, int shirt, int shoe, int belt) {
	this.site = site;
	this.pant = pant;
	this.shirt = shirt;
	this.shoe = shoe;
	this.belt = belt;
	
}
public void item(Item i) {
	this.i=i;
}
public String getSite() {
	return site;
}

public int getPant() {
	return pant;
}

public int getShirt() {
	return shirt;
}

public int getShoe() {
	return shoe;
}

public int getBelt() {
	return belt;
}

public int getMrp() {
	total=pant+shirt+shoe+belt;
	return total;
}
public int getDiscount() {
	Discount d=new Discount();
	return d.discount(site,i);
}
public int getTotal() {
	int total=getMrp()-getDiscount();
	return total;
}
}
