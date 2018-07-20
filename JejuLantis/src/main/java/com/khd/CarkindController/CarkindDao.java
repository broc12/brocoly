package com.khd.CarkindController;

import java.util.List;
import com.khd.CarkindController.Carkind;

public interface CarkindDao {
	List<Carkind> carkind();
	void delete(String car_kind_no);
	List<Carkind> carkind(String car_kind_no);
	List<Carkind> carkindI();
	void insert(Carkind carkind);
	List<Carkind> carkindSelectBox(String car_kind_no);
	void update(Carkind carkind);
	List<Carkind> insuranceSelectBox();
	
}
