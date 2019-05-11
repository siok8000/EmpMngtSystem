package com.neebal.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.neebal.entity.Address;
import com.neebal.entity.FourWheeler;
import com.neebal.entity.TwoWheeler;
import com.neebal.entity.UserDetails;
import com.neebal.entity.Vehicle;

public class Test {

	public static void main(String[] args) {
		/*UserDetails userDetails = new UserDetails();
		userDetails.setUserName("siok");*/
//		Address address1 = new Address();
//		address1.setAddress("Goregaon");
//		
//		Address address2 = new Address();
//		address2.setAddress("Goregaon");
//		
//		userDetails.getAddresses().add(address1);
//		userDetails.getAddresses().add(address2);
		
		TwoWheeler vehicle1 = new TwoWheeler();
		vehicle1.setName("ABC");
		vehicle1.setStreeringHandle("Bike");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setName("CDR");
		
		FourWheeler vehicle3 = new FourWheeler();
		vehicle3.setName("sdgsd");
		vehicle3.setStreeringWheel("Car");
		
/*		userDetails.getVehicles().add(vehicle1);
		userDetails.getVehicles().add(vehicle2);*/
		
		
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		session.save(userDetails);
		session.save(vehicle2);
		session.save(vehicle1);
		session.save(vehicle3);
		session.getTransaction().commit();
		session.close();
		
		
		
		
		

	}

}
