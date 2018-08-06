package com.khd.jejulantis.client.coupon.DAO;

import java.util.List;

import com.khd.jejulantis.model.Detail;

public interface DetailDAO {
	List<Detail>list(String member_id);
}
