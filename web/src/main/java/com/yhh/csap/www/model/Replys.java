package com.yhh.csap.www.model;


import com.yhh.csap.Consts;
import com.yhh.csap.admin.model.User;
import com.yhh.csap.kits.DateKit;
import com.yhh.csap.www.model.base.BaseReplys;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Replys extends BaseReplys<Replys> {
	public static final Replys dao = new Replys().dao();

	@Override
	public String getTableName() {
		return "www_replys";
	}

	public User getReplyer(){
		return getUserId()!=null?User.dao.findSectUser(getUserId()):null;
	}
	public String getCAtTxt(){
		return getCAt()!=null?DateKit.dateToStr(getCAt(),DateKit.STR_DATEFORMATE):"";
	}

	public List<Replys> getSubReplys(){
		String sql="select * from "+getTableName()+" where dAt is null and rootReplyId=?";
		return dao.findByCache(Consts.CACHE_NAMES.replys.name(),"subReplys_"+getId(),sql,getId());
	}

	public String getReplyTarget(){
		StringBuilder stringBuilder=new StringBuilder();
		if (getRootReplyId().intValue()!=getReplyId().intValue()){
			Replys replys=dao.findFirstByCache(Consts.CACHE_NAMES.replys.name(),"findById_"+getReplyId(),"select * from "+getTableName()+" where id=?",getReplyId());
			User user=replys.getReplyer();
			String targetNickname=user!=null?user.getNickname():"";
			stringBuilder.append(getReplyer()!=null?getReplyer().getNickname():"").append(":回复").append("@").append(targetNickname);
		}
		return stringBuilder.toString();
	}
}
