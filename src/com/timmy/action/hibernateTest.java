package com.timmy.action;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.timmy.advanced.Role;
import com.timmy.advanced.User;
import com.timmy.utils.Utils;

public class hibernateTest {
	private Session session=null;
	private Transaction tx=null;
   
	 @Test
	   public void updateRelation()
	   {
		   try {
			   //一个用户被删除，他的所有的角色也将会被删除。
				 session=Utils.getSessionFactory().openSession();
				 tx=session.beginTransaction();
				User user=(User) session.get(User.class, 3);
				Role role=(Role) session.get(Role.class, 1);
				user.getRoles().remove(role);
			//	session.delete(user);//持久层数据自动更新
				tx.commit();

		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
			
	   
	   
	   
	   
	   
 }
	   
	   @Test
	   public void delete()
	   {
		   try {
			   //一个用户被删除，他的所有的角色也将会被删除。
				 session=Utils.getSessionFactory().openSession();
				 tx=session.beginTransaction();
				User user=(User) session.get(User.class, 1);
				session.delete(user);
				tx.commit();

		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
			
	   
	   
	   
	   
	   
   }
	   
	   @Test
	   public void add()
	   {
		   try {
				 session=Utils.getSessionFactory().openSession();
				 tx=session.beginTransaction();
				 User user=new User();
				 user.setUsername("阿里巴巴");
				 user.setPassword("123456");
				 
				 
				 User user1=new User();
				 user1.setUsername("百度");
				 user1.setPassword("123456");
				 
				 User user2=new User();
				 user2.setUsername("腾讯");
				 user2.setPassword("123456");
				 
				 Role role=new Role();
				 role.setRolename("教师");
				 
				 
				 Role role1=new Role();
				 role1.setRolename("农民工");
				 
				 Role role2=new Role();
				 role2.setRolename("驾驶员");
				 user.getRoles().add(role);
				 user1.getRoles().add(role1);
				 user2.getRoles().add(role2);
				 user2.getRoles().add(role);
				 user2.getRoles().add(role1);

				 session.save(user);
				 session.save(user1);
				 session.save(user2);
				

				tx.commit();

		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
	   }
	
	   
	
	
}
