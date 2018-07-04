package com.khd.customerCenterService;

import com.khd.model.*;
import java.util.*;

public interface CustomerCenterService {
	List<CustomerCenter> list(HashMap map);
	long totalNum();
}
