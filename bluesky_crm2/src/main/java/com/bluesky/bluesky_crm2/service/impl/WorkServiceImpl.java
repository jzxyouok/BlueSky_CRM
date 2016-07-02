package com.bluesky.bluesky_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bluesky.bluesky_crm2.model.Contract;
import com.bluesky.bluesky_crm2.model.Work;
import com.bluesky.bluesky_crm2.service.WorkService;
import com.bluesky.bluesky_crm2.mapper.WorkMapper;

/**
 * 工作服务层实现类
 * @author 刘光岳 
 * @date 2016年7月2日
 */
public class WorkServiceImpl  implements WorkService{
	
	@Autowired
	private WorkMapper workMapper;
 
	public void setWorkMapper(WorkMapper workMapper) {
		this.workMapper = workMapper;
	}

	@Override
	public void seeHouse(Work work) { 
		workMapper.seeHouse(work);
		
	}

	@Override
	public void addContract(Contract contract) { 
		workMapper.addContract(contract);
	}

	@Override
	public Contract selectContract() { 
		return workMapper.selectContract();
	}
	
}
