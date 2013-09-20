package zero.hibernate.mysql.create.data;

import java.awt.event.ItemEvent;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.persistence.criteria.Order;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import zero.hibernate.entity.Customes;
import zero.hibernate.entity.Items;
import zero.hibernate.entity.Orders;
import zero.hibernate.sessionfection.SessionFactorys;

public class CreateData
{

	public static void main(String[] args)
	{
		SessionFactory sFactory = SessionFactorys.BuliderSessionFactor.getSessionFactory();
		CreateData createData = new CreateData();
		
		
//		createData.createCustome(sFactory);
//		createData.createItems(sFactory);
		createData.createOrders(sFactory);
	}

	private void createCustome(SessionFactory sFactory)
	{
		long b = System.currentTimeMillis();
		
		Session session = sFactory.openSession();
		Random r = new Random();
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < 500; i++)
		{
			if(i==100){
				session.flush();
				session.clear();
			}
			Customes customes = new Customes();
			customes = this.getCustomes();
			session.save(customes);
		}
		tx.commit();
		session.close();
		long e = System.currentTimeMillis();
		System.out.println("   >> "+(e-b)/1000.0);
	}

	
	
	
	
	private void createOrders(SessionFactory sFactory)
	{
		long b = System.currentTimeMillis();
		
		Random r = new Random();
		
		Customes customes = this.getCustomes();
		Set<Items> set = new HashSet<Items>();
		set = this.getItemsHavID(sFactory);
		
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < 50; i++)
		{
			if(i==100){
//				session.flush();
//				session.clear();
			}
			Orders orders = new Orders();
			
			orders.setCreateDate(new java.sql.Date(new Date().getTime()));
			if(i==12){
				customes = this.getCustomes();
				session.save(customes);
			}
			orders.setCustomes(customes);
//			orders.setItems(set);
			orders.setInfo(UUID.randomUUID().toString());
			orders.setPrice(r.nextDouble());
			orders.setQty(r.nextDouble());
			orders.setFlow_no(r.nextInt(19560)*10);
			session.save(orders);
		}
		tx.commit();
		session.close();
		long e = System.currentTimeMillis();
		System.out.println("   >> "+(e-b)/1000.0);
	}
	
	
	
	private void createItems(SessionFactory sFactory)
	{
		Random r = new Random();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < 500; i++)
		{
				Items items = new Items();
				items = this.getItems();
				session.save(items);
		}
		tx.commit();
		session.close();
	}
	
	
	private Customes getCustomes(){
		Random r = new Random();
		Customes customes = new Customes();
		customes.setAdds(UUID.randomUUID().toString());
		customes.setAge(r.nextInt(100));
		customes.setBrathDate(new java.sql.Date(new Date().getTime()));
		customes.setFlow_no(r.nextLong()*1L);
		customes.setName(UUID.randomUUID().toString());
		customes.setPhone("+86-168"+String.valueOf((r.nextInt(10)*10))+String.valueOf((r.nextInt(10)*10)));
		return customes;
	}
	
	private Items getItems(){
		Random r = new Random();
		Items items = new Items();
		items.setName(UUID.randomUUID().toString().substring(8));
		items.setNameOther(UUID.randomUUID().toString().substring(8));
		items.setSpec("ASD-"+r.nextInt(100)*1000);
		items.setUnit("U-"+r.nextInt(100)*1000);
		return items;
	}
	
	private Set<Items> getItemsHavID(SessionFactory sFactory){
		Set<Items> set = new HashSet<Items>();
		Session session =sFactory.openSession();
		List<Items> list = session.createQuery(" SELECT its FROM Items AS its ").list();
		for (Items items : list)
		{
			set.add(items);
		}
		session.flush();
		session.clear();
		session.close();
		return set;
	}
	
	
}
