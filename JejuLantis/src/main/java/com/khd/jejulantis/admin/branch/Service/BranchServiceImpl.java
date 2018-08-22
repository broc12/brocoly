package com.khd.jejulantis.admin.branch.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.branch.DAO.BranchDAO;
import com.khd.jejulantis.model.Branch;

@Service
public class BranchServiceImpl implements BranchService{
	@Autowired
	private BranchDAO branchDAO;
	@Override
	public List<Branch>listService(){
		return branchDAO.list();
	}
	@Override
	public void insertService(Branch branch) {
		branchDAO.insert(branch);
	}
	@Override
	public List<Branch>subjectService(long branch_no){
		return branchDAO.subject(branch_no);
	}
	@Override
	public List<Branch>fullService(long branch_no){
		return branchDAO.full(branch_no);
	}
	@Override
	public void modifyService(Branch branch) {
		branchDAO.modify(branch);
	}
	@Override
	public void withdrawService(long branch_no) {
		branchDAO.withdraw(branch_no);
	}
	@Override
	public void modifyService(int branch_no, double branch_set1) {
		branchDAO.modify(branch_no, branch_set1);
	}
}
