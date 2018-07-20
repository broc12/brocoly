package com.khd.branch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.khd.branch.Branch;
import com.khd.branch.BranchDAO;

@Service
public class BranchServiceImpl implements BranchService{
	@Autowired
	private BranchDAO branchDAO;
	@Override
	public List<Branch>listService(){
		return branchDAO.list();
	}
}
