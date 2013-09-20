package zero.hibernate.entity;

import java.io.Serializable;

public class BaseEntity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uu_id;
	
	public String getUu_id()
	{
		return uu_id;
	}

	public void setUu_id(String uu_id)
	{
		this.uu_id = uu_id;
	}

	
	public long getFlow_no()
	{
		return flow_no;
	}

	public void setFlow_no(long flow_no)
	{
		this.flow_no = flow_no;
	}

	private long flow_no;
}
