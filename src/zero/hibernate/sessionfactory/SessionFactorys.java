package zero.hibernate.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionFactorys
{
	public static SessionFactory sFactory = null;

	private SessionFactorys()
	{
	}

	public static class BuliderSessionFactor
	{
		static
		{
			System.out.println("Static SessionFactory");
			
			if (sFactory == null)
			{
				System.out.println("Static SessionFactory sFactory == null");
				//获得配置文件
				Configuration cfg = new Configuration().configure();
				//服务注册
				ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties())
						.buildServiceRegistry();
				//返回工厂
				sFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);

			}
		}
		
		public static SessionFactory getSessionFactory()
		{
			System.out.println("Static SessionFactory getSessionFactory()");
			return sFactory;
		}
	}


}
