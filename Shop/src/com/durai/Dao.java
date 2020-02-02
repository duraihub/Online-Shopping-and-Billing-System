package com.durai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {

public void insert(Item i) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/durai","root","3dmysql");
	String qurey="insert into shopidem(shopid,pant,shirt,shoe,belt,mrp,discount,total) values (?,?,?,?,?,?,?,?)";
	PreparedStatement p=con.prepareStatement(qurey);
	String site=i.getSite();
	switch(site) {
	case "Default" :
		p.setInt(1, 1);
		break;
	case "Amazon" :
		p.setInt(1, 2);
		break;
	case "Flipkart":
		p.setInt(1, 3);
		break;
	case "Snapdeal":
		p.setInt(1, 4);
		break;
	}
	p.setInt(2, i.getPant());
	p.setInt(3, i.getShirt());
	p.setInt(4, i.getShoe());
	p.setInt(5, i.getBelt());
	p.setInt(6, i.getMrp());
	p.setInt(7, i.getDiscount());
	p.setInt(8, i.getTotal());
	p.executeLargeUpdate();
p.close();
con.close();

	

}

}
