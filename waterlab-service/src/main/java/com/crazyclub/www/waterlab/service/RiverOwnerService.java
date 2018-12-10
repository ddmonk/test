package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.RiverOwner;

import java.util.List;

/**
 * 河长信息
 */

public interface RiverOwnerService {

    List<RiverOwner> listAll();

    RiverOwner findByUserName(String userName);

    RiverOwner findByRiverName(String riverName);

    RiverOwner findByOwnerId(int id);

    int save(RiverOwner owner);

    int deleteById(int id);

    int delete(RiverOwner owner);

}
