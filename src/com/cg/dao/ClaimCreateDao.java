package com.cg.dao;

import java.util.List;
import com.cg.model.Claim;

public interface ClaimCreateDao {

	public long insertClaim(Claim claim,long policy_number);
	public long insertClaim(Claim claim);
	public List<Claim> checkPolicyNumberExist(long policy_Number);
}
