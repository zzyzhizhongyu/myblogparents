package com.zzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzy.pojo.Admin;

public interface AdminMapper extends BaseMapper<Admin> {
    //select("select * from ms_permission where id in (select permission_id from ms_admin_permission where admin_id=#{adminId})")
}
