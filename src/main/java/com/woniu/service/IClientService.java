package com.woniu.service;

import com.woniu.entity.Client;

public interface IClientService {
	
	void save(Client client);
	void update(Client client);
	
	Client findByClientid(Integer clientid);
	Client findByCilentnameIdcard(String clientname,String idcard);
	

}
