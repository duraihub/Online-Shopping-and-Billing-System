package com.durai;

public class Discount {
	
	public  int discount(String site,Item i) {
		
		switch (site) {
		case "Amazon":
			Amazon a =new Amazon(); 
			return a.discount(i);
		case "Flipkart"	:
			Flikart f=new Flikart();
			return f.discount(i);
		case "Snapdeal"	:
			Snapdeal s =new Snapdeal();
			return s.discount(i);
		default :
			Default d=new Default();
			return d.discount(i);
		}
	}
}
class Default{
	public int discount(Item i) {
		return 0;
	}
}
class Amazon extends Default{
	public int discount(Item i) {
        int pant=i.getPant();
        int shirt=i.getShirt();
        int dis= ((pant * 40)/100)+(shirt*30)/100;
		return dis;
	}
}
class Flikart extends Default{
	public int discount(Item i) {
		int shoe=i.getShoe();
		int belt=i.getBelt();
		int dis=(shoe*20)/100+(belt*50)/100;
		return dis;
	}
}
class Snapdeal extends Default{
	public int discount(Item i) {
		int dis=(i.getPant()*50)/100+(i.getShirt()*20)/100+(i.getBelt()*10)/100+(i.getShoe()*20)/100;
		return dis;
	}
}