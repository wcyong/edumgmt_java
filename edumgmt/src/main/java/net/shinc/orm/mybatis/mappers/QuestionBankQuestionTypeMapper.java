package net.shinc.orm.mybatis.mappers;

import net.shinc.orm.mybatis.bean.QuestionBankQuestionTypeKey;

/** 
 * @ClassName QuestionBankQuestionTypeMapper 
 * @Description TODO
 * @author guoshijie 
 * @date 2015年7月31日 下午5:00:42  
 */
public interface QuestionBankQuestionTypeMapper {
    int deleteByPrimaryKey(QuestionBankQuestionTypeKey key);

    int insert(QuestionBankQuestionTypeKey record);

    int insertSelective(QuestionBankQuestionTypeKey record);
}