package com.model;


import java.util.List;
import java.util.Vector;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	public static Session hibernate()
	{
		Session ses=null;
		try 
		{
		Configuration cf=new Configuration();
		cf.configure("com\\xmlfiles\\config.xml");
		SessionFactory sf=cf.buildSessionFactory();
		ses=sf.openSession();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ses;
	}
	
	public int register_logics(Data d)
	{
		int res=0;
		d.getId();
		d.getFullname();
		d.getEmail();
		d.getPassword();
		
		Session ses=Dao.hibernate();
		Transaction t=ses.beginTransaction();
		ses.save(d);
		t.commit();
		System.out.println("Record Updated:");
		return res;
	}
	public Vector login_logics()
	{
		Vector v=new Vector();
		Session ses=Dao.hibernate();
		
		Query qry=ses.createQuery("from Data");
		List<Data> lis=qry.list();
		for(Data d: lis)
		{
			v.add(d.getEmail());
			v.add(d.getPassword());
		}
		
		return v;
	}
	
	public List fetch_profile()
	{
		Session ses=Dao.hibernate();
		Query qry=ses.createQuery("from Data");
		List<Data> lis=qry.list();
		
		return lis;
	}
	
}
