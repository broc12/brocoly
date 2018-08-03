package com.khd.jejulantis.admin.carInfo.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;

@Repository
public class CarInfoDaoImpl implements CarInfoDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.carInfo";

	/*@Override
	public List<CustomerCenter> list(HashMap map) {
		List<CustomerCenter> list = sqlSession.selectList(ns+".mySelectAll",map);
		return list;
	}*/
	/*@Override
	public boolean carInsert(List<CarInfo> car) {
		Map< String, List<CarInfo> > carMap = new HashMap<String, List<CarInfo>>();
		carMap.put("car", car);
		System.out.println("size : "+car.size());
		int i = sqlSession.insert(ns+".myInsert", carMap);
		System.out.println("I size " +i );
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}*/
	@Override
	public boolean carInfoInsert(List<CarInfo> carInfoList) {
		Map< String, List<CarInfo> > carMap = new HashMap<String, List<CarInfo>>();
		carMap.put("car", carInfoList);
		for(int i = 0;i<carInfoList.size();i++) {
			System.out.println("b:"+carInfoList.get(i).getBranch_no()+" C:"+carInfoList.get(i).getCar_no()+" K:"+carInfoList.get(i).getCar_kind_no()+" bn:"+carInfoList.get(i).getCar_info_back_no());
			}
		System.out.println("size : "+carInfoList.size());
		int i = sqlSession.insert(ns+".mycarInfoListInsert", carMap);
		System.out.println("I size " +i );
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public boolean del(String car_info_no) {
		int i = sqlSession.delete(ns+".myDel", car_info_no);
		System.out.println("I size " +i );
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public boolean carInfoUpdate(CarInfo carInfo) {
		int i = sqlSession.update(ns+".myUpdate", carInfo);
		System.out.println("I size " +i );
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public List<CarInfoInsert> selectCarJoin(String manager_id) {
		List<CarInfoInsert> carInfoInsert = sqlSession.selectList(ns+".myAddSelect",manager_id);
		return carInfoInsert;
	}
	@Override
	public List<CarInfoSelect> selectList(String manager_id) {
		List<CarInfoSelect> carInfoList = sqlSession.selectList(ns+".mySelectAll",manager_id);
		return carInfoList;
	}
	@Override
	public CarInfo carInfoContent(String car_info_no) {
		CarInfo carInfoContent = sqlSession.selectOne(ns+".myCarInfoContent",car_info_no);
		return carInfoContent;
	}
	@Override
	public CarInfoInsert selectBranchNo(Integer car_kind_no) {
		System.out.println("car_kind_no = "+car_kind_no);
		CarInfoInsert carInfoInsert = sqlSession.selectOne(ns+".mySelectBrancNo",car_kind_no);
		return carInfoInsert;
	}
	
	
	
	/*@Override
	public boolean qnaDel(long qna_no) {
		int i = sqlSession.delete(nsQna+".myQnaDel", qna_no);
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public void replyUpdate(long qna_group) {
		sqlSession.update(nsQna+".myReplyUpdate", qna_group);
	}*/

}
