package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.PromoDo;

public interface PromoDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Tue Dec 25 16:32:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Tue Dec 25 16:32:44 CST 2018
     */
    int insert(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Tue Dec 25 16:32:44 CST 2018
     */
    int insertSelective(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Tue Dec 25 16:32:44 CST 2018
     */
    PromoDo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Tue Dec 25 16:32:44 CST 2018
     */
    int updateByPrimaryKeySelective(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Tue Dec 25 16:32:44 CST 2018
     */
    int updateByPrimaryKey(PromoDo record);

    PromoDo selectByItemId(Integer itemId);
}