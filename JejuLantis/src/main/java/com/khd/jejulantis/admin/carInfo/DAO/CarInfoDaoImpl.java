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

	@Override
	public boolean carInfoInsert(List<CarInfo> carInfoList) {
		/*Map< String, List<CarInfo> > carMap = new HashMap<String, List<CarInfo>>();
		carMap.put("car", carInfoList);
		int i = sqlSession.insert(ns+".mycarInfoListInsert", carMap);*/
		int i = 0;
		for(int j=0;j<carInfoList.size();j++) {
			i = sqlSession.insert(ns+".mycarInfoListInsert", carInfoList.get(j));
			sqlSession.update(ns+".myKindTotalCountByInsert", carInfoList.get(j).getCar_kind_no());
			sqlSession.update(ns+".myCarTotalCountByInsert", carInfoList.get(j).getCar_no());
		}
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public boolean del(String car_info_no) {
		long i = sqlSession.delete(ns+".myDel", car_info_no);
		boolean flag;
		if(i>0) {
			flag = true;
			sqlSession.update(ns+".myTotalKindCount", car_info_no);
			sqlSession.update(ns+".myTotalCarCount", car_info_no);
		}
		else flag = false;
		return flag;
	}
	@Override
	public boolean carInfoUpdate(CarInfo carInfo) {
		long i = sqlSession.update(ns+".myUpdate", carInfo);
		boolean flag;
		if(i>0) {
			flag =  true;
			sqlSession.update(ns+".myTotalKindCount", carInfo.getCar_info_no());
			sqlSession.update(ns+".myTotalCarCount", carInfo.getCar_info_no());
		}
		else flag = false;
		return flag;
	}
	@Override
	public List<CarInfoInsert> selectCarJoin(String manager_id) {
		HashMap map = new HashMap();
		map.put("manager_id", manager_id);
		List<CarInfoInsert> carInfoInsert = sqlSession.selectList(ns+".myAddSelect",map);
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
