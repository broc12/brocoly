package com.khd.jejulantis.admin.chart.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.chart.DAO.ChartDAO;

@Service
public class ChartServiceImpl implements ChartService{
	@Autowired
	private ChartDAO chartDAO;
	
	@Override
	public HashMap chartService() {
		return chartDAO.chart();
	}
	
	@Override
	public HashMap finishService(long branch_no) {
		return chartDAO.finish(branch_no);
	}
}
