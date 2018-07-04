package com.khd.customerCenterDAO;

import java.util.*;
import com.khd.model.*;

public interface CustomerCenterDao {
	List<CustomerCenter> list(HashMap map); 
	long totalNum();
}
