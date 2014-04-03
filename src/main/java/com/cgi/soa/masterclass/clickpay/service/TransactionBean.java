package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;

/**
 * Session Bean implementation class TransactionBean
 */
@Stateless
public class TransactionBean implements TransactionBeanLocal {
	
	private float TRANSACTION_FEE_RATE = 0.03f;

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TransactionBean() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(TransactionEntity bean) {
		entityManager.persist(bean);

	}

	public void clear(TransactionEntity bean) {
		entityManager.persist(bean);
	}

	public void pay(TransactionEntity bean) {
		entityManager.persist(bean);
		
		//calculate fee
		float fee = bean.getAmount() * TRANSACTION_FEE_RATE;
//		FeeEntity feeEntity = new FeeEntity();
	}

}
