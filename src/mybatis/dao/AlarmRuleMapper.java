package dao;

import model.AlarmRule;

public interface AlarmRuleMapper {
    int insert(AlarmRule record);

    int insertSelective(AlarmRule record);

    AlarmRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AlarmRule record);

    int updateByPrimaryKey(AlarmRule record);
}