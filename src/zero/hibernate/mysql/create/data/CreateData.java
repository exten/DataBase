package zero.hibernate.mysql.create.data;

import java.util.Date;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import zero.hibernate.entity.Customes;
import zero.hibernate.sessionfection.SessionFactorys;

public class CreateData
{

	public static void main(String[] args)
	{
		Session session = SessionFactorys.BuliderSessionFactor.getSessionFactory().openSession();
		CreateData createData = new CreateData();
		createData.createCustome(session);
	}

	private void createCustome(Session session)
	{
		

		Random r = new Random();
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < 500; i++)
		{
			if(i==100){
				session.flush();
				session.clear();
			}
			Customes customes = new Customes();
			customes.setAdds(String.valueOf((char)(r.nextInt(1000)*10)));
			customes.setAge(r.nextInt(100));
			customes.setBrathDate(new java.sql.Date(new Date().getTime()));
			customes.setFlow_no(r.nextLong()*1L);
			customes.setNmae(String.valueOf((char)(r.nextInt(1000)*10)));
			customes.setPhone("+86-168"+String.valueOf((char)(r.nextInt(1000)*10))+String.valueOf((char)(r.nextInt(1000)*10)));
		}
		tx.commit();
		session.close();
	}

}
