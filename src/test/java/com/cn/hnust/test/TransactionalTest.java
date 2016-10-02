package com.cn.hnust.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

/**
 * 
 * http://springinpractice.com/2008/03/18/annotation-based-transactions-in-spring
 * http://docs.spring.io/autorepo/docs/spring/4.2.x/spring-framework-reference/html/transaction.html
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Service
public class TransactionalTest {
		
	@Autowired
	private ApplicationContext ctx;
	@Autowired
	private IUserService userService;
	@Autowired
    private DataSourceTransactionManager transactionManager;
	
	@Test
	public void insert() {
		
		User user = new User();
		user.setId(2);
		user.setUserName("smile");
		user.setPassword("111111");
		user.setAge(1);
		
		insertUser(user);
		
//		ctx.getBean(this.getClass()).insertUser(user);
		
//		DefaultTransactionDefinition dtd = new DefaultTransactionDefinition();
//		dtd.setPropagationBehaviorName("PROPAGATION_REQUIRED");
//		dtd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
//      TransactionStatus status = transactionManager.getTransaction(dtd);
//		try{
//			insertUser(user);
//			if(status.isCompleted()){
//				transactionManager.commit(status);
//			}
//		}catch(Exception e){
//			if(!status.isCompleted()){
//				transactionManager.rollback(status);
//			}
//			e.printStackTrace();
//		}
	}
	
	public void insertUser(User user) {
		
		userService.insertUser(user);
		
	}
	
}
















