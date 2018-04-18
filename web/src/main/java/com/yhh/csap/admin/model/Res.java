package com.yhh.csap.admin.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.LogKit;
import com.yhh.csap.Consts;
import com.yhh.csap.admin.model.base.BaseRes;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Generated by JFinal.
 */
public class Res extends BaseRes<Res> {
	public static final Res dao = new Res().dao();

	public String listTree(List<Long> roleResIds) {

		List<Res> resList;
		resList = dao.find("select * from s_res  where pId=0 order by seq");
		JSONArray ja = new JSONArray();
		JSONObject jo;
		for (Res res : resList) {
			jo = new JSONObject();
			jo.put("id", res.getId());
			jo.put("pId", res.getPid());
			jo.put("title", res.getName());
			jo.put("expand", true);
			jo.put("url", res.getUrl());
			jo.put("seq", res.getSeq());
			jo.put("checked", (roleResIds != null && roleResIds.contains(res.getId())) ? true : false);
			jo.put("description", res.getDescription());
			jo.put("logged", res.getLogged());
			if(dao.getChildren(jo, roleResIds)){
				jo.put("checked",false);
			}
			ja.add(jo);
		}
		LogKit.info(ja.toJSONString());
		return ja.toJSONString();
	}

	public boolean getChildren(JSONObject jsonObject, List<Long> roleResIds) {
		int id = jsonObject.getIntValue("id");
		List<Res> list = dao.find("select * from s_res where pId=? order by seq", id);
		boolean  is =false;
		if (!list.isEmpty()) {
			JSONArray ja = new JSONArray();
			JSONObject jo;
			for (Res res : list) {
				jo = new JSONObject();
				jo.put("id", res.getId());
				jo.put("pId", res.getPid());
				jo.put("title", res.getName());
				jo.put("expand", true);
				jo.put("url", res.getUrl());
				jo.put("seq", res.getSeq());
				boolean n =(roleResIds != null && roleResIds.contains(res.getId())) ? true : false;
				if (!n){
					is =true;
				}
				jo.put("checked", n);
				jo.put("description", res.getDescription());
				jo.put("logged", res.getLogged());
				ja.add(jo);
				dao.getChildren(jo, roleResIds);
			}
			jsonObject.put("children", ja);
		}
		return is;

	}

	public List<Res> getChildren() {
		List<Res> list = dao.findByCache(Consts.CACHE_NAMES.userReses.name(), "getResChildren_" + get("roleId")+"_"+getId(),
				"select r.*,rr.roleId as roleId from s_res r left join s_role_res rr on r.id=rr.resId where r.pId=? and rr.roleId=? order by r.seq", getId(),get("roleId"));
		return list;
	}

	public List<Res> findResesByUserId(BigInteger userId) {
		List<Role> roleList = Role.dao.findRolesByUserId(userId);
		int i = 0;
		String p = null;
		for (Role r : roleList) {
			if (p == null)
				p = r.getId().toString();
			else
				p = p + "," + r.getId().toString();
		}

		List<Res> list = Res.dao.findByCache(Consts.CACHE_NAMES.userReses.name(), "findResesByUserId_"+userId,
				"select r.*,rr.roleId as roleId from s_res r left join s_role_res rr on r.id=rr.resId  where rr.roleId in (?) and r.pid=0 order by r.seq",
				p);

		return list;
	}

	public List<Res> findSecResesByUserId(BigInteger userId, long rId) {

		List<Role> roleList = Role.dao.findRolesByUserId(userId);
		int i = 0;
		String p = null;
		for (Role r : roleList) {
			if (p == null)
				p = r.getId().toString();
			else
				p = p + "," + r.getId().toString();
		}

		List<Res> list = Res.dao.findByCache(Consts.CACHE_NAMES.userReses.name(), userId + "" + rId,
				"select r.* from s_res r left join s_role_res rr on r.id=rr.resId  where rr.roleId in (?) and r.pid=? order by r.seq",
				p, rId);
		return list;
	}

	public Set<String> findAllResStrByUserId(BigInteger userId){
		Set<String> allRes=new HashSet<>();
		List<Res> list=findResesByUserId(userId);
		for (Res res:list){
			allRes.add(res.getUrl());
			getAllResStr(allRes,res);
		}
		return allRes;
	}
	private void getAllResStr(Set<String> allRes, Res res){
		if (!res.getChildren().isEmpty()){
			List<Res> children=res.getChildren();
			for (Res res1:children){
				allRes.add(res1.getUrl());
				getAllResStr(allRes,res1);
			}
		}
	}

	public Set<Res> findAllResByUserId(BigInteger userId){
		Set<Res> allRes=new HashSet<>();
		List<Res> list=findResesByUserId(userId);
		for (Res res:list){
			allRes.add(res);
			getAllRes(allRes,res);
		}
		return allRes;
	}

	private void getAllRes(Set<Res> allRes, Res res){
		if (!res.getChildren().isEmpty()){
			List<Res> children=res.getChildren();
			for (Res res1:children){
				allRes.add(res1);
				getAllRes(allRes,res1);
			}
		}
	}

	@Override
	public String getTableName() {
		return "s_res";
	}
}

