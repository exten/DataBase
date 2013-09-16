package zero.hibernate.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class HiberSechame
{
	
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration().configure();
		SchemaExport sExport = new SchemaExport(configuration);
//		sExport.drop(false, true);
		sExport.create(true,true);
	}
}
