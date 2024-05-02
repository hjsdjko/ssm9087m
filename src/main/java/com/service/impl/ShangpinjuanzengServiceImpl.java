package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangpinjuanzengDao;
import com.entity.ShangpinjuanzengEntity;
import com.service.ShangpinjuanzengService;
import com.entity.vo.ShangpinjuanzengVO;
import com.entity.view.ShangpinjuanzengView;

@Service("shangpinjuanzengService")
public class ShangpinjuanzengServiceImpl extends ServiceImpl<ShangpinjuanzengDao, ShangpinjuanzengEntity> implements ShangpinjuanzengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinjuanzengEntity> page = this.selectPage(
                new Query<ShangpinjuanzengEntity>(params).getPage(),
                new EntityWrapper<ShangpinjuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinjuanzengEntity> wrapper) {
		  Page<ShangpinjuanzengView> page =new Query<ShangpinjuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinjuanzengVO> selectListVO(Wrapper<ShangpinjuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinjuanzengVO selectVO(Wrapper<ShangpinjuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinjuanzengView> selectListView(Wrapper<ShangpinjuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinjuanzengView selectView(Wrapper<ShangpinjuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
