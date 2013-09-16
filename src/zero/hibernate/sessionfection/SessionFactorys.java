package zero.hibernate.sessionfection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionFactorys
{
	public static SessionFactory sFactory = null;

	private SessionFactorys()
	{
		// TODO Auto-generated constructor stub
	}

	public static class BuliderSessionFactor
	{
		static
		{
			System.out.println("Static SessionFactory");
			
			if (sFactory == null)
			{
				//��������ļ�
				Configuration cfg = new Configuration().configure();
				//����ע��
				ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties())
						.buildServiceRegistry();
				//���ع���
				sFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

			}
		}
		
		public static SessionFactory getSessionFactory()
		{
			return sFactory;
		}
	}


}
